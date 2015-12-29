package com.javarush.test.level04.lesson10.task05;

/* Таблица умножения
Вывести на экран таблицу умножения 10х10 используя цикл while.
Числа разделить пробелом.
1 2 3 4 5 6 7 8 9 10
2 4 6 8 10 12 14 16 18 20
...
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        int i = 1;
        while (i <= 10)
        {
            System.out.println(i*1 + " " + i*2 + " " + i*3 + " " + i*4 + " " + i*5 + " " + i*6 + " " + i*7 + " " + i*8 + " " + i*9 + " " + i*10);
            i++;


        }


    }
}