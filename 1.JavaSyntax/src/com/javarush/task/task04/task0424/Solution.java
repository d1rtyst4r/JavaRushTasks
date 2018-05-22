package com.javarush.task.task04.task0424;

/* 
Три числа
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(bufferedReader.readLine());
        int second = Integer.parseInt(bufferedReader.readLine());
        int third = Integer.parseInt(bufferedReader.readLine());

        checkNumbers(first, second, third);
    }
    public static void checkNumbers(int fNumber, int sNumber, int tNumber){
        if (fNumber != sNumber && sNumber == tNumber){
            System.out.println("1");
        }
        else if (sNumber != fNumber && fNumber == tNumber){
            System.out.println("2");
        }
        else if (tNumber != fNumber && fNumber == sNumber){
            System.out.println("3");
        }
    }
}
