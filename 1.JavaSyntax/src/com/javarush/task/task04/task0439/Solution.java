package com.javarush.task.task04.task0439;

/* 
Письмо счастья
*/

import java.io.*;

public class Solution {
    static void luckyLetterTenTimes(String forRepeat){
        for (int i = 0; i < 10; i++){
            System.out.println(forRepeat + " loves me!");
        }
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter name: ");
        String name = bufferedReader.readLine();
        luckyLetterTenTimes(name);
    }
}
