package com.javarush.test.level20.lesson04.task02;

import java.util.ArrayList;
import java.util.List;

/* Как сериализовать JavaRush?
Сделайте так, чтобы сериализация класса JavaRush была возможной
*/
public class Solution {
    public static class JavaRush {
        public List<User> users = new ArrayList<>();
    }
}
