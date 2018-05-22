package com.javarush.task.task08.task0827;

import java.util.Date;

/* 
Работа с датой
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(isDateOdd("MAY 1 2013"));
    }

    public static boolean isDateOdd(String date) {
        Date curDate = new Date(date);
        Date startDate = new Date();

        startDate.setDate(1);      // первое число
        startDate.setMonth(0);     // месяц январь, нумерация для месяцев 0-11
        startDate.setYear(curDate.getYear());

        long msTimeDistance = curDate.getTime() - startDate.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) (msTimeDistance/msDay); //количество целых дней

        if (dayCount % 2 == 0) return false;
        else
            return true;
    }
}