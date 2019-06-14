package com.zhita.model.manage;

//首页轮播图表
public class HomepageViewpager {
    private Integer id;

    private String viewpagerpicture;//轮播图图片

    private Integer sort;//排序

    private String isstick;//是否置顶（1：置顶；0：不置顶）

    private String status;//状态（1：开启；2：关闭）

    private String updatetime;//更新时间

    private Integer companyid;//公司id

    private String deleted;//假删除（删除：1；没删除0）

    private String operator;//操作人

    private String operationtime;//操作时间

    public HomepageViewpager(Integer id, String viewpagerpicture, Integer sort, String isstick, String status, String updatetime, Integer companyid, String deleted, String operator, String operationtime) {
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

    public HomepageViewpager() {
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