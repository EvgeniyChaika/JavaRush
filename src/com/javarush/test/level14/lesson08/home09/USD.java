package com.javarush.test.level14.lesson08.home09;

public class USD extends Money {
    public USD(int amount) {
        super(amount);
    }

    @Override
    public String getCurrencyName() {
        return "USD";
    }
}
