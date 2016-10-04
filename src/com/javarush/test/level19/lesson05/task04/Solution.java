package com.javarush.test.level19.lesson05.task04;

/* Замена знаков
Считать с консоли 2 имени файла.
Первый Файл содержит текст.
Заменить все точки "." на знак "!", вывести во второй файл.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(fileName1));
        ArrayList<String> list = new ArrayList<>();
        String nextLine;
        while ((nextLine = fileReader.readLine()) != null) {
            list.add(nextLine);
        }
        fileReader.close();

        PrintWriter printWriter = new PrintWriter(new FileWriter(fileName2));
        for (String aString : list) {
            aString = aString.replaceAll("\\.", "\\!");
            printWriter.println(aString);
        }
        printWriter.close();
    }
}
