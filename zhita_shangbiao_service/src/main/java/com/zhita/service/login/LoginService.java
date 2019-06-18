package com.zhita.service.login;


public interface LoginService {

	int getOpenId(String openId, Integer companyId);

	int setUser(String openId, Integer companyId, String registrationTime);

	int getId(String openId, Integer companyId);

	int updateUser(String openId, Integer companyId, String registrationTime);

	int updatelogOutStatus(String loginStatus, int userId, Integer companyId);
	
}
