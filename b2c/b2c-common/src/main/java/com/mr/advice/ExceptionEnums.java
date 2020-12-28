package com.mr.advice;

public enum  ExceptionEnums {
    CATEGORY_LIST_NOT_FOUNT(500,"mysql连接失败了"),
    MYSQL_CONECTION_ERROR(500,"mysql连接失败"),
    PRICE_IS_NOT_NULL(400,"价格不能为null");

    private Integer code;
    private String message;


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

    ExceptionEnums(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
