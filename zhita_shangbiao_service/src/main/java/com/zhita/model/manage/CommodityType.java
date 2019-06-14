package com.zhita.model.manage;

public class CommodityType {
    private Integer id;

    private String typename;

    private Integer sort;

    private Integer companyid;

    private String deleted;

    private String operator;

    private String operationtime;

    public CommodityType(Integer id, String typename, Integer sort, Integer companyid, String deleted, String operator, String operationtime) {
        this.id = id;
        this.typename = typename;
        this.sort = sort;
        this.companyid = companyid;
        this.deleted = deleted;
        this.operator = operator;
        this.operationtime = operationtime;
    }

    public CommodityType() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypename() {
        return typename;
    }

    public void setTypename(String typename) {
        this.typename = typename == null ? null : typename.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator == null ? null : operator.trim();
    }

    public String getOperationtime() {
        return operationtime;
    }

    public void setOperationtime(String operationtime) {
        this.operationtime = operationtime == null ? null : operationtime.trim();
    }
}