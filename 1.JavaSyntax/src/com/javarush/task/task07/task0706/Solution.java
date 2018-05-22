package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    private static void fillArray(int[] arr)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i =0; i < arr.length; i++){
            arr[i] = Integer.parseInt(reader.readLine());
        }
    }
    private static String numberofpeople(int[] arr){
        int peopleOnOdd = 0;
        int peopleOnEven = 0;
        for (int i = 0; i < arr.length; i++){
            if (i  % 2 == 0){
                peopleOnEven += arr[i];
            }
            else {
                peopleOnOdd += arr[i];
            }
        }
        if (peopleOnEven > peopleOnOdd){
            return "В домах с четными номерами проживает больше жителей.";
        }
        else  return  "В домах с нечетными номерами проживает больше жителей.";
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        int[] street = new int[15];
        fillArray(street);
        System.out.println(numberofpeople(street));

    }
}
