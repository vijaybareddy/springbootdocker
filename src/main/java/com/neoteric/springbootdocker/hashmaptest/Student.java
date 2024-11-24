package com.neoteric.springbootdocker.hashmaptest;

public class Student {
    private String telugu;
    public String Maths;

    public String Hindhi;

    public String English;

    public Student(String telugu, String maths, String hindhi, String english) {
        this.telugu = telugu;
        Maths = maths;
        Hindhi = hindhi;
        English = english;
    }

    public String getTelugu() {
        return telugu;
    }

    public void setTelugu(String telugu) {
        this.telugu = telugu;
    }

    public String getMaths() {
        return Maths;
    }

    public void setMaths(String maths) {
        Maths = maths;
    }

    public String getHindhi() {
        return Hindhi;
    }

    public void setHindhi(String hindhi) {
        Hindhi = hindhi;
    }

    public String getEnglish() {
        return English;
    }

    public void setEnglish(String english) {
        English = english;
    }
}