package com.zhita.service.manage.homepage;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zhita.dao.manage.HomepageViewpagerMapper;
import com.zhita.model.manage.HomepageViewpager;
import com.zhita.util.Timestamps;

@Service
public class HomepageServiceImp implements IntHomepageService{
	@Autowired
	private HomepageViewpagerMapper homepageViewpagerMapper;
	
    //后台管理---查询首页轮播图所有信息
    public List<HomepageViewpager> queryAll(Integer companyId){
    	List<HomepageViewpager> list=homepageViewpagerMapper.queryAll(companyId);
    	for (int i = 0; i < list.size(); i++) {
			list.get(i).setUpdatetime(Timestamps.stampToDate(list.get(i).getUpdatetime()));
			list.get(i).setOperationtime(Timestamps.stampToDate(list.get(i).getOperationtime()));
		}
    	return list;
    }
    
    //后台管理---添加首页轮播图信息
    public int insert(HomepageViewpager record){
    	record.setOperationtime(System.currentTimeMillis()+"");//获取当前时间戳
    	int num=homepageViewpagerMapper.insert(record);
    	return num;
    }
    
    //后台管理---根据主键id查询当前对象信息
    public HomepageViewpager selectByPrimaryKey(Integer id){
    	HomepageViewpager homepageViewpager=homepageViewpagerMapper.selectByPrimaryKey(id);
    	return homepageViewpager;
    }
    
   //后台管理---对当前对象进行修改保存
    public int updateByPrimaryKey(HomepageViewpager record){
    	record.setUpdatetime(System.currentTimeMillis()+"");//获取当前时间戳
    	record.setOperationtime(System.currentTimeMillis()+"");//获取当前时间戳
    	int num=homepageViewpagerMapper.updateByPrimaryKey(record);
    	return num;
    }
    
    //后台管理---修改当前对象的假删除状态
    public int upaFalseDel(Integer id){
    	int num=homepageViewpagerMapper.upaFalseDel(id);
    	return num;
    }
    
    //后台管理---修改当前对象为置顶
    public int upaIsStick(Integer id){
    	int num=homepageViewpagerMapper.upaIsStick(id);
    	return num;
    }
}
