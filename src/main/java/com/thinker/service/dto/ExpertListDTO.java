package com.thinker.service.dto;

import java.io.Serializable;
import java.util.List;

public class ExpertListDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private int total;
    private List<ExperInfoDTO> expertlist;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<ExperInfoDTO> getExpertlist() {
        return expertlist;
    }

    public void setExpertlist(List<ExperInfoDTO> expertlist) {
        this.expertlist = expertlist;
    }
}
