package com.check.vo;

/**
 *
 * com.check.vo
 *
 * 2017/9/23-19:21
 * 2017
 * Created by wuqiang on 2017/9/23.
 */
public class Message <T>{
    private T data;
    private Boolean success;
    private String description;

    public Message() {
    }

    public Message(Boolean success, String description) {
        this.success = success;
        this.description = description;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
