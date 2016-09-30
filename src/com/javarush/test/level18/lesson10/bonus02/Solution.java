package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class Solution {
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file = reader.readLine();
        reader.close();

        if (args.length != 4 && !("-c").equals(args[0])) {
            throw new IllegalArgumentException();
        }

        String productName = args[1];
        String price = args[2];
        String quantity = args[3];

        productName = parseProductName(productName);
        price = parsePrice(price);
        quantity = parseQuantity(quantity);

        String[] arrRows = new String[0];
        String idStr = "1";

        FileInputStream inputStream = new FileInputStream(file);

        while (inputStream.available() > 0) {
            byte[] buffer = new byte[inputStream.available()];
            int count = inputStream.read(buffer);
            arrRows = new String(buffer).split("\\n");
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            fileOutputStream.write(buffer, 0, count);
            fileOutputStream.close();
        }

        inputStream.close();

        FileOutputStream outputStream = new FileOutputStream(file, true);

        if (arrRows.length > 0) {
            idStr = arrRows[arrRows.length - 1].substring(0, 8);
            Integer id = Integer.parseInt(idStr.trim());
            id++;
            idStr = parseId(id.toString());
        } else {
            idStr = parseId(idStr);
        }

        byte[] bufferId = idStr.getBytes();
        byte[] bufferName = productName.getBytes();
        byte[] bufferPrice = price.getBytes();
        byte[] bufferQuantity = quantity.getBytes();

        byte[] result = new byte[bufferId.length + bufferName.length + bufferPrice.length + bufferQuantity.length];

        System.arraycopy(bufferId, 0, result, 0, bufferId.length);
        System.arraycopy(bufferName, 0, result, bufferId.length, bufferName.length);
        System.arraycopy(bufferPrice, 0, result, bufferId.length + bufferName.length, bufferPrice.length);
        System.arraycopy(bufferQuantity, 0, result, bufferId.length + bufferName.length + bufferPrice.length, bufferQuantity.length);

        outputStream.write(result);
        outputStream.close();
    }

    private static String parseId(String id) {
        StringBuilder builderId = new StringBuilder(id);
        if (id.length() < 8) {
            while (builderId.length() != 8) {
                builderId.append(" ");
            }
            id = builderId.toString();
        } else if (id.length() > 8) {
            builderId.delete(9, builderId.length() - 1);
            id = builderId.toString();
        }
        return id;
    }

    private static String parseQuantity(String quantity) {
        StringBuilder builder = new StringBuilder(quantity);
        if (quantity.length() < 4) {
            while (builder.length() != 4) {
                builder.append(" ");
            }
        } else if (quantity.length() > 4) {
            builder.delete(5, quantity.length() - 1);
        }
        builder.append("\n");
        return builder.toString();
    }

    private static String parseProductName(String productName) {
        if (productName.length() < 30) {
            StringBuilder builder = new StringBuilder(productName);
            while (builder.length() != 30) {
                builder.append(" ");
            }
            return builder.toString();
        } else if (productName.length() > 30) {
            return productName.substring(0, 30);
        }
        return productName;
    }

    private static String parsePrice(String price) {
        if (parseToDouble(price) != -1) {
            if (price.length() < 8) {
                StringBuilder builder = new StringBuilder(price);
                while (builder.length() != 8) {
                    builder.append(" ");
                }
                return builder.toString();
            } else if (price.length() > 8) {
                BigDecimal bigDecimal = new BigDecimal(price).setScale(2, BigDecimal.ROUND_UP);
                String dPrice = bigDecimal.toString();
                if (dPrice.length() == 8) {
                    return dPrice;
                } else {
                    throw new IllegalArgumentException();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
        return price;
    }

    private static int parseToDouble(String price) {
        double value;
        try {
            value = Double.parseDouble(price);
        } catch (NumberFormatException e) {
            return -1;
        }
        return (int) value;
    }
}
