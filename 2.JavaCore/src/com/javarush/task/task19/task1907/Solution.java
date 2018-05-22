package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        bufferedReader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));
        printHowManyWordsWorldInFile(fileReader);
        fileReader.close();
    }
    private static void printHowManyWordsWorldInFile(BufferedReader reader) throws IOException {
        int count = 0;
        while (reader.ready()) {
            String line = reader.readLine();
            String[] words = line.split("\\W");
            for (String word : words) {
                if (word.equals("world")) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}