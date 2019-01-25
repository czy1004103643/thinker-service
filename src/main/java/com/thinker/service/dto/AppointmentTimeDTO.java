package com.thinker.service.dto;

import java.io.Serializable;
import java.util.List;

public class AppointmentTimeDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private int date;
    private int week;
    private List<Integer> times;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getWeek() {
        return week;
    }

    public void setWeek(int week) {
        this.week = week;
    }

    public List<Integer> getTimes() {
        return times;
    }

    public void setTimes(List<Integer> times) {
        this.times = times;
    }

}
