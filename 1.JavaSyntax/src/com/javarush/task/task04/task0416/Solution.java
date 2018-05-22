package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        double time = Double.parseDouble(bufferedReader.readLine());
        String[] states = new String[]{"green", "yellow", "red"};

        checkstate(time, states);
    }

    public static void checkstate(double timeCheck, String[] stateCheck){
        if (timeCheck % 5.0 > 0 && timeCheck % 5.0 < 3.0){
            System.out.println(stateCheck[0]);
        }
        else if (timeCheck % 5.0 > 3.0 && timeCheck % 5.0 < 4.0){
            System.out.println(stateCheck[1]);
        }
        else {
            System.out.println(stateCheck[2]);
        }
    }
}