package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        //get files names from console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();

        //save data from first file to buffer
        FileInputStream fileInputStream1 = new FileInputStream(firstFile);
        FileOutputStream fileOutputStream1 = new FileOutputStream(firstFile);
        ArrayList<Byte> buffer = new ArrayList<>();
        while (fileInputStream1.available() > 0){
            buffer.add((byte) fileInputStream1.read());
        }

        // delete add data in first file
        fileOutputStream1.write(("").getBytes());

        //read data from second file and write it to first file
        FileInputStream fileInputStream2 = new FileInputStream(secondFile);
        while (fileInputStream2.available() > 0){
            fileOutputStream1.write(fileInputStream2.read());
        }

        // write data from buffer to first file
        for (Byte x : buffer){
            fileOutputStream1.write(x);
        }

        // close all streams
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream1.close();
    }
}
