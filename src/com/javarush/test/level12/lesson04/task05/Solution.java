package com.javarush.test.level12.lesson04.task05;

/* Три метода возвращают максимальное из двух переданных в него чисел
Написать public static методы: int max(int, int), long max (long, long), double max (double, double).
Каждый метод должен возвращать максимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static int max(int a, int b){
        if (a > b){
            return a;
        }else return b;
    }
    public static long max(long k, long l){
        if (k > l){
            return k;
        }else return l;
    }
    public static double max(double f, double g){
        if (f > g){
            return f;
        }else return g;
    }
}
