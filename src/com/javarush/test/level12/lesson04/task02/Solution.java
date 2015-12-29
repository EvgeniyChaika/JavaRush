package com.javarush.test.level12.lesson04.task02;

/* print(int) и print(Integer)
Написать два метода: print(int) и print(Integer).
Написать такой код в методе main, чтобы вызвались они оба.
*/

public class Solution
{
    public static void main(String[] args)
    {
         print(7);
         print(9);
    }
    public static void print(int k){
        System.out.println(k);
    }
    public void print(Integer f){
        System.out.println(f);
    }

}
