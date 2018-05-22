package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int[] numbers = new int[]{Integer.parseInt(bufferedReader.readLine()),
                Integer.parseInt(bufferedReader.readLine()), Integer.parseInt(bufferedReader.readLine())};
        printSortedArray(numbers);
    }

    public static void printSortedArray(int[]arr){
        int[] arrTosort = arr;
        int temp = arrTosort[0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arrTosort[j] < arrTosort[j + 1]) {
                    temp = arrTosort[j+1];
                    arrTosort[j+1] = arrTosort[j];
                    arrTosort[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
