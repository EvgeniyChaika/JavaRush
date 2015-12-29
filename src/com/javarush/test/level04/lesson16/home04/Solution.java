package com.javarush.test.level04.lesson16.home04;

/* Меня зовут 'Вася'...
Ввести с клавиатуры строку name.
Ввести с клавиатуры дату рождения (три числа): y, m, d.
Вывести на экран текст:
«Меня зовут name
Я родился d.m.y»
Пример:
Меня зовут Вася
Я родился 15.2.1988
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String y1 = reader.readLine();
        int y = Integer.parseInt(y1);
        String m1 = reader.readLine();
        int m = Integer.parseInt(m1);
        String d1 = reader.readLine();
        int d = Integer.parseInt(d1);

        System.out.println("Меня зовут " + name);
        System.out.println("Я родился " + d + "." + m + "." + y);

    }
}
