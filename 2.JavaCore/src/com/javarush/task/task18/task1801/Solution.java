package com.javarush.task.task18.task1801;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Максимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //get file name from console
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        //biggest byte
        long biggestByte = 0;

        //read file
        FileInputStream fileInputStream = new FileInputStream(fileName);

        while (fileInputStream.available() > 0){
            long data = fileInputStream.read();
            if (data > biggestByte){
                biggestByte = data;
            }
        }
        fileInputStream.close();

        //print biggest byte to console
        System.out.println(biggestByte);
    }
}
