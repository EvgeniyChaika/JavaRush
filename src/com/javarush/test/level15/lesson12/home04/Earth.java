package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Евгений on 16.07.2015.
 */
public class Earth implements Planet{
    private static Earth earthInstance;

    private Earth() {
    }

    public static Earth getInstance() {
        if (earthInstance == null) {
            earthInstance = new Earth();
        }
        return earthInstance;
    }
}
