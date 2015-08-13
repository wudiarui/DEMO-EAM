package org.jerry.demo.model;

import java.util.Date;

public class SysAccount {
    private Integer accountId;

    private String accountName;

    private String password;

    private Date incomedate;

    private Byte deltag;

    private String beform;

    private Integer sysUserInfoUserId;

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getIncomedate() {
        return incomedate;
    }

    public void setIncomedate(Date incomedate) {
        this.incomedate = incomedate;
    }

    public Byte getDeltag() {
        return deltag;
    }

    public void setDeltag(Byte deltag) {
        this.deltag = deltag;
    }

    public String getBeform() {
        return beform;
    }

    public void setBeform(String beform) {
        this.beform = beform == null ? null : beform.trim();
    }

    public Integer getSysUserInfoUserId() {
        return sysUserInfoUserId;
    }

    public void setSysUserInfoUserId(Integer sysUserInfoUserId) {
        this.sysUserInfoUserId = sysUserInfoUserId;
    }
}