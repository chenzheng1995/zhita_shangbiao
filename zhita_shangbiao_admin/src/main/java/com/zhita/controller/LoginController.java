package com.zhita.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhita.model.manage.SysUser;
import com.zhita.service.manage.sysuser.IntSysuserService;

@Controller
@RequestMapping("/admin_login")
public class LoginController {
	@Autowired
	private IntSysuserService intSysuserService;
	
	@ResponseBody
	@RequestMapping("/login")
	public Map<String, Object> login(String account,String pwd){
		Map<String, Object> map = new HashMap<String, Object>();
		if (StringUtils.isEmpty(account) || StringUtils.isEmpty(pwd)) {
			map.put("msg", "账号或密码不能为空");
		}else {
			SysUser sysUser=intSysuserService.queryByAccount(account);// 判断该用户是否存在
			 if(sysUser==null) {
				 map.put("msg", "账号不存在");
			 }else {
				 if(pwd.equals(sysUser.getPwd())) {
					 String loginStatus="1";
					 String loginTime = System.currentTimeMillis()+"";  //获取当前时间戳
					 int sysUserId=sysUser.getId();
					 SysUser sysUser1=new SysUser(sysUserId, loginStatus, loginTime);
					 
					 int num=intSysuserService.updateStatusAndTime(sysUser1);
					 if(num==1){
						 map.put("msg", "用户登录成功，登录状态修改成功");
						 map.put("loginStatus", "1");//1：返给前端1  代表登录成功        0：返给前端0   代表未登录
						 map.put("account", sysUser.getAccount());
						 map.put("companyId", sysUser.getCompanyid());
					 }
				 }else{
					 map.put("msg", "密码错误");
				 }
			 }
		}
		return map;
	}
	
	// 退出登录
	@ResponseBody
	@RequestMapping("/logOut")
	public Map<String, String> logOut(int userId) {
		Map<String, String> map = new HashMap<>();
		if (StringUtils.isEmpty(userId)) {
			map.put("msg", "userId不能为空");
			return map;
		}else {
			String loginStatus = "0";//登录状态为0  表示未登录
			int num=intSysuserService.updateLoginStatus(loginStatus, userId);
			if (num == 1) {														
				map.put("msg", "用户退出成功，登录状态修改成功");
				map.put("loginStatus", loginStatus);
			} else {
				map.put("msg", "用户退出失败，登录状态修改失败");
			}
		}
		return map;
	}
}
