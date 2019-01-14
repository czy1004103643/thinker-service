package com.thinker.service.dto;

import java.io.Serializable;

public class RequestServiceModeDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int service_mode;

    public int getService_mode() {
        return service_mode;
    }

    public void setService_mode(int service_mode) {
        this.service_mode = service_mode;
    }
}
