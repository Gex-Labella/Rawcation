package com.example.chat_app.Models;

public class CallInfo {

    private String name, sTime;
    private int imgUrl;

    public CallInfo() {
    }

    public CallInfo(int imgUrl, String name, String sTime) {
        this.imgUrl = imgUrl;
        this.name = name;
        this.sTime = sTime;
    }

    public int getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(int imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getsTime() {
        return sTime;
    }

    public void setsTime(String sTime) {
        this.sTime = sTime;
    }
}
