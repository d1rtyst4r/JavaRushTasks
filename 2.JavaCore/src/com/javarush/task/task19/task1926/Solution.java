package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine(); // get file name
        reader.close();

        //copy all strings from file to array list
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> stringsInFile = new ArrayList<>();
        while (bufferedReader.ready()){
            stringsInFile.add(bufferedReader.readLine());
        }
        bufferedReader.close();

        // reverse all strings from file and print it to console
        ArrayList<String> reverseStrings = new ArrayList<>();
        for (String string : stringsInFile){
            StringBuilder stringBuilder = new StringBuilder(string);
            reverseStrings.add(stringBuilder.reverse().toString());
        }

        for (String str : reverseStrings){
            System.out.println(str);
        }

    }
}
