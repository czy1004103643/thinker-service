package com.thinker.service.dto;

import java.io.Serializable;
import java.util.List;

public class SetExceptionTimeDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private List<String> times;

    public List<String> getTimes() {
        return times;
    }

    public void setTimes(List<String> times) {
        this.times = times;
    }
}
