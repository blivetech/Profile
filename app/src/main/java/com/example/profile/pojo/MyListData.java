package com.example.profile.pojo;

public class MyListData {

    private String description;
    private int imgId;
    private String vurl;
    public MyListData(String description, int imgId, String vurl) {
        this.description = description;
        this.imgId = imgId;
        this.vurl = vurl;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public int getImgId() {
        return imgId;
    }
    public void setImgId(int imgId) {
        this.imgId = imgId;
    }
    public String getVurl() {
        return vurl;
    }
    public void setVurl(String vurl) {
        this.vurl = vurl;
    }
}
