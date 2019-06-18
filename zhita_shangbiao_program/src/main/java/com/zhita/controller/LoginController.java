package com.zhita.controller;

import java.io.UnsupportedEncodingException;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.Security;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.zhita.model.manage.User;
import com.zhita.service.login.LoginService;
import com.zhita.util.AESUtil;
import com.zhita.util.PostAndGet;
import com.zhita.util.RedisClientUtil;
import com.zhita.util.SMSUtil;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	@Autowired
	LoginService loginService;

	// 微信登录
	@RequestMapping("/WXlogin")
	@ResponseBody
	public Map<String, Object> getPhoneNumber(String code, Integer companyId) {
		int num = 0;
		int number = 0;
		Map<String, Object> map = new HashMap<>();
		if (StringUtils.isEmpty(code) || StringUtils.isEmpty(companyId)) {
			map.put("msg", "code,companyId不能为空");
			map.put("SCode", "401");
			return map;
		} else {
			PostAndGet pGet = new PostAndGet();
			String string = pGet.sendGet(
					"https://api.weixin.qq.com/sns/jscode2session?js_code=" + code + "&appid=wx95e29f36ef71f6a2"
							+ "&secret=db67bd09f1ebed05dbd0d5d384b14a84" + "&grant_type=authorization_code");
			JSONObject jsonObject = JSON.parseObject(string);
			String openId = (String) jsonObject.get("openid");// 获取openid
//			String openId = "o9dX15UdHy9lgQZxmqZws_PqmwXQ";
			String registrationTime = System.currentTimeMillis() + ""; // 获取当前时间戳
			num = loginService.getOpenId(openId, companyId);// 查看这个用户是否登录过
			if (num == 0) {
				number = loginService.setUser(openId, companyId, registrationTime);
				if (number == 1) {
					int id = loginService.getId(openId, companyId); // 获取该用户的id
					map.put("msg", "用户登录成功，数据插入成功");
					map.put("SCode", "200");
					map.put("loginStatus", "1");
					map.put("userId", id);
				} else {
					map.put("msg", "用户登录失败，用户数据插入失败");
					map.put("SCode", "405");
				}
			} else {
				number = loginService.updateUser(openId, companyId, registrationTime);
				if (number == 1) {
					int id = loginService.getId(openId, companyId); // 获取该用户的id
					map.put("msg", "用户登录成功，登录状态修改成功");
					map.put("SCode", "200");
					map.put("loginStatus", "1");
					map.put("userId", id);
				} else {
					map.put("msg", "用户登录失败，登录状态修改失败");
					map.put("SCode", "405");
				}

			}
			return map;
		}

	}

	// 退出登录
	@RequestMapping("/logOut")
	@ResponseBody
	@Transactional
	public Map<String, String> logOut(int userId,Integer companyId) {
		Map<String, String> map = new HashMap<>();
		if (StringUtils.isEmpty(userId) || StringUtils.isEmpty(companyId)) {
			map.put("msg", "userId和companyId不能为空");
			return map;
			}else {
				String loginStatus = "0";
				int number = loginService.updatelogOutStatus(loginStatus,userId,companyId);
				if (number == 1) {														
					map.put("msg", "用户退出成功，登录状态修改成功");
					map.put("SCode", "200");
					map.put("loginStatus", loginStatus);
				} else {
					map.put("msg", "用户退出失败，登录状态修改失败");
					map.put("SCode", "408");
				}
			}

		return map;

	}
//	
//	
//	// 判断用户是否登录
//	@RequestMapping("/islogin")
//	@ResponseBody
//	public Map<String, String> islogin(String openId, String company) {
//		Map<String, String> map = new HashMap<>();
//		if (StringUtils.isEmpty(openId)) {
//			map.put("msg", "openId不能为空");
//			return map;
//			}else {
//				String loginStatus = intLoginService.getLoginStatus(openId,company);
//				if(loginStatus==null) {
//					map.put("msg","该用户还未注册");
//					map.put("code","2");
//				}
//				if("0".equals(loginStatus)) {
//					map.put("msg","该用户未登录");
//					map.put("code","0");
//				}				
//				if("1".equals(loginStatus)) {
//					String userId = intLoginService.getUserId(openId,company);
//					String phone = intLoginService.getPhone(openId,company);
//					PhoneDeal phoneDeal = new PhoneDeal();			
//					String newPhone = phoneDeal.decryption(phone);
//					map.put("msg","该用户已登录");
//					map.put("code","1");
//					map.put("userId", userId);
//					map.put("phone", newPhone);
//				}
//			}
//
//		return map;
//
//	}

}