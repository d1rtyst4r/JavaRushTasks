package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Character> chars = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(args[0]);
        while (inputStream.available() > 0){
            chars.add((char)inputStream.read());
        }
        inputStream.close();
        double allLenght = (double)chars.size();
        double spaceInFile = 0d;

        for (Character x : chars){
            if (x == ' '){
                spaceInFile++;
            }
        }
        double attitudeSpaceAndAllLenght = spaceInFile/allLenght*100;
        System.out.println(String.format("%.2f", attitudeSpaceAndAllLenght));
    }
}
