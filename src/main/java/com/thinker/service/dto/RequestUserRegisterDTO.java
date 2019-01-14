package com.thinker.service.dto;

import java.io.Serializable;

public class RequestUserRegisterDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private String telephone;
    private String passwd;
    private String smscode;

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

    public String getSmscode() {
        return smscode;
    }

    public void setSmscode(String smscode) {
        this.smscode = smscode;
    }
}
