package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/

public class Solution
{
    public static void main(String[] args)
    {
        Date currentDate = new Date(15, 12, 2014);
        System.out.println(currentDate.date + " " + currentDate.month + " " + currentDate.year);
    }
    public static class Date{
        int date;
        int month;
        int year;
        public Date(int date, int month, int year){
            this.date = date;
            this.month = month;
            this.year = year;
        }
    }
}
