package com.thinker.service.dto;

import java.io.Serializable;

public class SmsCodeDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private String smscode;

    public String getSmscode() {
        return smscode;
    }

    public void setSmscode(String smscode) {
        this.smscode = smscode;
    }
}
