package com.own_exception_test;

public class ExceptionJuani extends Exception {
    private String sms;

    public ExceptionJuani(String sms) {
        this.sms=sms;
    }

    @Override
    public String toString() {
        return "ExceptionJuani{" +
                "sms='" + sms + '\'' +
                '}';
    }
}
