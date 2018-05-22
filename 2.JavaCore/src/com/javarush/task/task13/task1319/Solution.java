package com.javarush.task.task13.task1319;

import java.io.*;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        //read file location from console
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileAddress = bufferedReader.readLine();
        //String fileAddress = "/Users/ruslansjasinovics/Google Drive/test.txt";
        //open file
        BufferedWriter bw = new BufferedWriter(new FileWriter(fileAddress));

        boolean keepWrite = true;
        while (keepWrite){
            String text = bufferedReader.readLine();
            bw.write(text);
            bw.newLine();
            if (text.equals("exit")){
                keepWrite = false;
            }

        }

        bw.close();

        //white strings to file while till entered 'exit'
        //print all strings to consol


    }
}
