package com.thinker.service.dto;

import java.io.Serializable;

public class RequestUserLoginDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private String telephone;
    private String passwd;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}
