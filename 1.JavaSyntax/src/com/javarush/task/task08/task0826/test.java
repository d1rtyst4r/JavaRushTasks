package com.javarush.task.task08.task0826;

import java.util.Date;

public class test {
    public static void main(String[] args) throws Exception {
        Date yearStartTime = new Date();
        yearStartTime.setHours(0);
        yearStartTime.setMinutes(0);
        yearStartTime.setSeconds(0);

        yearStartTime.setDate(1);      // первое число
        yearStartTime.setMonth(0);     // месяц январь, нумерация для месяцев 0-11
        yearStartTime.setYear(2013);

        Date currentTime = new Date("JANUARY 2 2013");
        long msTimeDistance = currentTime.getTime() - yearStartTime.getTime();
        long msDay = 24 * 60 * 60 * 1000;  //сколько миллисекунд в одних сутках

        int dayCount = (int) Math.ceil((double)msTimeDistance / (double)msDay); //количество целых дней
        System.out.println("Days from start of year: " + dayCount);
        System.out.println(currentTime.getTime());
        System.out.println(yearStartTime.getTime());
        System.out.println(msTimeDistance);
        System.out.println(msDay);
    }
}
