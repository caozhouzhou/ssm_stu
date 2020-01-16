package com.jdwa.pojo;

import java.util.Date;

/**
 * Created by czz on 2019/12/31.
 */
public class User {
    private Integer id;
    private String userName;
    private String password;
    private String name;
    private Integer clazzId;
    private String email;
    private String mobile;
    private String status;
    private Date lastLoginTm;
    private Character sex;
    private String theme;
    private String salt;
    private String awatar;
    private String desc;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getClazzId() {
        return clazzId;
    }

    public void setClazzId(Integer clazzId) {
        this.clazzId = clazzId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getLastLoginTm() {
        return lastLoginTm;
    }

    public void setLastLoginTm(Date lastLoginTm) {
        this.lastLoginTm = lastLoginTm;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getAwatar() {
        return awatar;
    }

    public void setAwatar(String awatar) {
        this.awatar = awatar;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", name='" + name + '\'' +
                ", clazzId=" + clazzId +
                ", email='" + email + '\'' +
                ", mobile='" + mobile + '\'' +
                ", status='" + status + '\'' +
                ", lastLoginTm=" + lastLoginTm +
                ", sex=" + sex +
                ", theme='" + theme + '\'' +
                ", salt='" + salt + '\'' +
                ", awatar='" + awatar + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
