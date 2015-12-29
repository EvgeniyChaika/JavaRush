package com.javarush.test.level14.lesson08.home09;

public abstract class Money
{
    private  int money;
    public Money(int amount)
    {
        this.money = amount;
    }


    public int getAmount(){
        return money;
    }

    public abstract String getCurrencyName();
}

