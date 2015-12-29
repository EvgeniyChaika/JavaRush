package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution
{
    public static HashMap<String, Date> createMap()
    {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Сталлоне", new Date("JUNE 12 1980"));
        map.put("Стал", new Date("JULY 1 1980"));
        map.put("Сталл", new Date("JUNE 4 1980"));
        map.put("Ста", new Date("JUNE 1 1980"));
        map.put("Сталлон", new Date("FEBRUARY 1 1980"));
        map.put("Сталло", new Date("JUNE 1 1983"));
        map.put("Стаоне", new Date("MAY 1 1980"));
        map.put("Сте", new Date("JUNE 1 1970"));
        map.put("Сталлое", new Date("APRIL 1 1980"));
        map.put("Сллоне", new Date("SEPTEMBER 1 1980"));

           return map;

    }

    public static void removeAllSummerPeople(HashMap<String, Date> map)
    {
        Iterator<Map.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Date> pair = iterator.next();
            int month = pair.getValue().getMonth();
            if (month > 4 && month < 8) {
                iterator.remove();
            }
        }

    }
}
