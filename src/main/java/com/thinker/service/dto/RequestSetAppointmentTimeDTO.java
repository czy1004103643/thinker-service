package com.thinker.service.dto;

import java.io.Serializable;
import java.util.List;

public class RequestSetAppointmentTimeDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private List<SetAppointmentTimeDTO> appointmenttimes;

    public List<SetAppointmentTimeDTO> getAppointmenttimes() {
        return appointmenttimes;
    }

    public void setAppointmenttimes(List<SetAppointmentTimeDTO> appointmenttimes) {
        this.appointmenttimes = appointmenttimes;
    }

}
