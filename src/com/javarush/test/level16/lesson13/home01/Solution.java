package com.javarush.test.level16.lesson13.home01;

/* Thread.currentThread - всегда возвращает текущую нить
1. В методе printMsg присвой переменной t текущую нить.
2. В методе printMsg после всех действий поставь задержку в 1 миллисекунду.
*/

public class Solution {
    static int count = 5;

    public static void main(String[] args) {
        NameOfDefferentThreads tt = new NameOfDefferentThreads();
        tt.start();
        for (int i = 0; i < count; i++) {
            tt.printMsg();
        }
    }

    public static class NameOfDefferentThreads extends Thread {
        public void run() {
            for (int i = 0; i < count; i++) {
                printMsg();
            }
        }
        public void printMsg() {
            Thread t = Thread.currentThread();//присвой переменной t текущую нить
            String name = t.getName();
            System.out.println("name=" + name);
            try {
                Thread.sleep(1); //add sleep here - добавь sleep тут
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
