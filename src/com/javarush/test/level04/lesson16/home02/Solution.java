package com.javarush.test.level04.lesson16.home02;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
       String a1 = reader.readLine();
       int a = Integer.parseInt(a1);
        String b1 = reader.readLine();
       int b = Integer.parseInt(b1);
        String c1 = reader.readLine();
       int c = Integer.parseInt(c1);

        if ((a > b && a < c)||(a < b && a > c)){
            System.out.println(a);
        }else if
        ((b > a && b < c)||(b < a && b > c)){
            System.out.println(b);
        }else if
            ((c > b && c < a) || (c < b && c > a))
                System.out.println(c);


        }
        //Напишите тут ваш код
    }

