package com.javarush.task.task19.task1925;

/* 
Длинные слова
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException{
        String firstFile = args[0];
        String secondFile = args[1];

        BufferedReader bufferedReader = new BufferedReader(new FileReader(firstFile));
        ArrayList<String> wordsInFile = new ArrayList<>();
        while (bufferedReader.ready()){ // add ALL strings from file to array list
            wordsInFile.add(bufferedReader.readLine());
        }
        bufferedReader.close(); //close reader
        ArrayList<String> wordsLongerThenSixChars = new ArrayList<>();
        for (String string : wordsInFile){ // get all words from all strings in file
            String[] str = string.split(" ");
            for (String word : str){
                if (word.length() > 6){ // if word length more then 6 symbols and to array list
                    wordsLongerThenSixChars.add(word);
                }
            }
        }
        FileWriter fileWriter = new FileWriter(secondFile);
        for (int i = 0; i < wordsLongerThenSixChars.size(); i++){ // write all words to second file
            if (i == wordsLongerThenSixChars.size()-1){
                fileWriter.write(wordsLongerThenSixChars.get(i));
            }
            else {
                fileWriter.write(wordsLongerThenSixChars.get(i)+ ",");
            }
        }
        fileWriter.close();
    }
}
