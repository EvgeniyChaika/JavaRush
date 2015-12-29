package com.javarush.test.level08.lesson08.task02;

import java.util.HashSet;
import java.util.Iterator;

/* Удалить все числа больше 10
Создать множество чисел(Set<Integer>), занести туда 20 различных чисел.
Удалить из множества все числа больше 10.
*/

public class Solution
{

    public static HashSet<Integer> createSet()
    {
        HashSet<Integer> set = new HashSet<Integer>();
        set.add(12);
        set.add(24);
        set.add(2);
        set.add(28);
        set.add(3);
        set.add(5);
        set.add(6);
        set.add(289);
        set.add(1);
        set.add(7);
        set.add(9);
        set.add(34);
        set.add(90);
        set.add(43);
        set.add(2333);
        set.add(1232);
        set.add(23);
        set.add(2899);
        set.add(20);
        set.add(72);

        return set;

    }


    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set)
    {
        for (int i = 0; i < 20; i++) {
            Iterator<Integer> iterator = set.iterator();
            while (iterator.hasNext()){
                int k = iterator.next();
                if (k > 10) {
                    iterator.remove();
                }
            }

        }

        return set;
    }
}
