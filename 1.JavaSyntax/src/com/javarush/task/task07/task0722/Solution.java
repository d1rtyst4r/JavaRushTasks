package com.javarush.task.task07.task0722;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Это конец
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> strings = new ArrayList<>();

        while (true){
            String stringToAdd = reader.readLine();
            if (stringToAdd.equals("end")){
                break;
            }
            else strings.add(stringToAdd);
        }
        for (String string : strings) System.out.println(string);

        //напишите тут ваш код
    }
}