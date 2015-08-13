package org.jerry.demo.model;

public class SysUserInfo {
    private Integer userId;

    private String userName;

    private String userBrithday;

    private String userAge;

    private String userWorkTel;

    private String userMail;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserBrithday() {
        return userBrithday;
    }

    public void setUserBrithday(String userBrithday) {
        this.userBrithday = userBrithday == null ? null : userBrithday.trim();
    }

    public String getUserAge() {
        return userAge;
    }

    public void setUserAge(String userAge) {
        this.userAge = userAge == null ? null : userAge.trim();
    }

    public String getUserWorkTel() {
        return userWorkTel;
    }

    public void setUserWorkTel(String userWorkTel) {
        this.userWorkTel = userWorkTel == null ? null : userWorkTel.trim();
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail == null ? null : userMail.trim();
    }
}