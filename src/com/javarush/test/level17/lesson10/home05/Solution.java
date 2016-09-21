package com.javarush.test.level17.lesson10.home05;

/* Лишняя синхронизация
synchronized существенно замедляет программу, поэтому убери избыточность synchronized внутри методов
*/

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectInputStream.GetField;
import java.io.ObjectOutputStream;
import java.io.ObjectOutputStream.PutField;
import java.io.ObjectStreamField;

public class Solution {
    char[] value;
    int count;

    public Solution append(CharSequence s) {
        if (s == null) {
            s = "null";
        }

        if (s instanceof String) {
            return this.append((String) s);
        }

        if (s instanceof Solution) {
            return this.appendThis((Solution) s);
        }
        return this.append(s);
    }

    public synchronized Solution appendThis(Solution s) {
        return this;
    }

    private static final ObjectStreamField[] serialPersistentFields =
            {
                    new ObjectStreamField("value", char[].class),
                    new ObjectStreamField("count", Integer.TYPE),
                    new ObjectStreamField("shared", Boolean.TYPE),
            };

    private synchronized void writeObject(ObjectOutputStream s) throws IOException {
        PutField fields = s.putFields();
        fields.put("value", value);
        fields.put("count", count);
        fields.put("shared", false);
        s.writeFields();
    }

    private void readObject(ObjectInputStream s) throws IOException, ClassNotFoundException {
        GetField fields = s.readFields();
        value = (char[]) fields.get("value", null);
        count = fields.get("count", 0);
    }
}
