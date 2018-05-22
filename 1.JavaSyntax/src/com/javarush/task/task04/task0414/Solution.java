package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(bufferedReader.readLine());
        numberDaysInYeat(year);
    }

    public static void numberDaysInYeat(int yearToCheck){
        if (yearToCheck % 4 == 0 ){
            if((yearToCheck % 100) == 0 && (yearToCheck % 400 != 0)){
                System.out.println(365);
            }
            else{
                System.out.println(366);
            }
        }
        else System.out.println(365);
    }
}