package com.thinker.service.dto;

import java.io.Serializable;
import java.util.List;

public class CommentListDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    private int total;
    private List<CommentDTO> commentlist;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<CommentDTO> getCommentlist() {
        return commentlist;
    }

    public void setCommentlist(List<CommentDTO> commentlist) {
        this.commentlist = commentlist;
    }
}
