package com.thinker.service.dto;

import java.io.Serializable;

public class TimesDTO implements Serializable{
    private static final long serialVersionUID = 1L;
    private String time;
    private int status;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
}
