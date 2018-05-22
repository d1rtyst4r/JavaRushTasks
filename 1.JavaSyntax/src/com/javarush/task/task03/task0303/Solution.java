package com.javarush.task.task03.task0303;

/* 
Обмен валют
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        double dollar1 = convertEurToUsd(100, 1.17);
        double dollar2 = convertEurToUsd(101, 1.18);
        System.out.println(dollar1);
        System.out.println(dollar2);
    }

    public static double convertEurToUsd(int eur, double course) {
        double dollar = (double) eur * course;
        return  dollar;
    }
}
