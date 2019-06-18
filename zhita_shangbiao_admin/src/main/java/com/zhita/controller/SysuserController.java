package com.zhita.controller;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhita.model.manage.Company;
import com.zhita.model.manage.SysUser;
import com.zhita.service.manage.sysuser.IntSysuserService;
import com.zhita.util.ListPageUtil;
import com.zhita.util.PageUtil;

@Controller
@RequestMapping("/sysuser")
public class SysuserController {
	@Autowired
	private IntSysuserService intSysuserService;
	
	//后台管理--查询系统用户表所有信息
	@ResponseBody
	@RequestMapping("/queryAllSysuser")
	public Map<String,Object> queryAllSysuser(Integer companyId,Integer page){
		List<SysUser> listto=new ArrayList<>();
		List<SysUser> list=intSysuserService.queryAllSysuser(companyId);
		
		ListPageUtil listPageUtil=new ListPageUtil(list,page,10);
		listto.addAll(listPageUtil.getData());
		
		PageUtil pageUtil=new PageUtil(listPageUtil.getCurrentPage(), listPageUtil.getPageSize(),listPageUtil.getTotalCount());
		
		Map<String,Object> map=new HashMap<>();
		map.put("listsysuser", listto);
		map.put("pageutil", pageUtil);
		return map;
	}
	
	
	//后台管理---查询所有公司
	@ResponseBody
	@RequestMapping("/queryAllCompany")
	public List<Company> queryAllCompany(){
		List<Company> list=intSysuserService.queryAll();
		return list;
	}
	
	//后台管理---添加账号
	@ResponseBody
	@RequestMapping("/insert")
	public int insert(SysUser sysUser) throws ParseException{
		int num=intSysuserService.insert(sysUser);
		return num;
	}
	
	 //后台管理---根据主键id查询系统用户信息
	@ResponseBody
	@RequestMapping("/selectByPrimaryKey")
	 public SysUser selectByPrimaryKey(Integer id){
		 SysUser sysUser=intSysuserService.selectByPrimaryKey(id);
		 return sysUser;
	 }
	 
	//后台管理---对修改后的系统用户信息进行保存
	@ResponseBody
	@RequestMapping("/updateByPrimaryKey")
	public int updateByPrimaryKey(SysUser record) throws ParseException{
		int num=intSysuserService.updateByPrimaryKey(record);
		return num;
	}
	
	//后台管理---修改假删除状态
	@ResponseBody
	@RequestMapping("/updateFalseDel")
	public int updateFalseDel(Integer id){
		int num=intSysuserService.updateFalseDel(id);
		return num;
	}
}
