package com.javarush.test.level07.lesson09.task03;

import java.util.ArrayList;/* Слово «именно»
1. Создай список из слов «мама», «мыла», «раму».
2. После каждого слова вставь в список строку, содержащую слово «именно».
3. Используя цикл for вывести результат на экран, каждый элемент списка с новой строки.
*/
import java.util.Collections;

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        Collections.addAll(list, "мама", "мыла", "раму");
        for (int i = 1; i < 6; i += 2) {
            list.add(i, "именно");
        }

        for (String aList : list) {
            System.out.println(aList);

        }
    }
}
