package com.javarush.test.level12.lesson12.home01;

/* Метод getName в классе Cat
Переопредели метод getName в классе Cat так, чтобы программа выдавала на экран надпись
«Я - кот».
*/

public class Solution
{
    public static void main(String[] args)
    {
        Pet pet = new Cat();

        System.out.println(pet.getName());
    }

    public static class Pet
    {
        public String getName()
        {
            return "Я - пушистик";
        }
    }

    public static class Cat extends Pet
    {
        public String getName()
        {
            return "Я - кот";
        }
    }
}
