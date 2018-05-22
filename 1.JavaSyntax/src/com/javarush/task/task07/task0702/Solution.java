package com.javarush.task.task07.task0702;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Массив из строчек в обратном порядке
*/

public class Solution {
    public static void initializeList(String[] arr) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i< arr.length; i++){
            arr[i] = reader.readLine();
        }

    }
    public static void printListBackforward(String[] arrray){
        for (int i = arrray.length-1; i >= 0; i--){
            System.out.println(arrray[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        String[] list = new String[10];
        initializeList(list);
        printListBackforward(list);


    }
}