package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = fileNameReader.readLine();
        String secondFile = fileNameReader.readLine();
        fileNameReader.close();

        BufferedReader fileReader = new BufferedReader(new FileReader(firstFile));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondFile));

        ArrayList<String> allWordsInFile = createTempStringArray(fileReader);
        ArrayList<String> onlyIntegersInFile = createArrayListWithIntegersFromFile(allWordsInFile);
        writeAllIntegersToFile(onlyIntegersInFile, fileWriter);
        fileReader.close();
        fileWriter.close();


    }
    private static ArrayList<String> createTempStringArray(BufferedReader reader) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> temp = new ArrayList<>();
        while (reader.ready()){
            strings.add(reader.readLine());
        }
        for (String string : strings){
            for (String str : string.split(" ")){
                temp.add(str);
            }
        }
        return temp;
    }
    private static ArrayList<String> createArrayListWithIntegersFromFile(ArrayList<String> allWords){
        ArrayList<Integer> integers = new ArrayList<>();
        ArrayList<String> integersByString = new ArrayList<>();
        for (String string : allWords){
            try {
                integers.add(Integer.parseInt(string));
            }catch (NumberFormatException e){
                continue;
            }
        }
        for (int i : integers){
            integersByString.add(String.valueOf(i));
        }
        return integersByString;
    }
    private static void writeAllIntegersToFile(ArrayList<String> numbersInFile, BufferedWriter fileWriter) throws IOException {
        for (String string : numbersInFile){
            fileWriter.write(string + " ");
        }
    }
}
