package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Евгений on 16.07.2015.
 */
public class Moon implements Planet{
    private static Moon moonInstance;

    private Moon() {
    }

    public static Moon getInstance() {
        if (moonInstance == null) {
            moonInstance = new Moon();
        }
        return moonInstance;
    }
}