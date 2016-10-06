package com.javarush.test.level19.lesson10.home07;

/* Длинные слова
В метод main первым параметром приходит имя файла1, вторым - файла2
Файл1 содержит слова, разделенные пробелом.
Записать через запятую в Файл2 слова, длина которых строго больше 6
Закрыть потоки. Не использовать try-with-resources

Пример выходных данных:
длинное,короткое,аббревиатура
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length != 2) {
            throw new IllegalArgumentException();
        }

        String fileName1 = args[0];
        String fileName2 = args[1];
        String input;
        ArrayList<String> fileList = new ArrayList<>();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        while ((input = fileReader.readLine()) != null) {
            fileList.add(input);
        }
        fileReader.close();

        ArrayList<String> resultWords = new ArrayList<>();
        for (String aFileList : fileList) {
            String[] stringArray = aFileList.split(" ");
            for (String aStringArray : stringArray) {
                if (aStringArray.length() > 6) {
                    resultWords.add(aStringArray);
                }
            }
        }

        String result = "";
        for (int i = 0; i < resultWords.size(); i++) {
            if (i == resultWords.size() - 1) {
                result = result + resultWords.get(i);
            } else {
                result = result + resultWords.get(i) + ",";
            }
        }

        PrintWriter printWriter = new PrintWriter(new FileWriter(fileName2));
        printWriter.println(result);
        printWriter.close();
    }
}
