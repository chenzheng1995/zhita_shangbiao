package com.zhita.model.manage;

public class User {
    private Integer id;

    private Integer companyid;

    private String phone;

    private String pwd;

    private String transactionpwd;

    private String truename;

    private String idcard;

    private String educationbackground;

    private String bankcard;

    private String registetime;

    private String logintime;

    private String loginstatus;

    private String usemarket;

    private Integer drainageofplatformid;

    private String workaddress;

    private String detailworkaddress;

    private String state;

    private String headurl;

    private String nationalemblem;

    private String marriage;

    private String workunit;

    private String nowliveaddress;

    private String detailnowliveaddress;

    private String linkmanonerelation;

    private String linkmanonename;

    private String linkmanonephone;

    private String linkmantworelation;

    private String linkmantwoname;

    private String linkmantwophone;

    private String registrationtype;

    public User(Integer id, Integer companyid, String phone, String pwd, String transactionpwd, String truename, String idcard, String educationbackground, String bankcard, String registetime, String logintime, String loginstatus, String usemarket, Integer drainageofplatformid, String workaddress, String detailworkaddress, String state, String headurl, String nationalemblem, String marriage, String workunit, String nowliveaddress, String detailnowliveaddress, String linkmanonerelation, String linkmanonename, String linkmanonephone, String linkmantworelation, String linkmantwoname, String linkmantwophone, String registrationtype) {
        this.id = id;
        this.companyid = companyid;
        this.phone = phone;
        this.pwd = pwd;
        this.transactionpwd = transactionpwd;
        this.truename = truename;
        this.idcard = idcard;
        this.educationbackground = educationbackground;
        this.bankcard = bankcard;
        this.registetime = registetime;
        this.logintime = logintime;
        this.loginstatus = loginstatus;
        this.usemarket = usemarket;
        this.drainageofplatformid = drainageofplatformid;
        this.workaddress = workaddress;
        this.detailworkaddress = detailworkaddress;
        this.state = state;
        this.headurl = headurl;
        this.nationalemblem = nationalemblem;
        this.marriage = marriage;
        this.workunit = workunit;
        this.nowliveaddress = nowliveaddress;
        this.detailnowliveaddress = detailnowliveaddress;
        this.linkmanonerelation = linkmanonerelation;
        this.linkmanonename = linkmanonename;
        this.linkmanonephone = linkmanonephone;
        this.linkmantworelation = linkmantworelation;
        this.linkmantwoname = linkmantwoname;
        this.linkmantwophone = linkmantwophone;
        this.registrationtype = registrationtype;
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

    public Integer getCompanyid() {
        return companyid;
    }

    public void setCompanyid(Integer companyid) {
        this.companyid = companyid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getTransactionpwd() {
        return transactionpwd;
    }

    public void setTransactionpwd(String transactionpwd) {
        this.transactionpwd = transactionpwd == null ? null : transactionpwd.trim();
    }

    public String getTruename() {
        return truename;
    }

    public void setTruename(String truename) {
        this.truename = truename == null ? null : truename.trim();
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getEducationbackground() {
        return educationbackground;
    }

    public void setEducationbackground(String educationbackground) {
        this.educationbackground = educationbackground == null ? null : educationbackground.trim();
    }

    public String getBankcard() {
        return bankcard;
    }

    public void setBankcard(String bankcard) {
        this.bankcard = bankcard == null ? null : bankcard.trim();
    }

    public String getRegistetime() {
        return registetime;
    }

    public void setRegistetime(String registetime) {
        this.registetime = registetime == null ? null : registetime.trim();
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime == null ? null : logintime.trim();
    }

    public String getLoginstatus() {
        return loginstatus;
    }

    public void setLoginstatus(String loginstatus) {
        this.loginstatus = loginstatus == null ? null : loginstatus.trim();
    }

    public String getUsemarket() {
        return usemarket;
    }

    public void setUsemarket(String usemarket) {
        this.usemarket = usemarket == null ? null : usemarket.trim();
    }

    public Integer getDrainageofplatformid() {
        return drainageofplatformid;
    }

    public void setDrainageofplatformid(Integer drainageofplatformid) {
        this.drainageofplatformid = drainageofplatformid;
    }

    public String getWorkaddress() {
        return workaddress;
    }

    public void setWorkaddress(String workaddress) {
        this.workaddress = workaddress == null ? null : workaddress.trim();
    }

    public String getDetailworkaddress() {
        return detailworkaddress;
    }

    public void setDetailworkaddress(String detailworkaddress) {
        this.detailworkaddress = detailworkaddress == null ? null : detailworkaddress.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl == null ? null : headurl.trim();
    }

    public String getNationalemblem() {
        return nationalemblem;
    }

    public void setNationalemblem(String nationalemblem) {
        this.nationalemblem = nationalemblem == null ? null : nationalemblem.trim();
    }

    public String getMarriage() {
        return marriage;
    }

    public void setMarriage(String marriage) {
        this.marriage = marriage == null ? null : marriage.trim();
    }

    public String getWorkunit() {
        return workunit;
    }

    public void setWorkunit(String workunit) {
        this.workunit = workunit == null ? null : workunit.trim();
    }

    public String getNowliveaddress() {
        return nowliveaddress;
    }

    public void setNowliveaddress(String nowliveaddress) {
        this.nowliveaddress = nowliveaddress == null ? null : nowliveaddress.trim();
    }

    public String getDetailnowliveaddress() {
        return detailnowliveaddress;
    }

    public void setDetailnowliveaddress(String detailnowliveaddress) {
        this.detailnowliveaddress = detailnowliveaddress == null ? null : detailnowliveaddress.trim();
    }

    public String getLinkmanonerelation() {
        return linkmanonerelation;
    }

    public void setLinkmanonerelation(String linkmanonerelation) {
        this.linkmanonerelation = linkmanonerelation == null ? null : linkmanonerelation.trim();
    }

    public String getLinkmanonename() {
        return linkmanonename;
    }

    public void setLinkmanonename(String linkmanonename) {
        this.linkmanonename = linkmanonename == null ? null : linkmanonename.trim();
    }

    public String getLinkmanonephone() {
        return linkmanonephone;
    }

    public void setLinkmanonephone(String linkmanonephone) {
        this.linkmanonephone = linkmanonephone == null ? null : linkmanonephone.trim();
    }

    public String getLinkmantworelation() {
        return linkmantworelation;
    }

    public void setLinkmantworelation(String linkmantworelation) {
        this.linkmantworelation = linkmantworelation == null ? null : linkmantworelation.trim();
    }

    public String getLinkmantwoname() {
        return linkmantwoname;
    }

    public void setLinkmantwoname(String linkmantwoname) {
        this.linkmantwoname = linkmantwoname == null ? null : linkmantwoname.trim();
    }

    public String getLinkmantwophone() {
        return linkmantwophone;
    }

    public void setLinkmantwophone(String linkmantwophone) {
        this.linkmantwophone = linkmantwophone == null ? null : linkmantwophone.trim();
    }

    public String getRegistrationtype() {
        return registrationtype;
    }

    public void setRegistrationtype(String registrationtype) {
        this.registrationtype = registrationtype == null ? null : registrationtype.trim();
    }
}