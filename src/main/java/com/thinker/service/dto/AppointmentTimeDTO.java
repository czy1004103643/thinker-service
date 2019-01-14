package com.thinker.service.dto;

import java.io.Serializable;
import java.util.List;

public class AppointmentTimeDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private String date;
    private int week;
    private List<TimesDTO> times;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public List<TimesDTO> getTimes() {
        return times;
    }

    public void setTimes(List<TimesDTO> times) {
        this.times = times;
    }

}
