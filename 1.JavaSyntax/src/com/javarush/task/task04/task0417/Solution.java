package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int firstNumber = Integer.parseInt(bufferedReader.readLine());
        int secondNumber = Integer.parseInt(bufferedReader.readLine());
        int thirdNumber = Integer.parseInt(bufferedReader.readLine());

        if (firstNumber == secondNumber || firstNumber == thirdNumber){
            System.out.println(firstNumber + " " + firstNumber);
        }
        else if (secondNumber == thirdNumber){
            System.out.println(secondNumber + " " + secondNumber);
        }
        else if (firstNumber == secondNumber && firstNumber == thirdNumber){
            System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        }
    }

}