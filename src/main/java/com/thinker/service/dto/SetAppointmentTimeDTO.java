package com.thinker.service.dto;

import java.io.Serializable;
import java.util.List;

public class SetAppointmentTimeDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int week;
    private List<String> times;

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public List<String> getTimes() {
        return times;
    }

    public void setTimes(List<String> times) {
        this.times = times;
    }
}
