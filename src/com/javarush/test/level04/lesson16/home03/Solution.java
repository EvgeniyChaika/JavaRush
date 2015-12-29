package com.javarush.test.level04.lesson16.home03;

/* Посчитать сумму чисел
Вводить с клавиатуры числа и считать их сумму. Если пользователь ввел -1, вывести на экран сумму и завершить программу.  -1 должно учитываться в сумме.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a;
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {

            a = Integer.parseInt(reader.readLine());
            sum += a;
            if (a == -1) {
                break;
            }
        }
        System.out.println(sum);



    }


}


