package com.javarush.test.level05.lesson05.task02;

/* Реализовать метод fight
Реализовать метод boolean fight(Cat anotherCat):
реализовать механизм драки котов в зависимости от их веса, возраста и силы.
Зависимость придумать самому. Метод должен определять, выиграли ли мы (this) бой или нет,
т.е. возвращать true, если выиграли и false - если нет.
Должно выполняться условие:
если cat1.fight(cat2) = true , то cat2.fight(cat1) = false
*/

public class Cat
{
    public String name;
    public int age;
    public int weight;
    public int strength;

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public int getWeight() {
//        return weight;
//    }
//
//    public void setWeight(int weight) {
//        this.weight = weight;
//    }
//
//    public int getStrength() {
//        return strength;
//    }
//
//    public void setStrength(int strength) {
//        this.strength = strength;
//    }

    public Cat()
    {

    }



    public boolean fight (Cat anotherCat)
    {

      if (weight > anotherCat.weight || strength > anotherCat.strength || age > anotherCat.age){
          System.out.println(true);
          return true;

      }else
          System.out.println(false);

        return false;
    }

    public static void main(String[] args) {

        Cat cat1 = new Cat();
        cat1.name = "Васька";
        cat1.age = 3;
        cat1.weight = 7;
        cat1.strength = 10;
        Cat cat2 = new Cat();
        cat1.name = "Кузя";
        cat1.age = 4;
        cat1.weight = 9;
        cat1.strength = 9;
        cat1.fight(cat2);
        cat2.fight(cat1);

    }
}
