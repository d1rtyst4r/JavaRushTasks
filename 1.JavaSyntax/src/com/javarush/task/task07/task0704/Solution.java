package com.javarush.task.task07.task0704;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Переверни массив
*/

public class Solution {

    private static void fillArray(int[] array) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i< array.length; i++){
            array[i] = Integer.parseInt(reader.readLine());
        }
    }

    private static void printArrayToConsole(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    private static int[] backForwardArray(int[] array){
        int[] temp = new int[10];
        for(int i = array.length-1; i >=0; i--){
            temp[temp.length - i-1] = array[i];
        }
        return temp;
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] arr = new int[10];
        fillArray(arr);
        printArrayToConsole(arr);
        arr = backForwardArray(arr);
        printArrayToConsole(arr);
    }
}

