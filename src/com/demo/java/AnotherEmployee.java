package com.demo.java;

public class AnotherEmployee {

    private String firstName;
    private boolean fullTime;

    public AnotherEmployee(String firstName) {
        this.firstName = firstName;
        this.fullTime = true;
    }

    public AnotherEmployee(String firstName, boolean fullTime) {
        this.firstName = firstName;
        this.fullTime = fullTime;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public boolean isFullTime() {
        return fullTime;
    }

    public void setFullTime(boolean fullTime) {
        this.fullTime = fullTime;
    }
}
