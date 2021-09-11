package com.souvik.model;

public class CheckRequest {
    private String status;
    private String level;

    public CheckRequest(){}

    public CheckRequest(String status, String level) {
        this.status = status;
        this.level = level;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}
