package com.zhita.service.manage.homepage;

import java.util.List;

import com.zhita.model.manage.HomepageViewpager;

public interface IntHomepageService {
	
    //后台管理---查询首页轮播图所有信息
    List<HomepageViewpager> queryAll(Integer companyId);
    
    //后台管理---添加首页轮播图信息
    int insert(HomepageViewpager record);
    
    //后台管理---根据主键id查询当前对象信息
    HomepageViewpager selectByPrimaryKey(Integer id);
    
    //后台管理---对当前对象进行修改保存
    int updateByPrimaryKey(HomepageViewpager record);
    
    //后台管理---修改当前对象的假删除状态
    int upaFalseDel(Integer id);
    
    //后台管理---修改当前对象为置顶
    int upaIsStick(Integer id);
}
