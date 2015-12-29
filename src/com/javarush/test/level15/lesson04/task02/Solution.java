package com.javarush.test.level15.lesson04.task02;

/* ООП - Перегрузка
Перегрузите метод printMatrix 8 различными способами. В итоге должно получиться 10 различных методов printMatrix.
*/

public class Solution {
    public static void main(String[] args) {
        printMatrix(2, 3, "8");

    }

    public static void printMatrix(int m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Integer value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, int n, Double value) {
        System.out.println("Заполняем объектами Double");
        printMatrix(m, n, (Object) value);
    }

    public static void printMatrix(int m, byte n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix(m, (int) n, (Object) value);
    }

    public static void printMatrix(byte m, int n, String value) {
        System.out.println("Заполняем объектами String");
        printMatrix((int) m, n, (Object) value);
    }

    public static void printMatrix(byte m, int n, Double value) {
        System.out.println("Заполняем объектами Double");
        printMatrix((int) m, n, (Object) value);
    }

    public static void printMatrix(int m, byte n, Double value) {
        System.out.println("Заполняем объектами Double");
        printMatrix(m, (int) n, (Object) value);
    }

    public static void printMatrix(byte m, int n, Integer value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix((int) m, n, (Object) value);
    }

    public static void printMatrix(int m, byte n, Integer value) {
        System.out.println("Заполняем объектами Integer");
        printMatrix(m, (int) n, (Object) value);
    }

    public static void printMatrix(int m, int n, Object value) {
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }
}
