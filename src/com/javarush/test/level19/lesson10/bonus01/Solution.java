package com.javarush.test.level19.lesson10.bonus01;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* Отслеживаем изменения
Считать в консоли 2 имени файла - file1, file2.
Файлы содержат строки, file2 является обновленной версией file1, часть строк совпадают.
Нужно создать объединенную версию строк, записать их в список lines
Операции ADDED и REMOVED не могут идти подряд, они всегда разделены SAME
Пример:
оригинальный   редактированный    общий
file1:         file2:             результат:(lines)

строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка4                           REMOVED строка4
строка5        строка5            SAME строка5
строка0                           ADDED строка0
строка1        строка1            SAME строка1
строка2                           REMOVED строка2
строка3        строка3            SAME строка3
строка5                           ADDED строка5
строка4        строка4            SAME строка4
строка5                           REMOVED строка5
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<>();
    public static List<String> file1Lines = new ArrayList<>();
    public static List<String> file2Lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader file1Reader = new BufferedReader(new FileReader(reader.readLine()));
        BufferedReader file2Reader = new BufferedReader(new FileReader(reader.readLine()));
        reader.close();

        while (file1Reader.ready()) {
            file1Lines.add(file1Reader.readLine());
        }
        file1Reader.close();

        while (file2Reader.ready()) {
            file2Lines.add(file2Reader.readLine());
        }
        file2Reader.close();

        int i1 = 0, i2 = 0;
        boolean list1Empty = false;
        boolean list2Empty = false;

        while (true) {
            if (i1 >= file1Lines.size()) {
                list1Empty = true;
            }
            if (i2 >= file2Lines.size()) {
                list2Empty = true;
            }

            if (list1Empty && !list2Empty) {
                if (lines.get(lines.size() - 1).type.equals(Type.SAME)) {
                    lines.add(new LineItem(Type.ADDED, file2Lines.get(i2)));
                    break;
                } else
                    return;
            }
            if (list2Empty && !list1Empty) {
                if (lines.get(lines.size() - 1).type.equals(Type.SAME)) {
                    lines.add(new LineItem(Type.REMOVED, file1Lines.get(i1)));
                    break;
                } else
                    return;
            }
            if (list1Empty && list2Empty) {
                break;
            }

            if (file1Lines.get(i1).equals(file2Lines.get(i2))) {
                lines.add(new LineItem(Type.SAME, file1Lines.get(i1)));

                if (i1 < file1Lines.size()) {
                    i1++;
                } else {
                    list1Empty = true;
                }
                if (i2 < file2Lines.size()) {
                    i2++;
                } else {
                    list2Empty = true;
                }
            } else if (!list1Empty && !list2Empty) {
                if ((i2 + 1 < file2Lines.size()) && file1Lines.get(i1).equals(file2Lines.get(i2 + 1))) {
                    lines.add(new LineItem(Type.ADDED, file2Lines.get(i2)));
                    lines.add(new LineItem(Type.SAME, file1Lines.get(i1)));

                    if (i1 < file1Lines.size()) {
                        i1++;
                    } else {
                        list1Empty = true;
                    }
                    if (i2 < file2Lines.size()) {
                        i2++;
                    } else {
                        list2Empty = true;
                    }
                    if (i2 < file2Lines.size()) {
                        i2++;
                    } else {
                        list2Empty = true;
                    }
                } else if ((i1 + 1 < file1Lines.size()) && file2Lines.get(i2).equals(file1Lines.get(i1 + 1))) {
                    lines.add(new LineItem(Type.REMOVED, file1Lines.get(i1)));
                    lines.add(new LineItem(Type.SAME, file2Lines.get(i2)));

                    if (i1 < file1Lines.size()) {
                        i1++;
                    } else {
                        list1Empty = true;
                    }
                    if (i1 < file1Lines.size()) {
                        i1++;
                    } else {
                        list1Empty = true;
                    }
                    if (i2 < file2Lines.size()) {
                        i2++;
                    } else {
                        list2Empty = true;
                    }
                }
            }
        }

        for (LineItem line : lines) {
            System.out.printf("%s %s%n", line.type, line.line);
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
