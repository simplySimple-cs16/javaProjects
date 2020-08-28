package com.kadum.samsung.exception;

import java.util.Date;

public class ErrorDetails {
    private Date TimeStamp;
    private String Message;
    private String Details;

    public ErrorDetails(Date timeStamp, String message, String details) {
        TimeStamp = timeStamp;
        Message = message;
        Details = details;
    }

    public Date getTimeStamp() {
        return TimeStamp;
    }

    public void setTimeStamp(Date timeStamp) {
        TimeStamp = timeStamp;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public String getDetails() {
        return Details;
    }

    public void setDetails(String details) {
        Details = details;
    }
}
