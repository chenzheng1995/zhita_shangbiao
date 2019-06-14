package com.zhita.dao.manage;

import com.zhita.model.manage.Communicate;

public interface CommunicateMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Communicate record);

    int insertSelective(Communicate record);

    Communicate selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Communicate record);

    int updateByPrimaryKey(Communicate record);
}