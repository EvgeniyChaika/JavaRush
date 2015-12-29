package com.javarush.test.level14.lesson08.home05;

public class Computer {
    private Keyboard x;
    private Mouse y;
    private Monitor z;


    public Computer() {
        this.x = new Keyboard();
        this.y = new Mouse();
        this.z = new Monitor();
    }

    public Keyboard getKeyboard() {
        return x;
    }

    public Mouse getMouse() {
        return y;
    }

    public Monitor getMonitor() {
        return z;
    }
}
