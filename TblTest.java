package com.soft.entity;

public class TblTest {
    private String uname;
    private  String upwd;
    private  String age;
    private String sex;
    private String  phone;
    private String ztid;
    private TblState tblState;

    public TblTest() {
    }

    public TblTest(String uname, String upwd, String age, String sex, String phone, String ztid, TblState tblState) {
        this.uname = uname;
        this.upwd = upwd;
        this.age = age;
        this.sex = sex;
        this.phone = phone;
        this.ztid = ztid;
        this.tblState = tblState;
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

    public TblState getTblState() {
        return tblState;
    }

    public void setTblState(TblState tblState) {
        this.tblState = tblState;
    }
}
