package com.zhita.service.login;

import com.zhita.model.manage.User;

public interface LoginService {

	User findphone(String phone, Integer companyId);

	int insertUser(String phone, String loginStatus, Integer companyId, String registrationType, String registrationTime,
			Integer drainageOfPlatformId, String useMarket);

	int getId(String phone, Integer companyId);

	int updateStatus(String loginStatus, String phone, Integer companyId, String loginTime);

	int insertUserByPwd(String phone, String loginStatus, Integer companyId, String registrationType,
			String registrationTime, Integer drainageOfPlatformId, String useMarket, String pwd);

	String getMd5pwd(String phone, Integer companyId);

	int updateStatusByPwd(String loginStatus, String phone, Integer companyId, String loginTime, String md5Pwd);

}
