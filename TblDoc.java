package com.soft.entity;

public class TblDoc {
    private String did;
    private String title;
    private String synopsis;
    private String url;
    private String integral;
    private String addtime;

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime;
    }

    public TblDoc() {
    }

    public TblDoc(String did, String title, String synopsis, String url, String integral, String addtime) {
        this.did = did;
        this.title = title;
        this.synopsis = synopsis;
        this.url = url;
        this.integral = integral;
        this.addtime = addtime;
    }

    public TblDoc(String did, String title, String synopsis, String url, String integral) {
        this.did = did;
        this.title = title;
        this.synopsis = synopsis;
        this.url = url;
        this.integral = integral;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIntegral() {
        return integral;
    }

    public void setIntegral(String integral) {
        this.integral = integral;
    }
}
