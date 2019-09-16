package com.soft.entity;

import java.io.File;

public class TblUsers {
    private String uid;
    private String uname;
    private String pwd;
    private String phone;
    private String sex;
    private String age;
    private String regtime;
    private String integral;
    private String ztid;
    private String headurl;

    public TblUsers() {

    }
    public TblUsers(String uname){
        this.uname = uname;
    }

    public TblUsers(String uid, String uname, String pwd, String phone, String sex, String age, String regtime, String integral, String ztid, String headurl) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
        this.phone = phone;
        this.sex = sex;
        this.age = age;
        this.regtime = regtime;
        this.integral = integral;
        this.ztid = ztid;
        this.headurl = headurl;
    }

    public TblUsers(String uid, String uname, String pwd, String phone, String sex, String age, String regtime, String integral, String ztid) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
        this.phone = phone;
        this.sex = sex;
        this.age = age;
        this.regtime = regtime;
        this.integral = integral;
        this.ztid = ztid;
    }

    public TblUsers(String uid, String uname, String pwd, String regtime, String integral, String ztid) {
        this.uid = uid;
        this.uname = uname;
        this.pwd = pwd;
        this.regtime = regtime;
        this.integral = integral;
        this.ztid = ztid;
    }

    public String getHeadurl() {
        return headurl;
    }

    public void setHeadurl(String headurl) {
        this.headurl = headurl;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getRegtime() {
        return regtime;
    }

    public void setRegtime(String regtime) {
        this.regtime = regtime;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }

    public String getZtid() {
        return ztid;
    }

    public void setZtid(String ztid) {
        this.ztid = ztid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }
}
