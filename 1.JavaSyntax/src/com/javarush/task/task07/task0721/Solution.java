package com.javarush.task.task07.task0721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

/* 
Минимаксы в массивах
*/

public class Solution {
    private static void fillArray(int[] array, BufferedReader bufferedReader)throws  IOException{
        for (int i = 0; i < array.length; i++){
            array[i] = Integer.parseInt(bufferedReader.readLine());
        }
    }

    private  static int minInArray(int[] array){
        int min = array[0];
        for (int i = 1; i < array.length; i++){
            if (min > array[i]){
                min = array[i];
            }
        }
        return min;
    }

    private static int maxInArray(int[] array){
        int max = array[0];
        for (int i = 1; i < array.length; i++){
            if (max < array[i]){
                max = array[i];
            }
        }
        return max;
    }

    private static void autofillarray(int[] array){
        Random rnd = new Random();
        for (int i = 0; i < array.length; i++){
            array[i] = rnd.nextInt(1000);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int maximum;
        int minimum;

        //напишите тут ваш код
        int[] numbers = new int[20];
        autofillarray(numbers);
        minimum = minInArray(numbers);
        maximum = maxInArray(numbers);


        System.out.println(maximum + " " + minimum);
    }
}
