package com.zhita.dao.manage;

import java.util.List;

import com.zhita.model.manage.MarketViewpager;

public interface MarketViewpagerMapper {
    int deleteByPrimaryKey(Integer id);
    
    //后台管理---添加市场轮播图信息
    int insert(MarketViewpager record);

    int insertSelective(MarketViewpager record);
    
    //后台管理---根据主键id查询当前对象信息
    MarketViewpager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MarketViewpager record);
    
    //后台管理---对当前对象进行修改保存
    int updateByPrimaryKey(MarketViewpager record);
    
    //后台管理---查询市场轮播图所有信息
    List<MarketViewpager> queryAll(Integer companyId);
    
    //后台管理---修改当前对象的假删除状态
    int upaFalseDel(Integer id);
    
    //后台管理---修改当前对象为置顶
    int upaIsStick(Integer id);
}