package com.javarush.test.level03.lesson12;

public class Cat1
{


    public static void main(String[] args)
    {
        Cat cat1 = new Cat();
           Cat.count++; //add your code here

        Cat cat2 = new Cat();
       Cat.count++; //add your code here

        System.out.println("Cats count is " + Cat.count);
    }
    public static class Cat
    {
        public static int count = 0;
    }
}
