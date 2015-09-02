package com.magikey.common.exception;

/**
 * Created by dingyan on 15/9/1.
 */
public class BaseError extends Error {
    private String errorName;
    private String errorMessage;

    public BaseError() {
        super();
    }

    public String getErrorName() {
        return errorName;
    }

    public void setErrorName(String errorName) {
        this.errorName = errorName;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
