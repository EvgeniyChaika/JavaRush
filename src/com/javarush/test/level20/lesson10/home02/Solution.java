package com.javarush.test.level20.lesson10.home02;

import java.io.ObjectInputStream;

/* Десериализация
На вход подается поток, в который записан сериализованный объект класса A либо класса B.
Десериализуйте объект в методе getOriginalObject предварительно определив, какого именно типа там объект.
Реализуйте интерфейс Serializable где необходимо.
*/
public class Solution {
    public A getOriginalObject(ObjectInputStream objectStream) {

        return null;
    }

    public class A {
    }

    public class B extends A {
        public B() {
            System.out.println("inside B");
        }
    }
}
