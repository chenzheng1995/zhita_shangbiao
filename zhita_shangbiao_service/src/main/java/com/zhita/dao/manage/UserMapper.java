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

	int getOpenId(@Param("openId")String openId,@Param("companyId") Integer companyId);

	int setUser(@Param("openId")String openId,@Param("companyId") Integer companyId,@Param("registrationTime") String registrationTime);

	int getId(@Param("openId")String openId,@Param("companyId") Integer companyId);

	int updateUser(@Param("openId") String openId,@Param("companyId") Integer companyId,@Param("registrationTime") String registrationTime);

	int updatelogOutStatus(@Param("loginStatus")String loginStatus,@Param("userId") int userId,@Param("companyId") Integer companyId);
}