package com.zhita.service.manage.market;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhita.dao.manage.MarketViewpagerMapper;
import com.zhita.model.manage.MarketViewpager;
import com.zhita.util.Timestamps;

@Service
public class MarketServiceImp implements IntMarketService{
	@Autowired
	private MarketViewpagerMapper marketViewpagerMapper;
	
	//后台管理---查询市场轮播图所有信息
    public List<MarketViewpager> queryAll(Integer companyId){
    	List<MarketViewpager> list=marketViewpagerMapper.queryAll(companyId);
    	for (int i = 0; i < list.size(); i++) {
			list.get(i).setUpdatetime(Timestamps.stampToDate(list.get(i).getUpdatetime()));
			list.get(i).setOperationtime(Timestamps.stampToDate(list.get(i).getOperationtime()));
		}
    	return list;
    }
    
    //后台管理---添加市场轮播图信息
    public int insert(MarketViewpager record){
    	record.setOperationtime(System.currentTimeMillis()+"");//获取当前时间戳
    	int num=marketViewpagerMapper.insert(record);
    	return num;
    }
    
    //后台管理---根据主键id查询当前对象信息
    public MarketViewpager selectByPrimaryKey(Integer id){
    	MarketViewpager marketViewpager=marketViewpagerMapper.selectByPrimaryKey(id);
    	return marketViewpager;
    }
    
   //后台管理---对当前对象进行修改保存
    public int updateByPrimaryKey(MarketViewpager record){
    	record.setUpdatetime(System.currentTimeMillis()+"");//获取当前时间戳
    	record.setOperationtime(System.currentTimeMillis()+"");//获取当前时间戳
    	int num=marketViewpagerMapper.updateByPrimaryKey(record);
    	return num;
    }
    
    //后台管理---修改当前对象的假删除状态
    public int upaFalseDel(Integer id){
    	int num=marketViewpagerMapper.upaFalseDel(id);
    	return num;
    }
    
    //后台管理---修改当前对象为置顶
    public int upaIsStick(Integer id){
    	int num=marketViewpagerMapper.upaIsStick(id);
    	return num;
    }
}
