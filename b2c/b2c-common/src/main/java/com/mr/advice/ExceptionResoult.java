package com.mr.advice;


public class ExceptionResoult {

    private Long dataTime;
    private Integer code;
    private String message;

    public Long getDataTime() {
        return dataTime;
    }

    public void setDataTime(Long dataTime) {
        this.dataTime = dataTime;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ExceptionResoult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
