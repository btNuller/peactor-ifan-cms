package com.peactor.ifancms.exception;

/**
 * @Author: Ifan
 * date: 2020-03-20
 **/
public class CommonException extends RuntimeException {

    public CommonException() {
        super();
    }

    public CommonException(String message) {
        super(message);
    }

    public CommonException(String message, Throwable cause) {
        super(message, cause);
    }

    public CommonException(Throwable cause) {
        super(cause);
    }

    protected CommonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public CommonException(String message,String... append) {
        super(String.format(message, append));
    }
}
