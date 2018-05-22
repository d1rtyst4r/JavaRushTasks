package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        ArrayList<Character> chars = new ArrayList<>();
        FileInputStream inputStream = new FileInputStream(args[0]);
        while (inputStream.available() > 0){
            chars.add((char) inputStream.read());
        }
        int count = 0;

        for (Character x : chars){
            if (x.toString().matches("[a-zA-Z]")){
                count++;
            }
        }
        System.out.println(count);
        inputStream.close();
    }
}
