package com.zhita.controller.login;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhita.model.manage.User;
import com.zhita.service.login.LoginService;
import com.zhita.util.MD5Util;
import com.zhita.util.RedisClientUtil;
import com.zhita.util.SMSUtil;

@Controller
@RequestMapping("/applogin")
public class LoginController {
	@Autowired
	LoginService loginService;

	// 发送验证码
	@RequestMapping("/sendSMS")
	@ResponseBody
	public Map<String, String> sendSMS(String phone, String company) {
		Map<String, String> map = new HashMap<>();
		SMSUtil smsUtil = new SMSUtil();
		String state = smsUtil.sendSMS(phone, "json", company);
		map.put("msg", state);
		return map;
	}

//	// 忘记密码
//	/**
//	 * @param phone 手机号
//	 * @param pwd   密码
//	 * @param code  验证码
//	 * @return
//	 */
//	@RequestMapping("/forgotpwd")
//	@ResponseBody
//	@Transactional
//	public Map<String, Object> forgotpwd(String phone, String pwd, String code, String company, String oneSourceName,
//			String twoSourceName) {
//		Map<String, Object> map = new HashMap<String, Object>();
//		if (StringUtils.isEmpty(phone) || StringUtils.isEmpty(pwd) || StringUtils.isEmpty(code)) {
//			map.put("msg", "phone,pwd或code不能为空");
//			map.put("SCode", "401");
//			return map;
//		} else {
//			RedisClientUtil redisClientUtil = new RedisClientUtil();
//			String key = phone + "Key";
//			String redisCode = redisClientUtil.get(key);
//			if (redisCode == null) {
//				map.put("msg", "验证码已过期，请重新发送");
//				map.put("SCode", "402");
//				return map;
//			}
//			if (redisCode.equals(code)) {
//				redisClientUtil.delkey(key);// 验证码正确就从redis里删除这个key
//				MD5Util md5Util = new MD5Util();
//				String md5Pwd = md5Util.EncoderByMd5(pwd);
//				int number = loginService.updatePwd(phone, md5Pwd, company);
//				if (number == 1) {
//					int id = loginService.getId(phone, company); // 获取该用户的id
//					map.put("msg", "密码修改成功");
//					map.put("userId", id);
//					map.put("phone", phone);
//					map.put("SCode", "200");
//				} else {
//					map.put("msg", "密码修改失败");
//					map.put("SCode", "405");
//				}
//			} else {
//				map.put("msg", "验证码输入错误");
//				map.put("SCode", "403");
//			}
//		}
//
//		return map;
//
//	}

	//密码登录
	/**
	 * @param phone 手机号
	 * @param pwd   密码
	 * @param companyId  公司id
	 * @param registrationType  软件类型
	 * @param drainageOfPlatformId  引流平台id
	 * @param useMarket  应用市场
	 * @return
	 */
	@RequestMapping("/pwdlogin")
	@ResponseBody
	@Transactional
	public Map<String, Object> pwdLogin(String phone, String pwd,Integer companyId, String registrationType,
			Integer drainageOfPlatformId, String useMarket) {
		Map<String, Object> map = new HashMap<String, Object>();
		String loginStatus = "1";
		if (StringUtils.isEmpty(phone) || StringUtils.isEmpty(pwd) || StringUtils.isEmpty(companyId) || StringUtils.isEmpty(registrationType) || StringUtils.isEmpty(drainageOfPlatformId) || StringUtils.isEmpty(useMarket)) {
			map.put("msg", "phone,pwd,companyId,registrationType,drainageOfPlatformId或useMarket不能为空");
			return map;
		} else {
			MD5Util md5Util = new MD5Util();
			String Md5Pwd = md5Util.EncoderByMd5(pwd); // md5加密
			String registrationTime = System.currentTimeMillis() + ""; // 获取当前时间戳
			User user = loginService.findphone(phone, companyId); // 判断该用户是否存在
			if (user == null) {
				int number = loginService.insertUserByPwd(phone, loginStatus, companyId, registrationType,
						registrationTime, drainageOfPlatformId, useMarket,Md5Pwd);
				if (number == 1) {
					int id = loginService.getId(phone, companyId); // 获取该用户的id
					map.put("msg", "用户登录成功，数据插入成功");
					map.put("SCode", "200");
					map.put("loginStatus", loginStatus);
					map.put("userId", id);
					map.put("phone", phone);
				} else {
					map.put("msg", "用户登录失败，用户数据插入失败");
					map.put("SCode", "405");
				}
			} else {
				String dataMd5Pwd = loginService.getMd5pwd(phone, companyId);
				if(dataMd5Pwd==null) {
					String loginTime = System.currentTimeMillis() + "";
					int num = loginService.updateStatusByPwd(loginStatus, phone, companyId,loginTime,Md5Pwd);
					if (num == 1) {
						int id = loginService.getId(phone, companyId); // 获取该用户的id
						map.put("msg", "用户登录成功，登录状态修改成功");
						map.put("SCode", "200");
						map.put("loginStatus", loginStatus);
						map.put("userId", id);
						map.put("phone", phone);
					} else {
						map.put("msg", "用户登录失败，登录状态修改失败");
						map.put("SCode", "406");
					}
				}else {
					if (Md5Pwd.equals(dataMd5Pwd)) {
						String loginTime = System.currentTimeMillis() + "";
						int num = loginService.updateStatus(loginStatus, phone, companyId, loginTime);
						if (num == 1) {
							int id = loginService.getId(phone, companyId); // 获取该用户的id
							map.put("msg", "用户登录成功，登录状态修改成功");
							map.put("SCode", "200");
							map.put("loginStatus", loginStatus);
							map.put("userId", id);
							map.put("phone", phone);
						} else {
							map.put("msg", "用户登录失败，登录状态修改失败");
							map.put("SCode", "406");
						}
					} else {
						map.put("msg", "密码错误");
						map.put("SCode", "403");
						return map;
					}
				}

			}

		}

		return map;

	}

	// 验证码登陆
	/**
	 * @param phone                手机号
	 * @param code                 验证码
	 * @param companyId            公司id
	 * @param registrationType     软件类型
	 * @param drainageOfPlatformId 引流平台id
	 * @param useMarket            应用市场
	 * @return
	 */
	@RequestMapping("/codelogin")
	@ResponseBody
	@Transactional
	public Map<String, Object> codeLogin(String phone, String code, Integer companyId, String registrationType,
			Integer drainageOfPlatformId, String useMarket) {
		Map<String, Object> map = new HashMap<String, Object>();
		String loginStatus = "1";
		if (StringUtils.isEmpty(phone) || StringUtils.isEmpty(code) || StringUtils.isEmpty(companyId)
				|| StringUtils.isEmpty(registrationType) || StringUtils.isEmpty(drainageOfPlatformId)
				|| StringUtils.isEmpty(useMarket)) {
			map.put("msg", "phone,code,companyId,registrationType,drainageOfPlatformId,useMarket不能为空");
			return map;
		} else {
			RedisClientUtil redisClientUtil = new RedisClientUtil();
			String key = "xiaodai" + phone + "Key";
			String redisCode = redisClientUtil.get(key);
			if (redisCode == null) {
				map.put("msg", "验证码已过期，请重新发送");
				map.put("SCode", "402");
				return map;
			}
			if (redisCode.equals(code)) {
				redisClientUtil.delkey(key);// 验证码正确就从redis里删除这个key
				String registrationTime = System.currentTimeMillis() + ""; // 获取当前时间戳
				User user = loginService.findphone(phone, companyId); // 判断该用户是否存在
				if (user == null) {
					int number = loginService.insertUser(phone, loginStatus, companyId, registrationType,
							registrationTime, drainageOfPlatformId, useMarket);
					if (number == 1) {
						int id = loginService.getId(phone, companyId); // 获取该用户的id
						map.put("msg", "用户登录成功，数据插入成功");
						map.put("SCode", "200");
						map.put("loginStatus", loginStatus);
						map.put("userId", id);
						map.put("phone", phone);
					} else {
						map.put("msg", "用户登录失败，用户数据插入失败");
						map.put("SCode", "405");
					}
				} else {
					String loginTime = System.currentTimeMillis() + "";
					int num = loginService.updateStatus(loginStatus, phone, companyId, loginTime);
					if (num == 1) {
						int id = loginService.getId(phone, companyId); // 获取该用户的id
						map.put("msg", "用户登录成功，登录状态修改成功");
						map.put("SCode", "200");
						map.put("loginStatus", loginStatus);
						map.put("userId", id);
						map.put("phone", phone);

					} else {
						map.put("msg", "用户登录失败，登录状态修改失败");
						map.put("SCode", "406");
					}
				}
			} else {
				map.put("msg", "验证码错误");
				map.put("SCode", "403");
				return map;
			}

			return map;
		}

	}

//	// 退出登录
//	/**
//	 * @param phone 手机号
//	 * @param code  验证码
//	 * @return
//	 */
//	@RequestMapping("/logOut")
//	@ResponseBody
//	@Transactional
//	public Map<String, String> appLogOut(int userId, String company, String oneSourceName, String twoSourceName) {
//		Map<String, String> map = new HashMap<>();
//		if (StringUtils.isEmpty(userId)) {
//			map.put("msg", "userId不能为空");
//			return map;
//		} else {
//			String loginStatus = "0";
//			int number = loginService.updatelogOutStatus(loginStatus, userId, company);
//			if (number == 1) {
//				map.put("msg", "用户退出成功，登录状态修改成功");
//				map.put("SCode", "200");
//				map.put("loginStatus", loginStatus);
//			} else {
//				map.put("msg", "用户退出失败，登录状态修改失败");
//				map.put("SCode", "400");
//			}
//		}
//
//		return map;
//
//	}

}
