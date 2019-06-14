package com.zhita.dao.manage;

import com.zhita.model.manage.MarketViewpager;

public interface MarketViewpagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MarketViewpager record);

    int insertSelective(MarketViewpager record);

    MarketViewpager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MarketViewpager record);

    int updateByPrimaryKey(MarketViewpager record);
}