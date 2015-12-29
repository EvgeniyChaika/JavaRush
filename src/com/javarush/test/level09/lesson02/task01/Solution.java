package com.javarush.test.level09.lesson02.task01;

/* Каждый метод должен возвращать свой StackTrace
Написать пять методов, которые вызывают друг друга. Каждый метод должен возвращать свой StackTrace.
*/


public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static StackTraceElement[] method1() {
        method2();
//Напишите тут ваш код
        StackTraceElement[] stackTraceElementsMethod1 = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElementsMethod1){
            System.out.println("method1: " + element.getMethodName());
        }
        return stackTraceElementsMethod1;
    }

    public static StackTraceElement[] method2() {
        method3();
//Напишите тут ваш код
        StackTraceElement[] stackTraceElementsMethod2 = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElementsMethod2){
            System.out.println("method2: "  + element.getMethodName());
        }
        return stackTraceElementsMethod2;
    }

    public static StackTraceElement[] method3() {
        method4();
//Напишите тут ваш код
        StackTraceElement[] stackTraceElementsMethod3 = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElementsMethod3){
            System.out.println("method3: "  + element.getMethodName());
        }
        return stackTraceElementsMethod3;
    }

    public static StackTraceElement[] method4() {
        method5();
//Напишите тут ваш код
        StackTraceElement[] stackTraceElementsMethod4 = Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElementsMethod4){
            System.out.println("method4: " + element.getMethodName());
        }
        return stackTraceElementsMethod4;
    }

    public static StackTraceElement[] method5() {
//Напишите тут ваш код
        StackTraceElement[] stackTraceElementsMethod5 =Thread.currentThread().getStackTrace();
        for (StackTraceElement element: stackTraceElementsMethod5){
            System.out.println("method5: " + element.getMethodName());
        }
        return stackTraceElementsMethod5;
    }
}
