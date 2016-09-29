package com.javarush.test.level18.lesson10.home07;

/* Поиск данных внутри файла
Считать с консоли имя файла
Найти в файле информацию, которая относится к заданному id, и вывести ее на экран в виде, в котором она записана в файле.
Программа запускается с одним параметром: id (int)
Закрыть потоки. Не использовать try-with-resources

В файле данные разделены пробелом и хранятся в следующей последовательности:
id productName price quantity

где id - int
productName - название товара, может содержать пробелы, String
price - цена, double
quantity - количество, int

Информация по каждому товару хранится в отдельной строке
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            throw new IllegalArgumentException();
        }

        int idRow = Integer.valueOf(args[0]);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file = reader.readLine();

        FileInputStream inputStream = new FileInputStream(file);

        String[] arrRows = new String[0];
        while (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            arrRows = new String(buffer).split("\\n");
        }

        String[] arrOfRow;
        for (String row : arrRows) {
            arrOfRow = row.split(" ");
            if (idRow == Integer.valueOf(arrOfRow[0])) {
                System.out.println(row);
                break;
            }
        }

        reader.close();
        inputStream.close();
    }
}
