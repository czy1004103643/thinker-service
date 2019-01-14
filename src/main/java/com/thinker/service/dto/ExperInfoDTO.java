package com.thinker.service.dto;

import java.io.Serializable;
import java.util.List;

public class ExperInfoDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private int userid;
    private String name;
    private String nickname;
    private String head_image;
    private String position;
    private String old_position;
    private int price;
    private String brief_introduction;
    private int service_times;
    private int service_mode;
    private List<String> category;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getHead_image() {
        return head_image;
    }

    public void setHead_image(String head_image) {
        this.head_image = head_image;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getOld_position() {
        return old_position;
    }

    public void setOld_position(String old_position) {
        this.old_position = old_position;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrief_introduction() {
        return brief_introduction;
    }

    public void setBrief_introduction(String brief_introduction) {
        this.brief_introduction = brief_introduction;
    }

    public int getService_times() {
        return service_times;
    }

    public void setService_times(int service_times) {
        this.service_times = service_times;
    }

    public int getService_mode() {
        return service_mode;
    }

    public void setService_mode(int service_mode) {
        this.service_mode = service_mode;
    }

    public List<String> getCategory() {
        return category;
    }

    public void setCategory(List<String> category) {
        this.category = category;
    }
}
