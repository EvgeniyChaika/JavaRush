package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution {
    public static void main(String[] args) {
        Human grandFather1 = new Human();
        grandFather1.name = "Олег";
        grandFather1.sex = true;
        grandFather1.age = 60;
        grandFather1.father = null;
        grandFather1.mother = null;
        System.out.println(grandFather1);

        Human grandFather2 = new Human();
        grandFather2.name = "Витя";
        grandFather2.sex = true;
        grandFather2.age = 61;
        grandFather2.father = null;
        grandFather2.mother = null;
        System.out.println(grandFather2);

        Human grandMother1 = new Human();
        grandMother1.name = "Оля";
        grandMother1.sex = false;
        grandMother1.age = 55;
        grandMother1.father = null;
        grandMother1.mother = null;
        System.out.println(grandMother1);

        Human grandMother2 = new Human();
        grandMother2.name = "Вика";
        grandMother2.sex = false;
        grandMother2.age = 57;
        grandMother2.father = null;
        grandMother2.mother = null;
        System.out.println(grandMother2);

        Human father = new Human();
        father.name = "Женя";
        father.sex = true;
        father.age = 37;
        father.father = grandFather1;
        father.mother = grandMother1;
        System.out.println(father);

        Human mother = new Human();
        mother.name = "Настя";
        mother.sex = false;
        mother.age = 37;
        mother.father = grandFather2;
        mother.mother = grandMother2;
        System.out.println(mother);

        Human son = new Human();
        son.name = "Вова";
        son.sex = true;
        son.age = 17;
        son.father = father;
        son.mother = mother;
        System.out.println(son);

        Human son2 = new Human();
        son2.name = "Вадик";
        son2.sex = true;
        son2.age = 7;
        son2.father = father;
        son2.mother = mother;
        System.out.println(son2);

        Human dougther = new Human();
        dougther.name = "Снежана";
        dougther.sex = false;
        dougther.age = 12;
        dougther.father = father;
        dougther.mother = mother;
        System.out.println(dougther);



    }


    public static class Human {
        private String name;
        private Boolean sex;
        private int age;
        private Human father;
        private Human mother;


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }

}
