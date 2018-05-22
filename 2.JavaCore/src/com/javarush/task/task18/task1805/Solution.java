package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

/*
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //get file name from console
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        SortedSet<Long> sortedSet = new TreeSet<>();

        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available() > 0){
            long data = fileInputStream.read();
            sortedSet.add(data);
        }
        fileInputStream.close();

        for (long byteInSet : sortedSet){
            System.out.print(byteInSet + " ");
        }
    }
}