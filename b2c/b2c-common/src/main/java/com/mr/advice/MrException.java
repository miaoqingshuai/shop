package com.mr.advice;

public class MrException extends RuntimeException{

    // 规定code 规定一个信息
    private ExceptionEnums exceptionEnums;

    public ExceptionEnums getExceptionEnums() {
        return exceptionEnums;
    }

    public void setExceptionEnums(ExceptionEnums exceptionEnums) {
        this.exceptionEnums = exceptionEnums;
    }

    public MrException(ExceptionEnums exceptionEnums) {
        this.exceptionEnums = exceptionEnums;
    }

    public MrException(String message, ExceptionEnums exceptionEnums) {
        super(message);
        this.exceptionEnums = exceptionEnums;
    }

    public MrException(String message, Throwable cause, ExceptionEnums exceptionEnums) {
        super(message, cause);
        this.exceptionEnums = exceptionEnums;
    }

    public MrException(Throwable cause, ExceptionEnums exceptionEnums) {
        super(cause);
        this.exceptionEnums = exceptionEnums;
    }

    public MrException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace, ExceptionEnums exceptionEnums) {
        super(message, cause, enableSuppression, writableStackTrace);
        this.exceptionEnums = exceptionEnums;
    }
}
