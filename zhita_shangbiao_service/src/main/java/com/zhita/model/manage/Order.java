package com.zhita.model.manage;

import java.math.BigDecimal;


//订单表
public class Order {
    private Integer id;

    private String ordernumber;//订单编号

    private String username;//用户名

    private String contactway;//联系方式

    private String idcard;//身份证号

    private String appointcompany;//指定公司

    private String comment;//备注

    private String businesslicense;//营业执照

    private String commodityname;//商品名称

    private Integer companyid;//公司id

    private String submittime;//提交时间

    private BigDecimal realityprice;//实际付款金额

    private String operator;//操作人

    private String operationtime;//操作时间

    public Order(Integer id, String ordernumber, String username, String contactway, String idcard, String appointcompany, String comment, String businesslicense, String commodityname, Integer companyid, String submittime, BigDecimal realityprice, String operator, String operationtime) {
        this.id = id;
        this.ordernumber = ordernumber;
        this.username = username;
        this.contactway = contactway;
        this.idcard = idcard;
        this.appointcompany = appointcompany;
        this.comment = comment;
        this.businesslicense = businesslicense;
        this.commodityname = commodityname;
        this.companyid = companyid;
        this.submittime = submittime;
        this.realityprice = realityprice;
        this.operator = operator;
        this.operationtime = operationtime;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdernumber() {
        return ordernumber;
    }

    public void setOrdernumber(String ordernumber) {
        this.ordernumber = ordernumber == null ? null : ordernumber.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getContactway() {
        return contactway;
    }

    public void setContactway(String contactway) {
        this.contactway = contactway == null ? null : contactway.trim();
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

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getSubmittime() {
        return submittime;
    }

    public void setSubmittime(String submittime) {
        this.submittime = submittime == null ? null : submittime.trim();
    }

    public BigDecimal getRealityprice() {
        return realityprice;
    }

    public void setRealityprice(BigDecimal realityprice) {
        this.realityprice = realityprice;
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