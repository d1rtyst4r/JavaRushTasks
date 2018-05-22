package com.javarush.task.task07.task0720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Перестановочка подоспела
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //напишите тут ваш код
        int arrayListSize = Integer.parseInt(reader.readLine());
        int borderIndexToMoveToEnd = Integer.parseInt(reader.readLine());

        ArrayList<String> strings = new ArrayList<>();

        for (int i = 0; i < arrayListSize; i++){
            strings.add(reader.readLine());
        }

        for (int i = 0; i < borderIndexToMoveToEnd; i++){
            String temp = strings.get(0);
            strings.remove(0);
            strings.add(temp);
        }
        for (String string : strings) System.out.println(string);
    }
}
