package com.javarush.test.level07.lesson04.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        String[] array = new String[10];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int a = 0; a < 8; a++) {
            array[a] = reader.readLine();
        }
        for (int a = array.length - 1; a >= 0; a--) {

            System.out.println(array[a]);
            System.out.println();
        }

    }
}