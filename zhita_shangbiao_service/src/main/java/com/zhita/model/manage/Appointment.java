package com.zhita.model.manage;

//预约表
public class Appointment {
    private Integer id;

    private Integer commodityid;//商品id

    private String name;//姓名

    private String contactway;//联系方式

    private String submittime;//提交时间

    private String comment;//备注

    private String deleted;//假删除（删除：1；没删除0）

    public Appointment(Integer id, Integer commodityid, String name, String contactway, String submittime, String comment, String deleted) {
        this.id = id;
        this.commodityid = commodityid;
        this.name = name;
        this.contactway = contactway;
        this.submittime = submittime;
        this.comment = comment;
        this.deleted = deleted;
    }

    public Appointment() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCommodityid() {
        return commodityid;
    }

    public void setCommodityid(Integer commodityid) {
        this.commodityid = commodityid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getContactway() {
        return contactway;
    }

    public void setContactway(String contactway) {
        this.contactway = contactway == null ? null : contactway.trim();
    }

    public String getSubmittime() {
        return submittime;
    }

    public void setSubmittime(String submittime) {
        this.submittime = submittime == null ? null : submittime.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getDeleted() {
        return deleted;
    }

    public void setDeleted(String deleted) {
        this.deleted = deleted == null ? null : deleted.trim();
    }
}