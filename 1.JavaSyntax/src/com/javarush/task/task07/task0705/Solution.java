package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {

    //fill array
    private static void fillArray(int[] array) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
    }

    private static void printArray(int[] array){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }

    private static void autoFillArray(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = i;
        }
    }

    private static int[] fillFirstShortArray(int[] longArr, int[] shortArr){
        for(int i = 0; i <longArr.length / 2; i++){
            shortArr[i] = longArr[i];
        }
        return shortArr;
    }

    private static int[] fillSecondShortArray(int[] longArr, int[] shortArr){
        for (int i = longArr.length / 2; i < longArr.length; i++){
            shortArr[i - 10] = longArr[i];
        }
        return  shortArr;
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] longArray = new int[20];
        int[] firstSortArray = new int[10];
        int[] secondShortArray = new int[10];

        autoFillArray(longArray);
        firstSortArray = fillFirstShortArray(longArray, firstSortArray);
        secondShortArray = fillSecondShortArray(longArray, secondShortArray);
        printArray(firstSortArray);
        System.out.println();
        printArray(secondShortArray);
    }
}
