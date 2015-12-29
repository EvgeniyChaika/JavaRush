package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        Map<String, String> fa = new HashMap<String, String>();
        while (true) {
            String address = reader.readLine();
            if (address.isEmpty()) break;
            String family = reader.readLine();
            fa.put(family, address);

        }

        String town = reader.readLine();

        for (Map.Entry<String, String> pair : fa.entrySet()) {
            if (pair.getValue().equals(town))
                System.out.println(pair.getKey());
        }

    }
}