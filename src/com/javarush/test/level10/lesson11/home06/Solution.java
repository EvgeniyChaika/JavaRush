package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
       String name;
        int age;
        int weight;
        String color;
        int size;
        int bullet;

        public Human(String name, String color, int bullet) {
            this.name = name;
            this.color = color;
            this.bullet = bullet;
        }

        public Human(int bullet, String name, int weight) {
            this.bullet = bullet;
            this.name = name;
            this.weight = weight;
        }

        public Human(String name, String color, int weight, int size, int bullet) {
            this.name = name;
            this.color = color;
            this.weight = weight;
            this.size = size;
            this.bullet = bullet;
        }

        public Human(String name, int age, int weight, int bullet) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.bullet = bullet;
        }

        public Human(String name, int bullet) {
            this.name = name;
            this.bullet = bullet;
        }

        public Human(String name, String color, int bullet, int weight) {
            this.name = name;
            this.color = color;
            this.bullet = bullet;
            this.weight = weight;
        }
        public Human(String name, int age, int weight) {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public Human(String name, int age, int weight, String color) {

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = color;
        }

        public Human(String name, int age, int weight, String color, int size) {

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.color = color;
            this.size = size;
        }

        public Human(String name, int age, int weight, int size, String color, int bullet) {

            this.name = name;
            this.age = age;
            this.weight = weight;
            this.size = size;
            this.color = color;
            this.bullet = bullet;
        }
    }
}
