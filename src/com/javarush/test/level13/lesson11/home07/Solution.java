package com.javarush.test.level13.lesson11.home07;

/* Интерфейс SimpleObject
1. Создай класс StringObject.
2. В классе StringObject реализуй интерфейс SimpleObject с параметром типа String.
3. Программа должна компилироваться.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        SimpleObject<String> stringObject = new StringObject<Object>();
    }

    interface SimpleObject<String> {
        SimpleObject<String> getInstance();
    }

    static class StringObject<Object> implements SimpleObject<String> {
        public SimpleObject<String> getInstance() {
            return new StringObject<String>();
        }
    }
}
