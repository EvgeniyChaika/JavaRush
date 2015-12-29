package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> humans = new ArrayList<Human>();


        Human child1 = new Human();
        child1.name = "Инна";
        child1.sex = false;
        child1.age = 9;
        child1.children = new ArrayList<Human>();

        Human child2 = new Human();
        child2.name = "Инга";
        child2.sex = false;
        child2.age = 15;
        child2.children = new ArrayList<Human>();

        Human child3 = new Human();
        child3.name = "Рома";
        child3.sex = true;
        child3.age = 5;
        child3.children = new ArrayList<Human>();


        ArrayList<Human> child = new ArrayList<Human>();
        child.add(child1);
        child.add(child2);
        child.add(child3);

        Human mother = new Human();
        mother.name = "Вика";
        mother.sex = false;
        mother.age = 35;
        mother.children = child;

        ArrayList<Human> mo = new ArrayList<Human>();
        mo.add(mother);

        Human father = new Human();
        father.name = "Коля";
        father.sex = true;
        father.age = 37;
        father.children = child;

        ArrayList<Human> fa = new ArrayList<Human>();
        fa.add(father);

        Human grandFather = new Human();
        grandFather.name = "Вася";
        grandFather.sex = true;
        grandFather.age = 60;
        grandFather.children = fa;

        Human grandFather1 = new Human();
        grandFather1.name = "Олег";
        grandFather1.sex = true;
        grandFather1.age = 67;
        grandFather1.children = mo;

        Human grandMother = new Human();
        grandMother.name = "Оля";
        grandMother.sex = false;
        grandMother.age = 56;
        grandMother.children = fa;

        Human grandMother1 = new Human();
        grandMother1.name = "Юля";
        grandMother1.sex = false;
        grandMother1.age = 55;
        grandMother1.children = mo;


        humans.add(grandFather);
        humans.add(grandFather1);
        humans.add(grandMother);
        humans.add(grandMother1);
        humans.add(father);
        humans.add(mother);
        humans.add(child1);
        humans.add(child2);
        humans.add(child3);

        for (Human human : humans) {
            System.out.println(human);
        }

    }

    public static class Human {
        private String name;
        private boolean sex;
        private int age;
        private ArrayList<Human> children;


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
