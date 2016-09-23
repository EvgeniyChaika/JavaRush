package com.javarush.test.level18.lesson03.task05;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Сортировка байт
Ввести с консоли имя файла
Считать все байты из файла.
Не учитывая повторений - отсортировать их по байт-коду в возрастающем порядке.
Вывести на экран
Закрыть поток ввода-вывода

Пример байт входного файла
44 83 44

Пример вывода
44 83
*/

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inp = new FileInputStream(r.readLine());

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> reslist = new ArrayList<>();

        while (inp.available() > 0) {
            int data = inp.read();
            list.add(data);
        }

        for (Integer aList : list) {
            if (!reslist.contains(aList)) {
                reslist.add(aList);
            }
        }

        Collections.sort(reslist);

        for (Integer x : reslist) {
            System.out.print(x + " ");
        }

        r.close();
        inp.close();
    }
}
