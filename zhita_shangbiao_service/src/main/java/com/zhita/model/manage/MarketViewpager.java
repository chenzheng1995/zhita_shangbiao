package com.zhita.model.manage;

public class MarketViewpager {
    private Integer id;

    private String viewpagerpicture;

    private Integer sort;

    private String isstick;

    private String status;

    private String updatetime;

    private Integer companyid;

    private String deleted;

    private String operator;

    private String operationtime;

    public MarketViewpager(Integer id, String viewpagerpicture, Integer sort, String isstick, String status, String updatetime, Integer companyid, String deleted, String operator, String operationtime) {
        this.id = id;
        this.viewpagerpicture = viewpagerpicture;
        this.sort = sort;
        this.isstick = isstick;
        this.status = status;
        this.updatetime = updatetime;
        this.companyid = companyid;
        this.deleted = deleted;
        this.operator = operator;
        this.operationtime = operationtime;
    }

    public MarketViewpager() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getViewpagerpicture() {
        return viewpagerpicture;
    }

    public void setViewpagerpicture(String viewpagerpicture) {
        this.viewpagerpicture = viewpagerpicture == null ? null : viewpagerpicture.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIsstick() {
        return isstick;
    }

    public void setIsstick(String isstick) {
        this.isstick = isstick == null ? null : isstick.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(String updatetime) {
        this.updatetime = updatetime == null ? null : updatetime.trim();
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