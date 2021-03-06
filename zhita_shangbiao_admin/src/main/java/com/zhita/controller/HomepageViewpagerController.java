package com.zhita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhita.model.manage.Company;
import com.zhita.model.manage.HomepageViewpager;
import com.zhita.service.manage.homepage.IntHomepageService;
import com.zhita.service.manage.sysuser.IntSysuserService;

@Controller
@RequestMapping("/homepage")
public class HomepageViewpagerController {
	@Autowired
	private IntHomepageService intHomepageService;
	
	@Autowired
	private IntSysuserService intSysuserService;
	
	//后台管理---查询首页轮播图所有信息
	@ResponseBody
	@RequestMapping("/queryAll")
	public List<HomepageViewpager> queryAll(Integer companyId){
		List<HomepageViewpager> list=intHomepageService.queryAll(companyId);
		return list;
	}
	
	//后台管理---查询所有公司
	@ResponseBody
	@RequestMapping("/queryAllCompany")
	public List<Company> queryAllCompany(){
		List<Company> list=intSysuserService.queryAll();
		return list;
	}
	
	//后台管理---添加首页轮播图信息
	@ResponseBody
	@RequestMapping("/intset")
	public int insert(HomepageViewpager homepageViewpager){
		int num=intHomepageService.insert(homepageViewpager);
		return num;
	}
	
	//后台管理---根据主键id查询当前对象信息
	@ResponseBody
	@RequestMapping("/selectByPrimaryKey")
    public HomepageViewpager selectByPrimaryKey(Integer id){
    	HomepageViewpager homepageViewpager=intHomepageService.selectByPrimaryKey(id);
    	return homepageViewpager;
    }
	
	//后台管理---对当前对象进行修改保存
	@ResponseBody
	@RequestMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(HomepageViewpager record){
    	int num=intHomepageService.updateByPrimaryKey(record);
    	return num;
    }

    
    //后台管理---修改当前对象的假删除状态
	@ResponseBody
	@RequestMapping("/upaFalseDel")
    public int upaFalseDel(Integer id){
    	int num=intHomepageService.upaFalseDel(id);
    	return num;
    }
    
    //后台管理---修改当前对象为置顶
	@ResponseBody
	@RequestMapping("/upaIsStick")
    public int upaIsStick(Integer id){
    	int num=intHomepageService.upaIsStick(id);
    	return num;
    }
}
