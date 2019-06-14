package com.zhita.dao.manage;

import com.zhita.model.manage.HomepageViewpager;

public interface HomepageViewpagerMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(HomepageViewpager record);

    int insertSelective(HomepageViewpager record);

    HomepageViewpager selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(HomepageViewpager record);

    int updateByPrimaryKey(HomepageViewpager record);
}