package com.javarush.task.task19.task1910;

/* 
Пунктуация
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = fileNameReader.readLine();
        String secondFileName = fileNameReader.readLine();
        fileNameReader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(firstFileName));
        ArrayList<Character> allCharsInFile =  addAllCharsFromFile(bufferedReader);
        bufferedReader.close();

        ArrayList<Character> arrayListwithoutPunctuation = creatNewArrayListWithoutPunctuation(allCharsInFile);
        writeCharsToFile(arrayListwithoutPunctuation, secondFileName);

    }
    private static boolean isPunctuation(char c){
        char[] symbols = new char[]{',', '.', ';', ':', '\n', '!', '?', '…', '—', '"','#','$',
                '%', '\'', '(', ')', '*', '+', '/', '=', ';', '?', '@', '[', '\\', ']',
                '^', '_', '`', '{', '|', '}', '~', '-'};
        boolean isInChar = false;
        for (char x : symbols){
            if (c == x){
                isInChar = true;
                break;
            }
        }
        return isInChar;
    }
    private static ArrayList<Character> addAllCharsFromFile(BufferedReader br) throws IOException {
        ArrayList<Character> allChars = new ArrayList<>();
        while (br.ready()){
            allChars.add((char) br.read());
        }
        return allChars;
    }
    private static ArrayList<Character> creatNewArrayListWithoutPunctuation(ArrayList<Character> characters){
        ArrayList<Character> arrayListwithoutPunctuation = new ArrayList<>();
        for (char z: characters) {
            if (!isPunctuation(z)){
                arrayListwithoutPunctuation.add(z);
            }
        }
        return arrayListwithoutPunctuation;
    }
    private static void writeCharsToFile(ArrayList<Character> characters, String fileName) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName));

        for (char y : characters){
            bufferedWriter.write(y);
        }
        bufferedWriter.close();
    }
}
