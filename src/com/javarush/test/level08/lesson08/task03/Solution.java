package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution
{
    public static HashMap<String, String> createMap()
    {
        HashMap<String, String> map = new HashMap<String, String>();
           map.put("Dtttftw", "Yuj");
           map.put("Dtttftq", "Yuhuj");
           map.put("Dtt", "Yuhuj");
           map.put("Dtttft", "Yuhuj");
           map.put("Dtttftp", "Yuhuj");
           map.put("Dtft", "Yuhuj");
           map.put("Dpotft", "Yuhuj");
           map.put("Asttft", "Yhuj");
           map.put("Dtttftl", "Sahuj");
           map.put("Dttmnt", "Yuhuj");
              return  map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        Iterator<Map.Entry<String, String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {

                Map.Entry<String, String> pair = iterator.next();
                String value = pair.getValue();

                if (value.equals(name)) {
                    count++;

            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String familiya)
    {
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        int count = 0;
        while (iterator.hasNext()) {

                Map.Entry<String, String> pair = iterator.next();
                String key = pair.getKey();

                if (key.equals(familiya)) {
                    count++;

            }
        }return count;

    }
}
