package com.thinker.service.dto;

import java.io.Serializable;

public class RequestExpertListDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private int startnum;
    private int endnum;

    public int getStartnum() {
        return startnum;
    }

    public void setStartnum(int startnum) {
        this.startnum = startnum;
    }

    public int getEndnum() {
        return endnum;
    }

    public void setEndnum(int endnum) {
        this.endnum = endnum;
    }
}
