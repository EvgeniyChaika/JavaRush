package com.javarush.test.level13.lesson11.bonus03;

public abstract class AbstractRobot implements Attackable, Defensable {

    private Object name;

    public abstract BodyPart attack();





    public abstract BodyPart defense();


    public Object getName() {
        return name;
    }
}
