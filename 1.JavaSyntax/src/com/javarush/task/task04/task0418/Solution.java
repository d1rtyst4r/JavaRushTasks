package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int firsNumber = Integer.parseInt(bufferedReader.readLine());
        int secondNumber = Integer.parseInt(bufferedReader.readLine());

        min(firsNumber, secondNumber);

    }
    public static void min(int first, int second){
        if (first < second){
            System.out.println(first);
        }
        else if (second < first) {
            System.out.println(second);
        }
        else if (first == second){
            System.out.println(first);
        }
    }
}