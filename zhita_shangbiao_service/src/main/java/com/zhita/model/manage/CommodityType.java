package com.zhita.model.manage;

//商品分类表
public class CommodityType {
    private Integer id;

    private String typename;//分类名称

    private Integer sort;//排序

    private Integer companyid;//公司id

    private String deleted;//假删除（删除：1；没删除0）

    private String operator;//操作人

    private String operationtime;//操作时间

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