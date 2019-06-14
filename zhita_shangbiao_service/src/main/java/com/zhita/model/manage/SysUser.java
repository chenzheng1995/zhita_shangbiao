package com.zhita.model.manage;

public class SysUser {
    private Integer id;

    private String number;

    private String account;

    private String pwd;

    private Integer companyid;

    private String deleted;

    private String operator;

    private String operationtime;

    public SysUser(Integer id, String number, String account, String pwd, Integer companyid, String deleted, String operator, String operationtime) {
        this.id = id;
        this.number = number;
        this.account = account;
        this.pwd = pwd;
        this.companyid = companyid;
        this.deleted = deleted;
        this.operator = operator;
        this.operationtime = operationtime;
    }

    public SysUser() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
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