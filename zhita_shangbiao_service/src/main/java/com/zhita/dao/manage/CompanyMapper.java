package com.zhita.dao.manage;

import java.util.List;

import com.zhita.model.manage.Company;

public interface CompanyMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKey(Company record);
    
    //后台管理---查询所有公司
    List<Company> queryAll();
}