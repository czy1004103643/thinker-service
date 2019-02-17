package com.thinker.service.dto;

import java.io.Serializable;
import java.util.List;

public class ServiceListDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private int total;
    private List<ServiceDTO> servicelist;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<ServiceDTO> getServicelist() {
        return servicelist;
    }

    public void setServicelist(List<ServiceDTO> servicelist) {
        this.servicelist = servicelist;
    }
}
