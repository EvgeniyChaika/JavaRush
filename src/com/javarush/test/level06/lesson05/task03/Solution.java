package com.javarush.test.level06.lesson05.task03;

/* По 50 000 объектов Cat и Dog
Создать в цикле по 50 000 объектов Cat и Dog. (Java-машина должна начать уничтожать неиспользуемые, и метод finalize хоть раз да вызовется).
*/

public class Solution {
    public static void main(String[] args) {
        int i;
        int k = 50000;
        for (i = 0; i < k; i++) {
            Cat cat = new Cat();
        }
        for (i = 0; i < k; i++) {
            Dog dog = new Dog();

        }

    }
}

class Cat {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Cat destroyed");
    }
}

class Dog {
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Dog destroyed");
    }
}