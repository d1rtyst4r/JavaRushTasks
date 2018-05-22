package com.javarush.task.task18.task1822;

/* 
Поиск данных внутри файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        String strID = args[0];
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        ArrayList<String> lines = new ArrayList<>();

        fillArrayList(reader, lines);
        findProductDescription(lines, strID);

        reader.close();

    }
    public static void fillArrayList(BufferedReader bReader, ArrayList<String> arrayToFill) throws IOException {
        while (bReader.ready()){
            String line = bReader.readLine();
            arrayToFill.add(line);
        }
    }
    public static void findProductDescription (ArrayList<String> arrayToSearch, String id){
        for (String str : arrayToSearch){
            if (str.startsWith(id + " ")){
                System.out.print(str);
            }
        }
    }
}
