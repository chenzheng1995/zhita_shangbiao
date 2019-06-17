package com.zhita.service.manage.sysuser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhita.dao.manage.CompanyMapper;
import com.zhita.dao.manage.SysUserMapper;
import com.zhita.model.manage.Company;
import com.zhita.model.manage.SysUser;
import com.zhita.util.Timestamps;
@Service
public class SysuserServiceImp implements IntSysuserService{
	@Autowired
	private SysUserMapper sysUserMapper;
	@Autowired
	private CompanyMapper companyMapper;
	
	//后台管理---添加账号
   public int insert(SysUser record) throws ParseException{
	   Date d=new Date();
	   SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   String date=sf.format(d);
	   String dateStamps=Timestamps.dateToStamp1(date);//获取当前系统时间    将时间转换为时间戳
	   
	   record.setOperationtime(dateStamps);//获取当前系统时间赋值给操作时间
	   int num=sysUserMapper.insert(record);
	   return num;
   }
   
   //后台管理---查询所有公司
   public List<Company> queryAll(){
	   List<Company> list=companyMapper.queryAll();
	   return list;
   }
   
   //后台管理--查询系统用户表所有信息
   public List<SysUser> queryAllSysuser(){
	   List<SysUser> list=sysUserMapper.queryAllSysuser();
	   for (int i = 0; i < list.size(); i++) {
		   list.get(i).setOperationtime(Timestamps.stampToDate(list.get(i).getOperationtime()));//操作时间    把时间戳改为时间格式（年月日时分秒）
	   }
	   return list;
   }
   
   //后台管理---根据主键id查询系统用户信息
   public SysUser selectByPrimaryKey(Integer id){
	   SysUser sysUser=sysUserMapper.selectByPrimaryKey(id);
	   return sysUser;
   }
   
   //后台管理---对修改后的系统用户信息进行保存
   public int updateByPrimaryKey(SysUser record) throws ParseException{
	   Date d=new Date();
	   SimpleDateFormat sf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	   String date=sf.format(d);
	   String dateStamps=Timestamps.dateToStamp1(date);//获取当前系统时间    将时间转换为时间戳
	   
	   record.setOperationtime(dateStamps);//获取当前系统时间赋值给操作时间
	   int num=sysUserMapper.updateByPrimaryKey(record);
	   return num;
   }
   
   //后台管理---修改假删除状态
   public int updateFalseDel(Integer id){
	   int num=sysUserMapper.updateFalseDel(id);
	   return num;
   }
   
   //后台管理---查询该账号是否存在
   public SysUser queryByAccount(String account){
	   SysUser sysUser=sysUserMapper.queryByAccount(account);
	   return sysUser;
   }
   
   //后台管理---登录成功  修改登录状态和登录时间字段
   public int updateStatusAndTime(SysUser sysUser){
	   int num=sysUserMapper.updateStatusAndTime(sysUser);
	   return num;
   }
   
   //后台管理---退出登录
   public int updateLoginStatus(String status,Integer id){
	   int num=sysUserMapper.updateLoginStatus(status, id);
	   return num;
   }
}
