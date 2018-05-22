package com.javarush.task.task04.task0423;

/* 
Фейс-контроль
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your name");
        String name = bufferedReader.readLine();
        System.out.println("Please enter your age");
        int age = Integer.parseInt(bufferedReader.readLine());

        checkAge(age);
    }
    public static void checkAge(int ageToCheck){
        if (ageToCheck > 20){
            System.out.println("18 will be enough");
        }
    }
}
