package com.zhita.model.manage;

//系统用户表
public class SysUser {
    private Integer id;

    private String number;//编号

    private String account;//账号

    private String pwd;//密码

    private Integer companyid;//公司id

    private String deleted;//假删除（删除：1；没删除0）
    
    private String loginstatus;//登录状态(1:已登录；0：未登录)
    
    private String logintime;//登录时间

    private String operator;//操作人

    private String operationtime;//操作时间
    
    public SysUser(Integer id, String number, String account, String pwd, Integer companyid, String deleted, String loginstatus, String logintime,String operator, String operationtime) {
        this.id = id;
        this.number = number;
        this.account = account;
        this.pwd = pwd;
        this.companyid = companyid;
        this.deleted = deleted;
        this.loginstatus = loginstatus;
        this.logintime = logintime;
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

	public String getLoginstatus() {
		return loginstatus;
	}

	public void setLoginstatus(String loginstatus) {
		this.loginstatus = loginstatus;
	}

	public String getLogintime() {
		return logintime;
	}

	public void setLogintime(String logintime) {
		this.logintime = logintime;
	}
    
}