package com.javarush.test.level05.lesson05.task01;

/* Создать класс Cat
Создать класс Cat. У кота должно быть имя (name, String), возраст (age, int), вес (weight, int), сила (strength, int).
*/

public class Cat {
    private String name;
    private int age;
    private int weight;
    private int strength;


    public static void main(String[] args) {



        Cat cat1 = new Cat();

        cat1.name = "Васька";
        cat1.age = 3;
        cat1.weight = 7;
        cat1.strength = 10;


    }
}