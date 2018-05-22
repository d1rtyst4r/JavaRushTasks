package com.javarush.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/*
Какое сегодня число?
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Date date = simpleDateFormat.parse(reader.readLine());
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("MMM dd, YYYY",Locale.UK);
        System.out.println(simpleDateFormat1.format(date).toUpperCase());
    }
}
