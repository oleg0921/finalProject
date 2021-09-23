package com.example.finalproject.entity;

public class Language {

    private long id;
    private String code;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Language(long id, String code) {
        this.id = id;
        this.code = code;
    }

    public Language() {
    }
}
