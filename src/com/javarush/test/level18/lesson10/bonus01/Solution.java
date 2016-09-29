package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length < 3) {
            throw new IllegalArgumentException();
        }

        String file1 = args[1];
        String file2 = args[2];

        FileInputStream inputStream = new FileInputStream(file1);
        FileOutputStream outputStream = new FileOutputStream(file2);

        if (("-e").equals(args[0])) {
            while (inputStream.available() > 0) {
                byte[] buffer = new byte[inputStream.available()];
                int count = inputStream.read(buffer);
                for (int i = 0; i < buffer.length; i++) {
                    buffer[i] = (byte) (buffer[i] + 1);
                }
                outputStream.write(buffer, 0, count);
            }
        } else if (("-d").equals(args[0])) {
            while (inputStream.available() > 0) {
                byte[] buffer = new byte[inputStream.available()];
                int count = inputStream.read(buffer);
                for (int i = 0; i < buffer.length; i++) {
                    buffer[i] = (byte) (buffer[i] - 1);
                }
                outputStream.write(buffer, 0, count);
            }
        } else {
            throw new IllegalArgumentException();
        }

        inputStream.close();
        outputStream.close();
    }
}
