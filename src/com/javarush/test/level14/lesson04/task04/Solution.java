package com.javarush.test.level14.lesson04.task04;

/* Без ошибок
Инициализировать объект obj таким классом, чтобы метод main выполнился без ошибок.
*/

public class Solution
{
    public static void main(String[] args)
    {
        Object obj = new Jerry();

        Mouse mouse = (Mouse) obj;
        GreyMouse greyMouse = (GreyMouse) mouse;
        Jerry jerry = (Jerry) greyMouse;

        printClasses(obj, mouse, greyMouse, jerry);

    }

    public static void printClasses(Object obj, Mouse mouse, GreyMouse greyMouse, Jerry jerry)
    {
        System.out.println(jerry.getClass().getSimpleName());
        System.out.println(greyMouse.getClass().getSimpleName());
        System.out.println(mouse.getClass().getSimpleName());
        System.out.println(obj.getClass().getSimpleName());
    }

    static class Mouse
    {
    }

    static class GreyMouse extends Mouse
    {
    }

    static class Jerry extends GreyMouse
    {
    }
}
