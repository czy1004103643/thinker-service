package com.thinker.service.dto;

import java.io.Serializable;

public class RequestResetPasswdDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private String telephone;
    private String newpasswd;
    private String smscode;

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getNewpasswd() {
        return newpasswd;
    }

    public void setNewpasswd(String newpasswd) {
        this.newpasswd = newpasswd;
    }

    public String getSmscode() {
        return smscode;
    }

    public void setSmscode(String smscode) {
        this.smscode = smscode;
    }
}
