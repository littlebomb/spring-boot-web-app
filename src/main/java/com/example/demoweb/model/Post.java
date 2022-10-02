package com.example.demoweb.model;

import java.util.Date;

public class Post {
    Long id;
    String text;
    Integer likes;
    Date creationDate;

    public Post(){
    }

    public Post(Long postId, String text, Date creationDate){
        this.id = postId;
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
    }

    public Long getId(){
        return id;
    }

    public String getText(){
        return text;
    }

    public Integer getLikes(){
        return likes;
    }
    public void setLikes(Integer likes){
        this.likes = likes;
    }

    public Date getCreationDate(){
        return creationDate;
    }
}

