package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a1 = reader.readLine();
        String b1 = reader.readLine();
        String c1 = reader.readLine();

        int a = Integer.parseInt(a1);
        int b = Integer.parseInt(b1);
        int c = Integer.parseInt(c1);


        int fst;
        int scd;
        int thd;



        if (a > b && a > c) {
            fst = a;
            System.out.print(fst + " ");

        } else if (b > c && b > a) {
            fst = b;
            System.out.print(fst + " ");
        } else if (c > a && c > b) {
            fst = c;
            System.out.print(fst + " ");
        }



        if ((a > b && a < c)||(a < b && a > c)) {
            scd = a;
            System.out.print(scd + " ");

        } else if ((b > c && b < a)||(b < c && b > a)) {
            scd = b;
            System.out.print(scd + " ");
        } else if ((c > a && c < b)||(c < a && c > b)) {
            scd = c;
            System.out.print(scd + " ");
        }
        if (a < b && a < c) {
            thd = a;
            System.out.print(thd + " ");

        } else if (b < c && b < a) {
            thd = b;
            System.out.print(thd + " ");
        } else if (c < a && c < b) {
            thd = c;
            System.out.print(thd + " ");
        }

    }
}
