package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String firstFile = args[0];
        String secondFile = args[1];
        ArrayList<String> allStringsFromFile = getAllStringsFromFile(firstFile);
        ArrayList<String> onlyWordsWithNumbers = creatArrayWithWordsContainsNuber(allStringsFromFile);
        printWordsToFile(onlyWordsWithNumbers, secondFile);


    }
    private static ArrayList<String> getAllStringsFromFile(String fName) throws IOException {
        ArrayList<String> strings = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fName));
        while (bufferedReader.ready()){
            strings.add(bufferedReader.readLine());
        }
        bufferedReader.close();
        return strings;
    }

    private static boolean wordContainsNumber(String word){
        char[] charsInWord = word.toCharArray();
        boolean containsNumber = false;
        for (char c : charsInWord){
            if (c == '1' || c == '2' || c == '3' || c == '4' || c == '5' || c == '6' || c == '7' || c == '8'
                    || c == '9' || c == '0'){
                containsNumber = true;
                break;
            }
        }
        return containsNumber;
    }

    private static ArrayList<String> creatArrayWithWordsContainsNuber(ArrayList<String> strings){
        ArrayList<String> arrayListWihNumbers = new ArrayList<>();
        for (String string : strings){
            StringBuilder stringBuilder = new StringBuilder();
            for (String word : string.split(" ")){
                if (wordContainsNumber(word + " ")){
                    stringBuilder.append(word + " ");
                }
            }
            arrayListWihNumbers.add(stringBuilder.toString());
        }
        return arrayListWihNumbers;
    }

    private static void printWordsToFile(ArrayList<String> strings, String fName) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fName));
        for (String string : strings){
            bufferedWriter.write(string);
        }
        bufferedWriter.close();
    }
}
