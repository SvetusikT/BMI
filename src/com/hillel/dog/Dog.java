package com.hillel.dog;

public class Dog {
    private int age = 12;
    protected String name;
    public String voice = "Гав-гав";

    long aLong = 423L;
    short sShort = 32767;
    byte aByte = 127;

    float aFloat = 12.23f;
    double aDouble = 1242.d;

    public void setName(String dogName) {
        name = dogName;
    }

    public String getName () {
        return name;
    }
    public String makeVoice () {
        return voice;
    }
    public int getAge () {
        return age +10;
    }
}
