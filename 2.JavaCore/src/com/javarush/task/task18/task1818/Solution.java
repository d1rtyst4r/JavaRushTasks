package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // get 3 files names from console
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        String thirdFile = reader.readLine();

        // open output and input streams
        FileInputStream fileInputStream1 = new FileInputStream(secondFile);
        FileInputStream fileInputStream2 = new FileInputStream(thirdFile);
        FileOutputStream fileOutputStream = new FileOutputStream(firstFile);

        // copy all data from second file to first
        while (fileInputStream1.available() > 0){
            fileOutputStream.write(fileInputStream1.read());
        }

        // then second file copied, start third file copy
        while (fileInputStream2.available() > 0){
            fileOutputStream.write(fileInputStream2.read());
        }

        //close all streams
        fileInputStream1.close();
        fileInputStream2.close();
        fileOutputStream.close();

    }
}
