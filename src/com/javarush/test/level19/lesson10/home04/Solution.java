package com.javarush.test.level19.lesson10.home04;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/* Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words
Закрыть потоки. Не использовать try-with-resources

Пример: words содержит слова А, Б, В
Строки:
В Б А Д  //3 слова из words, не подходит
Д А Д    //1 слово из words, не подходит
Д А Б Д  //2 слова - подходит, выводим
*/

public class Solution {
    public static List<String> words = new ArrayList<>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(new File(reader.readLine()));

        while (sc.hasNextLine()) {
            ArrayList<String> list = new ArrayList<>();
            String line = sc.nextLine().replace("\n", "");

            initList(list, line);
            printLine(line, countWords(list));
        }
        sc.close();
        reader.close();
    }

    private static void initList(ArrayList<String> list, String line) {
        String[] wordsMas = line.replaceAll("\\p{Punct}", " ").split(" ");

        for (String s : wordsMas) {
            list.add(s);
        }
    }

    private static int countWords(ArrayList<String> list) {
        int amountWords = 0;

        for (String s : words) {
            for (String str : list) {
                if (s.equals(str)) {
                    amountWords++;
                }
            }
        }
        return amountWords;
    }

    private static void printLine(String line, int amountWords) {
        if (amountWords == 2) {
            System.out.println(line);
        }
    }
}
