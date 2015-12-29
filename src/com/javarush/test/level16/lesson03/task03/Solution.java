package com.javarush.test.level16.lesson03.task03;

import java.util.ArrayList;
import java.util.List;

/* Список и нити
В методе main добавить в статический объект list 5 нитей SpecialThread - различных объектов.
*/

public class Solution {
    public static volatile List<Thread> list = new ArrayList<Thread>(5);

    public static void main(String[] args) {

        Thread st = new Thread(new SpecialThread());
       list.add(st);

        Thread st1 = new Thread(new SpecialThread());
       list.add(st1);

        Thread st2 = new Thread(new SpecialThread());
       list.add(st2);

        Thread st3 = new Thread(new SpecialThread());
       list.add(st3);

        Thread st4 = new Thread(new SpecialThread());
       list.add(st4);



    }

    public static class SpecialThread  implements Runnable {
        public void run() {
            System.out.println("it's run method inside SpecialThread");
        }
    }
}
