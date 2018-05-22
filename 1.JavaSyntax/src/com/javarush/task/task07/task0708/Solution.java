package com.javarush.task.task07.task0708;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Самая длинная строка
*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    private static void fillList(List<String> strs) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            strs.add(reader.readLine());
        }
    }
    private static int longestStringInList(List<String> strs){
        int longest = 0;
        for (int i = 0; i < strs.size(); i++){
            if (strs.get(i).length() > longest){
                longest = strs.get(i).length();
            }
        }
        return  longest;
    }
    private static void printLongestString(List<String> strs, int size){
        for (String str : strs){
            if (str.length() == size){
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        fillList(strings);
        int longestSize = longestStringInList(strings);
        printLongestString(strings, longestSize);

    }
}
