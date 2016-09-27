package com.javarush.test.level18.lesson10.home01;

/* Английские буквы
В метод main первым параметром приходит имя файла.
Посчитать количество букв английского алфавита, которое есть в этом файле.
Вывести на экран число (количество букв)
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.FileInputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length > 0) {
            FileInputStream fileInputStream = new FileInputStream(args[0]);

            int sum = 0;
            while (fileInputStream.available() > 0) {
                int bite = fileInputStream.read();
                if ((bite >= 65 && bite <= 90) || (bite >= 97 && bite <= 122)) {
                    sum++;
                }
            }
            System.out.println(sum);
            fileInputStream.close();
        }
    }
}
