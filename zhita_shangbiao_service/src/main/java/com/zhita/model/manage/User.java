package com.zhita.model.manage;


//用户表
public class User {
    private Integer id;

    private String reallyname;//真实姓名

    private String idcard;//身份证号

    private String appointcompany;//指定公司

    private String contactway;//联系方式

    private String comment;//备注

    private String businesslicense;//营业执照

    private Integer companyid;//公司id

    private String ispass;//审核是否通过（1：通过；2：不通过；0：待审核）

    private String openid;//openid

    private String loginstatus;//登录状态(1:已登录；0：未登录)

    private String logintime;//登录时间

    public User(Integer id, String reallyname, String idcard, String appointcompany, String contactway, String comment, String businesslicense, Integer companyid, String ispass, String openid, String loginstatus, String logintime) {
        this.id = id;
        this.reallyname = reallyname;
        this.idcard = idcard;
        this.appointcompany = appointcompany;
        this.contactway = contactway;
        this.comment = comment;
        this.businesslicense = businesslicense;
        this.companyid = companyid;
        this.ispass = ispass;
        this.openid = openid;
        this.loginstatus = loginstatus;
        this.logintime = logintime;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getReallyname() {
        return reallyname;
    }

    public void setReallyname(String reallyname) {
        this.reallyname = reallyname == null ? null : reallyname.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getAppointcompany() {
        return appointcompany;
    }

    public void setAppointcompany(String appointcompany) {
        this.appointcompany = appointcompany == null ? null : appointcompany.trim();
    }

    public String getContactway() {
        return contactway;
    }

    public void setContactway(String contactway) {
        this.contactway = contactway == null ? null : contactway.trim();
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getBusinesslicense() {
        return businesslicense;
    }

    public void setBusinesslicense(String businesslicense) {
        this.businesslicense = businesslicense == null ? null : businesslicense.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getIspass() {
        return ispass;
    }

    public void setIspass(String ispass) {
        this.ispass = ispass == null ? null : ispass.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getLoginstatus() {
        return loginstatus;
    }

    public void setLoginstatus(String loginstatus) {
        this.loginstatus = loginstatus == null ? null : loginstatus.trim();
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime == null ? null : logintime.trim();
    }
}