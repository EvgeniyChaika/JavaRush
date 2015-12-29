package com.javarush.test.level09.lesson02.task04;

/* Стек-трейс длиной 10 вызовов
Напиши код, чтобы получить стек-трейс длиной 10 вызовов.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        method1();
    }

    public static StackTraceElement[] method1()
    {
        return method2();
    }

    public static StackTraceElement[] method2()
    {
        return method3(); //Напишите тут ваш код

    }

    public static StackTraceElement[] method3()
    {
        return method4(); //Напишите тут ваш код

    }

    public static StackTraceElement[] method4()
    {
        return method5(); //Напишите тут ваш код

    }

    public static StackTraceElement[] method5()
    {
        return method6(); //Напишите тут ваш код

    }

    public static StackTraceElement[] method6()
    {
        return method7(); //Напишите тут ваш код

    }

    public static StackTraceElement[] method7()
    {
        return method8(); //Напишите тут ваш код

    }

    public static StackTraceElement[] method8()
    {
        return method9();  //Напишите тут ваш код

    }

    public static StackTraceElement[] method9()
    {
        return method10();
    }

    public static StackTraceElement[] method10()

    {
        return Thread.currentThread().getStackTrace();
    }
}
