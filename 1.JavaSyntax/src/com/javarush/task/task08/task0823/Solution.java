package com.javarush.task.task08.task0823;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/* 
Омовение Рамы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String string = "   мама мыла раму";
        String letter;
        letter = string.substring(0,1).toUpperCase();
        StringBuilder s1 = new StringBuilder("");
        s1.append(letter);
        for (int i=1;i<string.length();i++){
            letter = string.substring(i,i+1);
            if (string.substring(i-1,i).equals(" ")) letter = letter.toUpperCase(); //check is befor " " if true, next letter toUpper
            s1.append(letter);
            System.out.println(letter);
        }
        System.out.println(s1);
        }
    }