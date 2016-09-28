package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream inputStream1 = new FileInputStream(file1);

        byte[] buffer1 = new byte[0];

        while (inputStream1.available() > 0) {
            buffer1 = new byte[inputStream1.available()];
            int count1 = inputStream1.read(buffer1);
        }

        FileInputStream inputStream2 = new FileInputStream(file2);

        byte[] buffer2 = new byte[0];
        while (inputStream2.available() > 0) {
            buffer2 = new byte[inputStream2.available()];
            int count2 = inputStream2.read(buffer2);
        }

        byte[] result = new byte[buffer1.length + buffer2.length];

        System.arraycopy(buffer2, 0, result, 0, buffer2.length);
        System.arraycopy(buffer1, 0, result, buffer2.length, buffer1.length);

        FileOutputStream outputStream1 = new FileOutputStream(file1);

        outputStream1.write(result);

        reader.close();
        inputStream1.close();
        inputStream2.close();
        outputStream1.close();
    }
}
