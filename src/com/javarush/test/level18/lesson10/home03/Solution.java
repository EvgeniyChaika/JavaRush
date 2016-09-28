package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream inputStream2 = new FileInputStream(file2);
        FileInputStream inputStream3 = new FileInputStream(file3);
        FileOutputStream outputStream1 = new FileOutputStream(file1);

        while (inputStream2.available() > 0) {
            byte[] buffer2 = new byte[inputStream2.available()];
            int count2 = inputStream2.read(buffer2);
            outputStream1.write(buffer2, 0, count2);
        }

        while (inputStream3.available() > 0) {
            byte[] buffer3 = new byte[inputStream3.available()];
            int count3 = inputStream3.read(buffer3);
            outputStream1.write(buffer3);
        }

        reader.close();
        inputStream2.close();
        inputStream3.close();
        outputStream1.close();
    }
}
