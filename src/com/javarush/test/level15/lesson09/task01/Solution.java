package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(0.2, "b");
        labels.put(0.5, "bjh");
        labels.put(0.98, "blk");
        labels.put(0.12, "bw");
        labels.put(0.42, "bv");

    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
