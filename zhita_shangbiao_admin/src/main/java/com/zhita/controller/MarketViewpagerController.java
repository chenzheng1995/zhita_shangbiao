package com.zhita.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhita.model.manage.Company;
import com.zhita.model.manage.MarketViewpager;
import com.zhita.service.manage.market.IntMarketService;
import com.zhita.service.manage.sysuser.IntSysuserService;

@Controller
@RequestMapping("/market")
public class MarketViewpagerController {
	@Autowired
	private IntMarketService intMarketService;
	
	@Autowired
	private IntSysuserService intSysuserService;
	
	//后台管理---查询首页轮播图所有信息
	@ResponseBody
	@RequestMapping("/queryAll")
	public List<MarketViewpager> queryAll(Integer companyId){
		List<MarketViewpager> list=intMarketService.queryAll(companyId);
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
	public int insert(MarketViewpager marketViewpager){
		int num=intMarketService.insert(marketViewpager);
		return num;
	}
	
	//后台管理---根据主键id查询当前对象信息
	@ResponseBody
	@RequestMapping("/selectByPrimaryKey")
    public MarketViewpager selectByPrimaryKey(Integer id){
		MarketViewpager marketViewpager=intMarketService.selectByPrimaryKey(id);
    	return marketViewpager;
    }
	
	//后台管理---对当前对象进行修改保存
	@ResponseBody
	@RequestMapping("/updateByPrimaryKey")
    public int updateByPrimaryKey(MarketViewpager record){
    	int num=intMarketService.updateByPrimaryKey(record);
    	return num;
    }

    
    //后台管理---修改当前对象的假删除状态
	@ResponseBody
	@RequestMapping("/upaFalseDel")
    public int upaFalseDel(Integer id){
    	int num=intMarketService.upaFalseDel(id);
    	return num;
    }
    
    //后台管理---修改当前对象为置顶
	@ResponseBody
	@RequestMapping("/upaIsStick")
    public int upaIsStick(Integer id){
    	int num=intMarketService.upaIsStick(id);
    	return num;
    }
}
