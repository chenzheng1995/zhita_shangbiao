package com.zhita.service.manage.sysuser;

import java.text.ParseException;
import java.util.List;

import com.zhita.model.manage.Company;
import com.zhita.model.manage.SysUser;

public interface IntSysuserService {
	
	//后台管理---添加账号
    int insert(SysUser record) throws ParseException;
    
    //后台管理---查询所有公司
    List<Company> queryAll();
    
    //后台管理--查询系统用户表所有信息
    List<SysUser> queryAllSysuser();
    
    //后台管理---根据主键id查询系统用户信息
    SysUser selectByPrimaryKey(Integer id);
    
    //后台管理---对修改后的系统用户信息进行保存
    int updateByPrimaryKey(SysUser record) throws ParseException;
    
    //后台管理---修改假删除状态
    int updateFalseDel(Integer id);
    
    //后台管理---查询该账号是否存在
    SysUser queryByAccount(String account);
    
    //后台管理---登录成功  修改登录状态和登录时间字段
    int updateStatusAndTime(SysUser sysUser);
    
    //后台管理---退出登录
    int updateLoginStatus(String status,Integer id);
}
