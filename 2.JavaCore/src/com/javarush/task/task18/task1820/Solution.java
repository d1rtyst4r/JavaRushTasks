package com.javarush.task.task18.task1820;

/* 
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();



        BufferedReader reader = new BufferedReader(new FileReader(file));
        StringBuilder stringBuilder = new StringBuilder();

        //read all lines in file
        while (reader.ready()) {
            stringBuilder.append(reader.readLine());
        }
        reader.close();

        //convert all numbers in file to doubles
        String text = stringBuilder.toString();
        String[] textArray = text.split(" ");
        double[] doubles = new double[textArray.length];

        for (int i = 0; i < textArray.length; i++) {
            doubles[i] = Double.parseDouble(textArray[i]);
        }

        int[] ints = new int[doubles.length];

        for (int i = 0; i < ints.length; i++){
            ints[i] = (int) Math.round(doubles[i]);
        }
        //create new String with ints
        StringBuilder stringBuilder1 = new StringBuilder();
        for (int i = 0; i < ints.length; i++){
            if (i == ints.length-1){
                stringBuilder1.append(ints[i]);
            }
            else {
                stringBuilder1.append(ints[i] + " ");
            }
        }
        String textToFile = stringBuilder1.toString();

        //write String with ints to file
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file2));
        bufferedWriter.write(textToFile);
        bufferedWriter.close();

    }
}