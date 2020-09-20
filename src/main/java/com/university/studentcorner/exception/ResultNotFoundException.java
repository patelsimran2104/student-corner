package com.university.studentcorner.exception;

public class ResultNotFoundException extends Exception {

    /**
     * @param message Exception message to be thrown.
     */
    private String message;

    public ResultNotFoundException() {

        this.message = message;
    }

    /**
     * @return the error message to the service.
     */
    @Override
    public String getMessage() {
        return message;
    }
}