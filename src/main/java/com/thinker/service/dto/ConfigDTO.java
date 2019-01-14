package com.thinker.service.dto;

import java.io.Serializable;
import java.util.List;

public class ConfigDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private List<AdDTO> adlist;

    public List<AdDTO> getAdlist() {
        return adlist;
    }

    public void setAdlist(List<AdDTO> adlist) {
        this.adlist = adlist;
    }
}
