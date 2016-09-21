package com.javarush.test.level17.lesson10.home03;

import java.util.ArrayList;
import java.util.List;

/* Аптека
Реализуй интерфейс Runnable в классах Apteka и Person.
Все нити должны работать пока не isStopped
Логика для Apteka: drugsController должен сделать закупку случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 300 мс
Логика для Person: drugsController должен сделать продажу случайного лекарства (getRandomDrug) в количестве (getRandomCount) и подождать 100 мс
Расставь synchronized там, где это необходимо
*/

public class Solution {
    public static DrugsController drugsController = new DrugsController();
    public static boolean isStopped = false;

    public static void main(String[] args) throws InterruptedException {
        Thread apteka = new Thread(new Apteka());
        Thread man = new Thread(new Person(), "Мужчина");
        Thread woman = new Thread(new Person(), "Женщина");

        apteka.start();
        man.start();
        woman.start();

        Thread.sleep(1000);
        isStopped = true;
    }

    public static class Apteka implements Runnable {

        @Override
        public void run() {
            while (!isStopped) {
                drugsController.buy(getRandomDrug(), getRandomCount());
                try {
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Person implements Runnable {

        @Override
        public void run() {
            while (!isStopped) {
                drugsController.sell(getRandomDrug(), getRandomCount());
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static int getRandomCount() {
        return (int) (Math.random() * 3) + 1;
    }

    public static Drug getRandomDrug() {
        int index = (int) ((Math.random() * 1000) % (drugsController.allDrugs.size()));
        List<Drug> drugs = new ArrayList<>(drugsController.allDrugs.keySet());
        return drugs.get(index);
    }

    private static void waitAMoment() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
        }
    }
}
