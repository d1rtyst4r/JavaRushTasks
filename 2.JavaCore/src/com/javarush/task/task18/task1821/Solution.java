package com.javarush.task.task18.task1821;

/* 
Встречаемость символов
*/

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        //get file name
        String fileName = args[0];

        FileInputStream fileInputStream = new FileInputStream(fileName);
        TreeMap<Integer, Integer> map = new TreeMap<>();
        while (fileInputStream.available() > 0){ // while file is available
            int i = fileInputStream.read(); // read byte
            if (map.containsKey(i)) {
                map.put(i , map.get(i) + 1); // rise value
            }
            else {
                map.put(i, 1); // if not pu 1
            }
        }
        fileInputStream.close(); // close stream
        for (Map.Entry pair : map.entrySet()){ //read all map
            char ch = (char) Integer.parseInt(pair.getKey().toString()); //get ASCII
            System.out.println(ch +" " + pair.getValue()); // print to console
        }
        fileInputStream.close();

    }
}
