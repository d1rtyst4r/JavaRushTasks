package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine(); // get first file name
        String secondFileName = reader.readLine(); // get second file name

        FileReader fileReader = new FileReader(firstFileName);
        FileWriter fileWriter = new FileWriter(secondFileName);

        ArrayList<Integer> arrayList = new ArrayList<>();

        while (fileReader.ready()){ //add all bytes from first file to array
            arrayList.add(fileReader.read());
        }
        for (int i = 1; i < arrayList.size(); i+=2){ //write all even symbols to second file
            fileWriter.write(arrayList.get(i));
        }

        // close all streams
        reader.close();
        fileReader.close();
        fileWriter.close();
    }
}
