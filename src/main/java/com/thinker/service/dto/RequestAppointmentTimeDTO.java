package com.thinker.service.dto;

import java.io.Serializable;

public class RequestAppointmentTimeDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private int userid;
    private String start_date;
    private String end_date;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }
}
