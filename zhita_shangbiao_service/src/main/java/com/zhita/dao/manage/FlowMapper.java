package com.zhita.dao.manage;

import com.zhita.model.manage.Flow;

public interface FlowMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Flow record);

    int insertSelective(Flow record);
}