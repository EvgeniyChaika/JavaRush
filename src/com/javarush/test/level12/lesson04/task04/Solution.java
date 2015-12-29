package com.javarush.test.level12.lesson04.task04;

/* Три метода возвращают минимальное из двух переданных в него чисел
Написать public static методы: int min(int, int), long min(long, long), double min(double, double).
Каждый метод должен возвращать минимальное из двух переданных в него чисел.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static int min(int a, int b){
        if (a < b){
            return a;
        }else return b;
    }
    public static long min(long k, long l){
        if (k < l){
            return k;
        }else return l;
    }
    public static double min(double f, double g){
        if (f < g){
            return f;
        }else return g;
    }
}
