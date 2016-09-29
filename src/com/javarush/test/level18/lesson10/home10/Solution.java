package com.javarush.test.level18.lesson10.home10;

/* Собираем файл
Собираем файл из кусочков
Считывать с консоли имена файлов
Каждый файл имеет имя: [someName].partN. Например, Lion.avi.part1, Lion.avi.part2, ..., Lion.avi.part37.
Имена файлов подаются в произвольном порядке. Ввод заканчивается словом "end"
В папке, где находятся все прочтенные файлы, создать файл без приставки [.partN]. Например, Lion.avi
В него переписать все байты из файлов-частей используя буфер.
Файлы переписывать в строгой последовательности, сначала первую часть, потом вторую, ..., в конце - последнюю.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Integer, String> mapFiles = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;
        String[] arrStr = new String[0];
        String fileResult;

        while (!("end").equals(str = reader.readLine())) {
            arrStr = str.split("\\.");
            String[] endFile = arrStr[arrStr.length - 1].split("part");
            mapFiles.put(Integer.valueOf(endFile[1]), str);
        }

        reader.close();

        StringBuilder builder = new StringBuilder();

        fileResult = builder.append(arrStr[0]).append(".").append(arrStr[1]).toString();

        FileOutputStream outputStream = new FileOutputStream(fileResult);

        for (Map.Entry<Integer, String> entry : mapFiles.entrySet()) {
            FileInputStream inputStream = new FileInputStream(entry.getValue());

            while (inputStream.available() > 0) {
                byte[] buffer = new byte[inputStream.available()];
                int count = inputStream.read(buffer);
                outputStream.write(buffer);
            }

            inputStream.close();
        }

        outputStream.close();
    }
}
