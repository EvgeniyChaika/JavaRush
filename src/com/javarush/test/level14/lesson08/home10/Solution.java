package com.javarush.test.level14.lesson08.home10;

import java.util.LinkedList;
import java.util.List;

/* Исправить 4 ошибки
Исправить 4 ошибки в конструкторе NotIncapsulatedClass и отрефактори код
1. В класе NotIncapsulatedClass создать private методы initList, printListValues, processCastedObjects.
2. Метод initList должен заполнять значениями входящий параметр list:
- найди нужный блок кода в конструкторе, в котором list заполняется значениями
- перенеси его в метод initList
- верни заполненный list.
3. Метод printListValues должен принимать параметр list и вывести в консоль все элементы из списка list:
- метод ничего не возвращает
- найди нужный блок кода в конструкторе, в котором в цикле из списка list выводятся в консоль все значения
- перенеси его в метод printListValues
- исправь 2 ошибки в этом методе.
4. Метод processCastedObjects должен проверить:
- входящий параметр имеет тип Number
- метод ничего не возвращает
- найди нужный блок кода в конструкторе, в котором в цикле для каждого объекта из списка list проверяется его тип
- перенеси этот блок в метод processCastedObjects
- исправь 2 ошибки в этом методе
- учти, что для объекта типа Float нужно вывести "Is float value defined? " + [Float_object].isNaN()
- учти, что для объекта типа Double нужно вывести "Is double value infinite? " + [Double_object].isInfinite().
*/

public class Solution {
    public static void main(String[] args) {
        new NotIncapsulatedClass();
    }

    public static class NotIncapsulatedClass {
        public NotIncapsulatedClass() {
            List<Number> list = new LinkedList<Number>();
            initList(list);
            printListValues(list);
            processCastedObjects(list);
        }
        private List initList(List<Number> list) {
            list.add(new Double(1000f));
            list.add(new Double("123e-445632"));
            list.add(new Float(-90 / -3));
            list.remove(new Double("123e-445632"));
            return list;
        }

        private void printListValues(List list) {
            for (int i = 0; i < list.size(); i++)

            {
                System.out.println(list.get(i));
            }
        }

        private void processCastedObjects(List<Number> list) {
            for (Number object : list) {
                if (object instanceof Float) {
                    Float a = (Float) object;
                    System.out.println("Is float value defined? " + a.isNaN());
                } else if (object instanceof Double) {
                    Double a = (Double) object;
                    System.out.println("Is double value infinite? " + a.isInfinite());
                }
            }
        }
    }
}

