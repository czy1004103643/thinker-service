package com.thinker.service.dto;

import java.io.Serializable;

public class ServiceDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int appointment_id;
    private String appointment_time;
    private int expert_userid;
    private String expert_name;
    private String expert_nickname;
    private String expert_head_image;

    public int getAppointment_id() {
        return appointment_id;
    }

    public void setAppointment_id(int appointment_id) {
        this.appointment_id = appointment_id;
    }

    public String getAppointment_time() {
        return appointment_time;
    }

    public void setAppointment_time(String appointment_time) {
        this.appointment_time = appointment_time;
    }

    public int getExpert_userid() {
        return expert_userid;
    }

    public void setExpert_userid(int expert_userid) {
        this.expert_userid = expert_userid;
    }

    public String getExpert_name() {
        return expert_name;
    }

    public void setExpert_name(String expert_name) {
        this.expert_name = expert_name;
    }

    public String getExpert_nickname() {
        return expert_nickname;
    }

    public void setExpert_nickname(String expert_nickname) {
        this.expert_nickname = expert_nickname;
    }

    public String getExpert_head_image() {
        return expert_head_image;
    }

    public void setExpert_head_image(String expert_head_image) {
        this.expert_head_image = expert_head_image;
    }
}
