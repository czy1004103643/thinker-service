package com.thinker.service.dto;

import java.io.Serializable;

public class RequestGetSmsCodeDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private String telephone;
    private int type;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
