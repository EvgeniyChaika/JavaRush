package com.javarush.test.level19.lesson03.task04;

/* И еще один адаптер
Адаптировать Scanner к PersonScanner.
Классом-адаптером является PersonScannerAdapter.
Данные в файле хранятся в следующем виде:
Иванов Иван Иванович 31 12 1950

В файле хранится большое количество людей, данные одного человека находятся в одной строке. Метод read() должен читать данные одного человека.
*/

import java.io.IOException;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner scanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.scanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            if (scanner.hasNext()) {
                String[] inputArray = scanner.nextLine().split(" ");
                Date birthDate = (new GregorianCalendar(Integer.parseInt(inputArray[5]), Integer.parseInt(inputArray[4]) - 1, Integer.parseInt(inputArray[3]))).getTime();
                return new Person(inputArray[1], inputArray[2], inputArray[0], birthDate);
            }
            return null;
        }

        @Override
        public void close() throws IOException {
            this.scanner.close();
        }
    }
}
