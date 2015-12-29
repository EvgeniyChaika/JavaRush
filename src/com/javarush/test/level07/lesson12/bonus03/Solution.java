package com.javarush.test.level07.lesson12.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[20];
        for (int i = 0; i < 20; i++)
        {
            array[i] = Integer.parseInt(reader.readLine());
        }

        sort(array);

        for (int x : array)
        {
            System.out.println(x);
        }
    }

    public static void sort(int[] array)
    {
       for (int barrier = array.length - 1;barrier >= 0;barrier--){
           for (int i = 0; i < barrier; i++) {
               if (array[i] < array[i + 1]){
                   int tmp = array[i];
                   array[i] = array[i + 1];
                   array[i + 1] = tmp;

               }
           }


       }
    }
}
