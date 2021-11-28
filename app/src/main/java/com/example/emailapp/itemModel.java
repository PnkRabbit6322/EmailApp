package com.example.emailapp;

public class itemModel {
    private String name;
    private String title;
    private String content;
    private String time;

    public itemModel(String name, String title, String content, String time) {
        this.name = name;
        this.title = title;
        this.content = content;
        this.time = time;
    }

    public String getFirstChar(){
        return String.valueOf(this.name.charAt(0));
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
