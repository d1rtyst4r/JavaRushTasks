package com.javarush.task.task07.task0703;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Общение одиноких массивов
*/

public class Solution {

    //fill String array with strings from console
    public static void fillStringArray(String[] sArr) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < sArr.length; i++){
            sArr[i] = reader.readLine();
        }
    }
    // fill int array with strings length
    private static void fillIntArrayWithStringsLength(int[] arrToFill, String[] arrWithStrings){
        for (int i = 0; i < arrToFill.length; i ++){
            arrToFill[i] = arrWithStrings[i].length();
        }
    }
    //print array to console
     private static void printArrayToConsole(int[] arr){
         for (int anArr : arr) System.out.println(anArr);
    }

    private static void printArrayToConsole(String[] arr){
        for (String anArr : arr) System.out.println(anArr);
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        String[] stringsArray = new String[10];
        int[] numbersArray = new int[10];
        fillStringArray(stringsArray);
        fillIntArrayWithStringsLength(numbersArray, stringsArray);
        printArrayToConsole(numbersArray);
    }
}
