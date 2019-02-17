package com.thinker.service.dto;

import java.io.Serializable;

public class ExpertMyCenterDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int userid;
    private String name;
    private String nickname;
    private String head_image;
    private String position;
    private String old_position;
    private int service_times;
    private float balance;
    private int good_comment;
    private int coupon;
    private int service_appointment;
    private int service_complete;
    private int service_evaluate;
    private int collect_expert;

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

    public int getService_times() {
        return service_times;
    }

    public void setService_times(int service_times) {
        this.service_times = service_times;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public int getGood_comment() {
        return good_comment;
    }

    public void setGood_comment(int good_comment) {
        this.good_comment = good_comment;
    }

    public int getCoupon() {
        return coupon;
    }

    public void setCoupon(int coupon) {
        this.coupon = coupon;
    }

    public int getService_appointment() {
        return service_appointment;
    }

    public void setService_appointment(int service_appointment) {
        this.service_appointment = service_appointment;
    }

    public int getService_complete() {
        return service_complete;
    }

    public void setService_complete(int service_complete) {
        this.service_complete = service_complete;
    }

    public int getService_evaluate() {
        return service_evaluate;
    }

    public void setService_evaluate(int service_evaluate) {
        this.service_evaluate = service_evaluate;
    }

    public int getCollect_expert() {
        return collect_expert;
    }

    public void setCollect_expert(int collect_expert) {
        this.collect_expert = collect_expert;
    }
}
