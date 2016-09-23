package com.javarush.test.level17.lesson10.bonus01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* CRUD
CrUD - Create, Update, Delete
Программа запускается с одним из следующих наборов параметров:
-c name sex bd
-u id name sex bd
-d id
-i id
Значения параметров:
name - имя, String
sex - пол, "м" или "ж", одна буква
bd - дата рождения в следующем формате 15/04/1990
-c  - добавляет человека с заданными параметрами в конец allPeople, выводит id (index) на экран
-u  - обновляет данные человека с данным id
-d  - производит логическое удаление человека с id
-i  - выводит на экран информацию о человеке с id: name sex (м/ж) bd (формат 15-Apr-1990)

id соответствует индексу в списке
Все люди должны храниться в allPeople
Используйте Locale.ENGLISH в качестве второго параметра для SimpleDateFormat

Пример параметров: -c Миронов м 15/04/1990
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) throws ParseException {
        if (args.length > 0) {
            String command = args[0];
            String inputString = "";
            for (int i = 1; i < args.length; i++) {
                inputString += args[i] + " ";
            }
            String[] inputParam = inputString.split(" ");

            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            switch (command) {
                case "-c": {
                    String name = "";
                    int count = 0;
                    for (int i = 0; i < inputParam.length; i++) {
                        if (!inputParam[i].equals("м") && !inputParam[i].equals("ж")) {
                            name += inputParam[i] + " ";
                            count++;
                        } else break;
                    }
                    name = name.substring(0, name.length() - 1);

                    String sex = inputParam[count];
                    Date birthdate = simpleDateFormat.parse(inputParam[count + 1]);
                    if (sex.equals("м")) {
                        allPeople.add(Person.createMale(name, birthdate));
                    } else if (sex.equals("ж")) {
                        allPeople.add(Person.createFemale(name, birthdate));
                    }
                }
                System.out.println(allPeople.size() - 1);
                break;

                case "-u": {
                    int id = Integer.parseInt(inputParam[0]);
                    String name = "";
                    int count = 1;
                    for (int i = 1; i < inputParam.length; i++) {
                        if (!inputParam[i].equals("м") && !inputParam[i].equals("ж")) {
                            name += inputParam[i] + " ";
                            count++;
                        } else break;
                    }
                    name = name.substring(0, name.length() - 1);

                    String sex = inputParam[count];
                    Date birthdate = simpleDateFormat.parse(inputParam[count + 1]);

                    if (sex.equals("м")) {
                        Person p = allPeople.get(id);
                        p.setName(name);
                        p.setSex(Sex.MALE);
                        p.setBirthDay(birthdate);
                    } else if (sex.equals("ж")) {
                        Person p = allPeople.get(id);
                        p.setName(name);
                        p.setSex(Sex.FEMALE);
                        p.setBirthDay(birthdate);
                    }
                }
                break;
                case "-d": {
                    Person p = allPeople.get(Integer.parseInt(inputParam[0]));
                    p.setBirthDay(null);
                    p.setName(null);
                    p.setSex(null);
                }
                break;
                case "-i":
                    int id = Integer.parseInt(inputParam[0]);
                    SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                    Person p = allPeople.get(id);
                    String sex;
                    if (p.getSex() == Sex.MALE) {
                        sex = "м";
                    } else sex = "ж";
                    System.out.println(p.getName() + " " + sex + " " + sdf.format(p.getBirthDay()));
                    break;
            }
        }
    }
}
