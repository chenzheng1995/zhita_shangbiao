package com.zhita.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zhita.dao.manage.UserMapper;

@Service(value="loginServiceImp")
public class LoginServiceImp implements LoginService{

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public int getOpenId(String openId,Integer companyId) {
		int num = userMapper.getOpenId(openId,companyId);
		return num;
	}

	@Override
	public int setUser(String openId, Integer companyId, String registrationTime) {
		int number = userMapper.setUser(openId,companyId,registrationTime);
		return number;
	}

	@Override
	public int getId(String openId, Integer companyId) {
		int id = userMapper.getId(openId,companyId);
		return id;
	}

	@Override
	public int updateUser(String openId, Integer companyId, String registrationTime) {
		int number = userMapper.updateUser(openId,companyId,registrationTime);
		return number;
	}

	@Override
	public int updatelogOutStatus(String loginStatus, int userId, Integer companyId) {
		int number = userMapper.updatelogOutStatus(loginStatus,userId,companyId);
		return number;
	}

}
