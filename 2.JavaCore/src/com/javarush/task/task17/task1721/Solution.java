package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        String test = "test";
        if (forRemoveLines.contains(test)){
            System.out.print("Yes");
        }else System.out.print("NO");
    }

    public void joinData () throws CorruptedDataException {
        //create reader
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // get first file name
        try {
            String firstFileName = bufferedReader.readLine();
        } catch (IOException e) {
        }
        // get second file name
        try {
            String secondFileName = bufferedReader.readLine();
        } catch (IOException e){
        }
        // write all lines from first file to allLines
        // write all lines from second file to forRemoveLines
        //

    }
}
