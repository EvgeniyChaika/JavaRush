package com.javarush.test.level15.lesson12.home03;

import java.math.BigDecimal;

/* ООП - перегрузка
1.В классе Tree перегрузи метод info(Object s) два раза так, чтобы получилось три метода info(Object s), info(Number s), info(String s).
1.1. Разберись в методе info(Object s). Сделай по аналогии функционал новых методов.
1.2. Например, для метода info(Number s) результат может быть таким "Дерево № 123 , метод Number, параметр Short".
2. В блоке 2 должен вызываться метод info(Object s).
3. В блоке 3 должен вызываться метод info(Number s).
4. В блоке 4 должен вызываться метод info(String s).
*/

public class Solution {
    public static void main(String[] args) {
        //Блок 2.
        //Вызов для Object (задание 2)

        new Tree().info((Object) new Integer("4"));
        new Tree().info((Object) new Short("4"));
        new Tree().info((Object) new BigDecimal("4"));

        //Блок 3.
        //Вызов для Number (Задание 3)

        new Tree().info(new Integer("4"));
        new Tree().info(new Short("4"));
        new Tree().info(new BigDecimal("4"));

        //Блок 4.
        //Вызов для String (Задание 4)
        new Tree().info(new String("4"));
        new Tree().info(new Integer("4").toString());
        new Tree().info(new Short("4").toString());
        new Tree().info(new BigDecimal("4").toString());
    }
}
