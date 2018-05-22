package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //get file name from console
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        //read file
        FileInputStream fileInputStream = new FileInputStream(fileName);
        long minByte = fileInputStream.read(); // get first value
        while (fileInputStream.available() > 0){
            long data = fileInputStream.read();
            if (data < minByte){
                minByte = data;
            }
        }
        fileInputStream.close();
        System.out.println(minByte);
    }
}
