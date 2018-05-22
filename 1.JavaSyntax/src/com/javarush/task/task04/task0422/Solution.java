package com.javarush.task.task04.task0422;

/* 
18+
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
    public static void checkAge(int cAge){
        if (cAge < 18){
            System.out.println("Подрасти еще");
        }
    }
}
