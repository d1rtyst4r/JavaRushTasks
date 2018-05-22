package com.javarush.task.task07.task0701;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массивный максимум
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        int[] array = initializeArray();
        int max = max(array);
        System.out.println(max);
    }

    public static int[] initializeArray() throws IOException {
        // создай и заполни массив
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] tempArr = new int[20];
        for (int i = 0; i < tempArr.length ;i++){
            tempArr[i] = Integer.parseInt(reader.readLine());
        }
        return tempArr;
    }

    public static int max(int[] array) {
        // найди максимальное значение
        int tempMax = array[0];
        for (int i = 1; i < array.length; i++){
            if (array[i] > tempMax){
                tempMax = array[i];
            }
        }
        return tempMax;
    }
}
