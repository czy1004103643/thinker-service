package com.thinker.service.dto;

import java.io.Serializable;

public class UserTokenDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private int user_type;
    private String token;
    private String expireTime;

    public int getUser_type() {
        return user_type;
    }

    public void setUser_type(int user_type) {
        this.user_type = user_type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(String expireTime) {
        this.expireTime = expireTime;
    }
}
