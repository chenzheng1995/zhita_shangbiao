package com.zhita.model.manage;

//沟通记录表
public class Communicate {
    private Integer id;

    private String communicatetime;//沟通时间

    private Integer sysuserid;//系统用户id（业务员）

    private Integer appointmentid;//预约表id

    private String comment;//备注

    private String deleted;//假删除（删除：1；没删除0）

    public Communicate(Integer id, String communicatetime, Integer sysuserid, Integer appointmentid, String comment, String deleted) {
        this.id = id;
        this.communicatetime = communicatetime;
        this.sysuserid = sysuserid;
        this.appointmentid = appointmentid;
        this.comment = comment;
        this.deleted = deleted;
    }

    public Communicate() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCommunicatetime() {
        return communicatetime;
    }

    public void setCommunicatetime(String communicatetime) {
        this.communicatetime = communicatetime == null ? null : communicatetime.trim();
    }

    public Integer getSysuserid() {
        return sysuserid;
    }

    public void setSysuserid(Integer sysuserid) {
        this.sysuserid = sysuserid;
    }

    public Integer getAppointmentid() {
        return appointmentid;
    }

    public void setAppointmentid(Integer appointmentid) {
        this.appointmentid = appointmentid;
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