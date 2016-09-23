package com.javarush.test.level18.lesson03.task01;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String data = reader.readLine();

        FileInputStream inputStream = new FileInputStream(data);

        int big = 0;
        while (inputStream.available() > 0) {
            int bit = inputStream.read();
            if (bit > big) {
                big = bit;
            }
        }
        inputStream.close();
        System.out.println(big);
    }
}
