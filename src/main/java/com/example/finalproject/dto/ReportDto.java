package com.example.finalproject.dto;

public class ReportDto {


    private  long id;
    private  String topic;
    private  long languages_id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public long getLanguages_id() {
        return languages_id;
    }

    public void setLanguages_id(long languages_id) {
        this.languages_id = languages_id;
    }

    public ReportDto(long id, String topic, long languages_id) {
        this.id = id;
        this.topic = topic;
        this.languages_id = languages_id;
    }

    public ReportDto(){

    }
}
