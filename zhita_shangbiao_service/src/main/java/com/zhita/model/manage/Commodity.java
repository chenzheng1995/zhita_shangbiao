package com.zhita.model.manage;

public class Commodity {
    private Integer id;

    private Integer typeid;

    private String commodityname;

    private String commoditypicture;

    private String commodityintroduce;

    private String commoditytype;

    private String commodityprice;

    private String commoditystatus;

    private Integer sort;

    private String usefullife;

    private String conservationgroups;

    private String deleted;

    private String operator;

    private String operationtime;

    public Commodity(Integer id, Integer typeid, String commodityname, String commoditypicture, String commodityintroduce, String commoditytype, String commodityprice, String commoditystatus, Integer sort, String usefullife, String conservationgroups, String deleted, String operator, String operationtime) {
        this.id = id;
        this.typeid = typeid;
        this.commodityname = commodityname;
        this.commoditypicture = commoditypicture;
        this.commodityintroduce = commodityintroduce;
        this.commoditytype = commoditytype;
        this.commodityprice = commodityprice;
        this.commoditystatus = commoditystatus;
        this.sort = sort;
        this.usefullife = usefullife;
        this.conservationgroups = conservationgroups;
        this.deleted = deleted;
        this.operator = operator;
        this.operationtime = operationtime;
    }

    public Commodity() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTypeid() {
        return typeid;
    }

    public void setTypeid(Integer typeid) {
        this.typeid = typeid;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public String getCommoditypicture() {
        return commoditypicture;
    }

    public void setCommoditypicture(String commoditypicture) {
        this.commoditypicture = commoditypicture == null ? null : commoditypicture.trim();
    }

    public String getCommodityintroduce() {
        return commodityintroduce;
    }

    public void setCommodityintroduce(String commodityintroduce) {
        this.commodityintroduce = commodityintroduce == null ? null : commodityintroduce.trim();
    }

    public String getCommoditytype() {
        return commoditytype;
    }

    public void setCommoditytype(String commoditytype) {
        this.commoditytype = commoditytype == null ? null : commoditytype.trim();
    }

    public String getCommodityprice() {
        return commodityprice;
    }

    public void setCommodityprice(String commodityprice) {
        this.commodityprice = commodityprice == null ? null : commodityprice.trim();
    }

    public String getCommoditystatus() {
        return commoditystatus;
    }

    public void setCommoditystatus(String commoditystatus) {
        this.commoditystatus = commoditystatus == null ? null : commoditystatus.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getUsefullife() {
        return usefullife;
    }

    public void setUsefullife(String usefullife) {
        this.usefullife = usefullife == null ? null : usefullife.trim();
    }

    public String getConservationgroups() {
        return conservationgroups;
    }

    public void setConservationgroups(String conservationgroups) {
        this.conservationgroups = conservationgroups == null ? null : conservationgroups.trim();
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