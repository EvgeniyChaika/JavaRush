package com.javarush.test.level07.lesson12.bonus01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Нужно исправить программу, чтобы компилировалась и работала
Задача:  Программа вводит с клавиатуры данные про котов и выводит их на экран. Пример:
Cat name is Barsik, age is 6, weight is 5, tail = 22
Cat name is Murka, age is 8, weight is 7, tail = 20
*/

public class Solution {
    public static   ArrayList<Cat> CATS = new ArrayList<Cat>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String name = reader.readLine();
            if (name.isEmpty()) break;

            String s = reader.readLine();
//            if (s.isEmpty()) break;
            int age = Integer.parseInt(s);

            String k = reader.readLine();
//            if (k.isEmpty()) break;
            int weight = Integer.parseInt(k);

            String l = reader.readLine();
//            if (l.isEmpty()) break;
            int tailLength = Integer.parseInt(l);

            Cat cat = new Cat(name, age, weight, tailLength);

            CATS.add(cat);


        }
        printList();

    }

    public static void printList() {
        for (Cat CAT : CATS) {
            System.out.println(CAT);
        }
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int tailLength;

        Cat(String name, int age, int weight, int tailLength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.tailLength = tailLength;
        }

        @Override
        public String toString() {
            return "Cat name is " + name + ", age is " + age + ", weight is " + weight + ", tail = " + tailLength;
        }
    }
}
