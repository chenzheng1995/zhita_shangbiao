package com.zhita.service.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhita.dao.manage.UserMapper;
import com.zhita.model.manage.User;

@Service
public class LoginServiceImp implements LoginService{

	@Autowired
	UserMapper userMapper;

	@Override
	public User findphone(String phone, Integer companyId) {
		User user = userMapper.findphone(phone,companyId); // 判断该用户是否存在
		return user;
	}

	@Override
	public int insertUser(String phone, String loginStatus, Integer companyId, String registrationType,
			String registrationTime, Integer drainageOfPlatformId, String useMarket) {
		int number = userMapper.insertUser(phone,loginStatus,companyId,registrationType,registrationTime,drainageOfPlatformId,useMarket);
		return number;
	}

	@Override
	public int getId(String phone, Integer companyId) {
		int id = userMapper.getId(phone,companyId); //获取该用户的id	
		return id;
	}

	@Override
	public int updateStatus(String loginStatus, String phone, Integer companyId, String loginTime) {
		int num = userMapper.updateStatus(loginStatus, phone, companyId, loginTime);
		return num;
	}

	@Override
	public int insertUserByPwd(String phone, String loginStatus, Integer companyId, String registrationType,
			String registrationTime, Integer drainageOfPlatformId, String useMarket, String pwd) {
		int number = userMapper.insertUserByPwd(phone, loginStatus, companyId, registrationType,
				registrationTime, drainageOfPlatformId, useMarket,pwd);
		return number;
	}

	@Override
	public String getMd5pwd(String phone, Integer companyId) {
		String dataMd5Pwd = userMapper.getMd5pwd(phone, companyId);
		return dataMd5Pwd;
	}

	@Override
	public int updateStatusByPwd(String loginStatus, String phone, Integer companyId, String loginTime, String md5Pwd) {
		int num = userMapper.updateStatusByPwd(loginStatus, phone, companyId,loginTime,md5Pwd);
		return num;
	}
}
