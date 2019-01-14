package com.thinker.service.dto;

import java.io.Serializable;

public class CommentDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private int user_userid;
    private String user_name;
    private String user_nickname;
    private String user_head_image;
    private int expert_userid;
    private String expert_name;
    private String expert_nickname;
    private String expert_head_image;
    private String comment;

    public int getUser_userid() {
        return user_userid;
    }

    public void setUser_userid(int user_userid) {
        this.user_userid = user_userid;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_nickname() {
        return user_nickname;
    }

    public void setUser_nickname(String user_nickname) {
        this.user_nickname = user_nickname;
    }

    public String getUser_head_image() {
        return user_head_image;
    }

    public void setUser_head_image(String user_head_image) {
        this.user_head_image = user_head_image;
    }

    public int getExpert_userid() {
        return expert_userid;
    }

    public void setExpert_userid(int expert_userid) {
        this.expert_userid = expert_userid;
    }

    public String getExpert_name() {
        return expert_name;
    }

    public void setExpert_name(String expert_name) {
        this.expert_name = expert_name;
    }

    public String getExpert_nickname() {
        return expert_nickname;
    }

    public void setExpert_nickname(String expert_nickname) {
        this.expert_nickname = expert_nickname;
    }

    public String getExpert_head_image() {
        return expert_head_image;
    }

    public void setExpert_head_image(String expert_head_image) {
        this.expert_head_image = expert_head_image;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
