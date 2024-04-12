package com.example.noteapp.model;

import com.google.type.DateTime;

public class Post {


    private String id;
    private String content;
    private String title;
    private String color;

    private String datetime;

    public Post() {
    }

    public Post(String id, String title, String content, String color, String datetime) {
        this.id = id;
        this.content = content;
        this.title = title;
        this.color = color;
        this.datetime = datetime;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDatetime() {
        return datetime;
    }

    public void setDatetime(String datetime) {
        this.datetime = datetime;
    }
}
