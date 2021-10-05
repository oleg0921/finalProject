package com.example.finalproject.request;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.Date;

public class EventRequest {

    public EventRequest(Date startEvent, Date fihishEvent, String location, long moderatorId, String nameEvent, String language) {
        this.startEvent = startEvent;
        this.fihishEvent = fihishEvent;
        this.location = location;
        this.moderatorId = moderatorId;
        this.nameEvent = nameEvent;
        this.language = language;
    }

    public EventRequest() {

    }

    public static Date convertLocalDateTimeToDateUsingInstant(LocalDateTime dateToConvert) {
        return java.util.Date
                .from(dateToConvert.atZone(ZoneId.systemDefault())
                        .toInstant());
    }

    private Date startEvent;
    private Date fihishEvent;
    private String location;
    private long moderatorId;
    private String nameEvent;
    private String language;

    public Date getStartEvent() {
        return startEvent;
    }

    public void setStartEvent(Date startEvent) {
        this.startEvent = startEvent;
    }

    public Date getFihishEvent() {
        return fihishEvent;
    }

    public void setFihishEvent(Date fihishEvent) {
        this.fihishEvent = fihishEvent;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public long getModeratorId() {
        return moderatorId;
    }

    public void setModeratorId(long moderatorId) {
        this.moderatorId = moderatorId;
    }

    public String getNameEvent() {
        return nameEvent;
    }

    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
