package com.javarush.test.level14.lesson08.home09;

public class Hrivna extends Money {


    public Hrivna(int amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "HRN";
    }
}
