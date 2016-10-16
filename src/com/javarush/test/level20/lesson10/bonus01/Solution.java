package com.javarush.test.level20.lesson10.bonus01;

import java.util.Vector;

/* Алгоритмы-числа
Число S состоит из M чисел, например, S=370 и M(количество цифр)=3
Реализовать логику метода getNumbers, который должен среди натуральных чисел меньше N (long)
находить все числа, удовлетворяющие следующему критерию:
число S равно сумме его цифр, возведенных в M степень
getNumbers должен возвращать все такие числа в порядке возрастания

Пример искомого числа:
370 = 3*3*3 + 7*7*7 + 0*0*0
8208 = 8*8*8*8 + 2*2*2*2 + 0*0*0*0 + 8*8*8*8

На выполнение дается 10 секунд и 50 МБ памяти.
*/
public class Solution {
    public static void main(String[] args) {
        int number = 1000000;
        long freeMemory = Runtime.getRuntime().freeMemory();
        long startTime = System.currentTimeMillis();
        int[] a = getNumbers(number);
        long memoryAfterCalculate = Runtime.getRuntime().freeMemory();
        long delta = memoryAfterCalculate - freeMemory;
        long stopTime = System.currentTimeMillis();
        System.out.println("Calculating time: " + (stopTime - startTime));
        System.out.println("Used JVM memory: " + delta);
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int[] getNumbers(int N) {
        Vector<Integer> v = new Vector<>();
        for (int i = 1; i < N; i++) {
            if (checkFormula(i)) {
                v.add(i);
            }
        }
        int[] result = new int[v.size()];
        for (int i = 0; i < v.size(); i++) {
            result[i] = v.get(i);
        }
        return result;
    }

    public static boolean checkFormula(int number) {
        if (number == 0) {
            return false;
        } else if (number >= 1 && number < 10) {
            return true;
        }
        int rest = number,
                sum = 0,
                digit = 0,
                digitCount = 1 + (int) Math.log10(number);
        for (int i = 0; i < digitCount; i++) {
            digit = rest % 10;
            rest = rest / 10;
            int prod = digit;
            for (int j = 1; j < digitCount; j++) {
                prod *= digit;
            }
            sum += prod;
        }
        return sum == number;
    }
}
