package com.javarush.test.level18.lesson10.home02;

/* Пробелы
В метод main первым параметром приходит имя файла.
Вывести на экран соотношение количества пробелов к количеству всех символов. Например, 10.45
1. Посчитать количество всех символов.
2. Посчитать количество пробелов.
3. Вывести на экран п2/п1*100, округлив до 2 знаков после запятой
4. Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            FileInputStream fileInputStream = new FileInputStream(args[0]);

            double sumAll = 0;
            double sumSpaces = 0;
            while (fileInputStream.available() > 0) {
                int bite = fileInputStream.read();
                if (bite == 32) {
                    sumSpaces++;
                }
                sumAll++;
            }

            double result = Math.rint((sumSpaces / sumAll * 100) * 100) / 100;
            System.out.println(result);
            fileInputStream.close();
        }
    }
}
