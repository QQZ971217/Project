package com.soft.entity;

public class TblUser {
    private String uname;
    private  String upwd;
    private  String age;
    private String sex;
    private String  phone;
    private String ztid;
    public TblUser( ) {

    }

    public TblUser(String uname) {
        this.uname = uname;
    }

    public TblUser(String uname, String upwd) {
        this.uname = uname;
        this.upwd = upwd;
    }


    public TblUser(String uname, String upwd, String age, String sex, String phone) {
        this.uname = uname;
        this.upwd = upwd;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
    }

    public TblUser(String uname, String upwd, String age, String sex, String phone, String ztid) {
        this.uname = uname;
        this.upwd = upwd;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.ztid = ztid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getUpwd() {
        return upwd;
    }

    public void setUpwd(String upwd) {
        this.upwd = upwd;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZtid() {
        return ztid;
    }

    public void setZtid(String ztid) {
        this.ztid = ztid;
    }
}
