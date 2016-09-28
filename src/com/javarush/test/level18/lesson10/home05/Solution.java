package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
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

        FileOutputStream outputStream1 = new FileOutputStream(file2);

        outputStream1.write(getData(buffer1));

        reader.close();
        inputStream1.close();
        outputStream1.close();
    }

    private static byte[] getData(byte[] data) {

        String[] arr = new String(data).split(" ");

        StringBuilder builder = new StringBuilder();

        byte[] res;
        long[] tmp = new long[arr.length];

        for (int i = 0; i < arr.length; i++) {
            tmp[i] = Math.round(Double.valueOf(arr[i]));
        }

        for (long i : tmp) {
            builder.append(i);
            builder.append(" ");
        }

        res = builder.toString().getBytes();

        return res;
    }
}
