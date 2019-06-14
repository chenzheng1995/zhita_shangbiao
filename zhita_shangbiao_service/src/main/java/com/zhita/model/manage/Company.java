package com.zhita.model.manage;

//公司表
public class Company {
    private Integer id;

    private String company;//公司名

    private String deleted;//假删除（删除：1；没删除0）

    public Company(Integer id, String company, String deleted) {
        this.id = id;
        this.company = company;
        this.deleted = deleted;
    }

    public Company() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }
}