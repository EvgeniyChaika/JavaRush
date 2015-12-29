package com.javarush.test.level06.lesson11.bonus03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/* Задача по алгоритмам
Задача: Написать программу, которая вводит с клавиатуры 5 чисел и выводит их в возрастающем порядке.
Пример ввода:
3
2
15
6
17
Пример вывода:
2
3
6
15
17
*/

public class Solution
{
    public static void main( String[] args ) throws Exception
    {
        final int N = 5;
        int[] numbers = new int[N];
        BufferedReader reader = new BufferedReader( new InputStreamReader( System.in ) );

        for ( int i = 0; i < numbers.length; i++ )
        {
            numbers[i] = Integer.parseInt( reader.readLine() );
        }

        Arrays.sort(numbers);

        for ( int i : numbers ) {
            System.out.println(i);
        }
    }
}