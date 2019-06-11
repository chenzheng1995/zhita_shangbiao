package com.zhita.dao.manage;

import org.apache.ibatis.annotations.Param;

import com.zhita.model.manage.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

	User findphone(@Param("phone")String phone,@Param("companyId") Integer companyId);

	int insertUser(@Param("phone")String phone,@Param("loginStatus") String loginStatus,@Param("companyId") Integer companyId,@Param("registrationType") String registrationType,@Param("registrationTime") String registrationTime,
			@Param("drainageOfPlatformId")Integer drainageOfPlatformId,@Param("useMarket") String useMarket);

	int getId(@Param("phone")String phone,@Param("companyId") Integer companyId);

	int updateStatus(@Param("loginStatus")String loginStatus, @Param("phone")String phone, @Param("companyId")Integer companyId,@Param("loginTime") String loginTime);

	int insertUserByPwd(@Param("phone")String phone,@Param("loginStatus") String loginStatus,@Param("companyId") Integer companyId,@Param("registrationType") String registrationType,@Param("registrationTime") String registrationTime,
			@Param("drainageOfPlatformId")Integer drainageOfPlatformId,@Param("useMarket") String useMarket,@Param("pwd") String pwd);

	String getMd5pwd(@Param("phone")String phone,@Param("companyId") Integer companyId);

	int updateStatusByPwd(@Param("loginStatus")String loginStatus,@Param("phone") String phone,@Param("companyId") Integer companyId,@Param("loginTime") String loginTime,@Param("md5Pwd") String md5Pwd);
}