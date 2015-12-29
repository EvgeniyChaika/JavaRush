package com.javarush.test.level08.lesson08.task05;

import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {
    public static HashMap<String, String> createMap() {
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
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair: copy.entrySet())
        {
            int count = 0;
            for (Map.Entry<String, String> p: copy.entrySet()) {
                if (pair.getValue().equals(p.getValue())){
                    count++;
                    if(count > 1){
                        map.remove(pair.getKey());
                    }
                }
            }
        }
    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
