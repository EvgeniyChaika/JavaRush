package com.javarush.test.level11.lesson08.task03;

/* Ничего не поменяешь
Скрыть все внутренние переменные класса Cat, а также методы, позволяющие менять внутреннее состояние объектов класса Cat.
*/

public class Solution
{
    public static void main(String[] args)
    {
    }

    public class Cat
    {
        private String name;
        private int age;
        private int weight;

        public Cat(String name, int age, int weight)
        {
            this.name = name;
            this.age = age;
            this.weight = weight;
        }

        public String getName()
        {
            return name;
        }

        private void setName(String name)
        {
            this.name = name;
        }

        public int getAge()
        {
            return age;
        }

        private void setAge(int age)
        {
            this.age = age;
        }
    }
}
