package com.javarush.test.level15.lesson12.home04;

/**
 * Created by Евгений on 16.07.2015.
 */
public class Sun implements Planet{
    private static Sun sunInstance;

    private Sun() {
    }

    public static Sun getInstance() {
        if (sunInstance == null) {
            sunInstance = new Sun();
        }
        return sunInstance;
    }
}
