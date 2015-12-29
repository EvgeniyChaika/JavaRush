package com.javarush.test.level10.lesson11.home08;

import java.util.ArrayList;

/* Массив списков строк
Создать массив, элементами которого будут списки строк. Заполнить массив любыми данными и вывести их на экран.
*/

public class Solution
{
    public static void main(String[] args)
    {
        ArrayList<String>[] arrayOfStringList =  createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList()
    {
        ArrayList[] arrayOfStringList = new ArrayList[3];

        ArrayList<String> list1 = new ArrayList<String>();
        list1.add("jij");
        list1.add("lujij");

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("jinnhmj");
        list2.add("lvdvujij");

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("yhtj");
        list3.add("ssslujij");

arrayOfStringList[0] = list1;
arrayOfStringList[1] = list2;
arrayOfStringList[2] = list3;


        return arrayOfStringList;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList)
    {
        for (ArrayList<String> list: arrayOfStringList)
        {
            for (String s : list)
            {
                System.out.println(s);
            }
        }
    }
}