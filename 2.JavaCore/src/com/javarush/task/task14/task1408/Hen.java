package com.javarush.task.task14.task1408;

/*
    create new abstract class Hen
    add abstract method int getCountOfEggsPerMonth()
    add String getDescription() return c'country'. Я несу + 'eggsPerMonth' яиц в месяц.
     */
public abstract class Hen implements Country{

    public abstract int getCountOfEggsPerMonth();


    public String getDescription() {
        return "Я - курица.";
    }
}