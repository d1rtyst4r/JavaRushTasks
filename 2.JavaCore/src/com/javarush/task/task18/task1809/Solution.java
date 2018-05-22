package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = bufferedReader.readLine();
        String secondFile = bufferedReader.readLine();

        //read file
        FileInputStream fileInputStream = new FileInputStream(firstFile);
        FileOutputStream fileOutputStream = new FileOutputStream(secondFile);

        // create buffer
        ArrayList<Byte> buffer = new ArrayList<>();
        while (fileInputStream.available() > 0){
            buffer.add((byte) fileInputStream.read());
        }

        //write all bytes backforward from 1-st file to second
        for (int i = buffer.size()-1; i >=0; i--){
            fileOutputStream.write(buffer.get(i));
        }

        //close all streams
        fileInputStream.close();
        fileOutputStream.close();
    }
}
