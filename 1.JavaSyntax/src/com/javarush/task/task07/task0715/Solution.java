package com.javarush.task.task07.task0715;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Продолжаем мыть раму
*/

public class Solution {
    public static void main(String[] args){
        //напишите тут ваш код
        ArrayList<String> mamaMilaRamu = new ArrayList<>();
        mamaMilaRamu.add("мама");
        mamaMilaRamu.add("мыла");
        mamaMilaRamu.add("раму");

        for (int i = 0; i <=5; i++){
            if (i % 2 != 0){
                mamaMilaRamu.add(i, "именно");
            }
        }
        for (String string : mamaMilaRamu){
            System.out.println(string);
        }

    }
}
