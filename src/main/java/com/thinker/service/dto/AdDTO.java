package com.thinker.service.dto;

import java.io.Serializable;

public class AdDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String ad_image;
    private String ad_link;
    private String ad_describe;

    public String getAd_image() {
        return ad_image;
    }

    public void setAd_image(String ad_image) {
        this.ad_image = ad_image;
    }

    public String getAd_link() {
        return ad_link;
    }

    public void setAd_link(String ad_link) {
        this.ad_link = ad_link;
    }

    public String getAd_describe() {
        return ad_describe;
    }

    public void setAd_describe(String ad_describe) {
        this.ad_describe = ad_describe;
    }
}
