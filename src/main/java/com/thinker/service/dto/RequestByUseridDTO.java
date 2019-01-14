package com.thinker.service.dto;

import java.io.Serializable;

public class RequestByUseridDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int userid;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }
}
