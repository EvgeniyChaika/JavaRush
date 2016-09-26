package com.javarush.test.level18.lesson05.task05;

/* DownloadException
1 Считывать с консоли имена файлов.
2 Если файл меньше 1000 байт, то:
2.1 Закрыть потоки
2.2 выбросить исключение DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException {

    }

    public static class DownloadException extends Exception{

    }
}
