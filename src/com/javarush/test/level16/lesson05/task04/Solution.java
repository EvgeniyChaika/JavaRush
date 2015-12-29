package com.javarush.test.level16.lesson05.task04;

/* Справедливость
1. Разберитесь, что делает программа.
2. Нужно сделать так, чтобы все мыши ели одновременно.
3. Подумай, какой метод позволяет альфа-самцу мыши есть первым, и почему остальные мыши ждут.
4. Удали вызов этого метода.
*/

public class Solution
{
    public static void main(String[] args) throws InterruptedException
    {
        Mouse alpha = new Mouse("#1");

        Mouse mouse1 = new Mouse("#2");

        Mouse mouse2 = new Mouse("#3");

    }

    public static class Mouse extends Thread
    {
        public Mouse(String name)
        {
            super(name);
            start();
        }

        public void run()
        {
            System.out.println(getName() + " starts eating");
            eating();
            System.out.println(getName() + " finished");
        }
    }

    private static void eating()
    {
        try
        {
            Thread.sleep(2000);
        }
        catch (InterruptedException e)
        {
        }
    }
}
