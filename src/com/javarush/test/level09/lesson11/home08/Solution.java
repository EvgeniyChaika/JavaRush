package com.javarush.test.level09.lesson11.home08;

import java.util.ArrayList;

/* Список из массивов чисел
Создать список, элементами которого будут массивы чисел. Добавить в список пять объектов–массивов длиной 5, 2, 4, 7, 0 соответственно. Заполнить массивы любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList()
    {
        ArrayList<int[]> list = new ArrayList<int[]>();
        int[] array = {0, 1, 2, 3, 4};
        int[] array1 = {0, 1};
        int[] array2 = {0, 1, 2, 3};
        int[] array3 = {0, 1, 2, 3, 4, 5, 6};
        int[] array4 = {};
        list.add(array);
        list.add(array1);
        list.add(array2);
        list.add(array3);
        list.add(array4);
        printList(list);
        return list;
    }

    public static void printList(ArrayList<int[]> list)
    {
        for (int[] array: list )
        {
            for (int x: array)
            {
                System.out.println(x);
            }
        }
    }
}
