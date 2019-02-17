package com.thinker.service.dto;

import java.io.Serializable;

public class RequestServiceListDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
