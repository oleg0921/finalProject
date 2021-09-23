package com.example.finalproject.request;

public class ReportRequest {

    private  String topic;
    private  String languag;


    public ReportRequest()
    {

    }
    public ReportRequest(String topic, String languag) {
        this.topic = topic;
        this.languag = languag;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getLanguag() {
        return languag;
    }

    public void setLanguag(String languag) {
        this.languag = languag;
    }
}
