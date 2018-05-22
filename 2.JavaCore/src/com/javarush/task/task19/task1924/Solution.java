package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();
    static {
        map.put(0, "ноль");
        map.put(1,"один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        String fileName = getFileName();
        ArrayList<String> allStringsInFile = getAllStringsFromFile(fileName);
        ArrayList<String> replacedWords = replaceNumbersByWords(allStringsInFile);
        printArray(replacedWords);
    }
    private static String getFileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        reader.close();
        return name;
    }
    private static ArrayList<String> getAllStringsFromFile(String fName) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fName));
        while (reader.ready()){
            strings.add(reader.readLine());
        }
        reader.close();
        return strings;
    }
    private static ArrayList<String> replaceNumbersByWords(ArrayList<String> toReplace){
        ArrayList<String> text = new ArrayList<>();
        for (String string: toReplace){
            StringBuilder stringBuilder = new StringBuilder();
            for (String word : string.split(" ")){ //split string to words
                try {
                    if (Integer.parseInt(word) <= 12){ //check if word is number in map
                        stringBuilder.append(map.get(Integer.parseInt(word)) + " "); // add number as word
                        }
                        else stringBuilder.append(word + " "); // add number as number

                    } catch (NumberFormatException e){ //if exception  was risen
                    stringBuilder.append(word + " "); // add words
                }
            }
            text.add(stringBuilder.toString());
        }
        return text;
    }
    private static void printArray(ArrayList<String> arrayToPrint){
        for (String string : arrayToPrint){
            System.out.println(string);
        }
    }
}
