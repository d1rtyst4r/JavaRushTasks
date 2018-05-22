package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader fileNameReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = fileNameReader.readLine();
        String seconFileName = fileNameReader.readLine();
        fileNameReader.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(firstFileName));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(seconFileName));
        ArrayList<Character> charsInFile = new ArrayList<>();
        ArrayList<Character> newChars = new ArrayList<>();
         while (bufferedReader.ready()){
            charsInFile.add((char) bufferedReader.read());
        }
        for (char c : charsInFile){
            if (c == '.'){
                newChars.add('!');
            }
            else {
                newChars.add(c);
            }
        }
        bufferedReader.close();

         for (char x : newChars){
             bufferedWriter.write(x);
         }
         bufferedWriter.close();
    }
}
