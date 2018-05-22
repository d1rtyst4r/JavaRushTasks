package com.javarush.task.task07.task0709;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Выражаемся покороче
*/

public class Solution {
    private static List<String> strings = new ArrayList<String>();

    private static void fillList(List<String> strs) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            strs.add(reader.readLine());
        }
    }
    private static int longestStringInList(List<String> strs){
        int shortest = strs.get(0).length();
        for (int i = 1; i < strs.size(); i++){
            if (strs.get(i).length() < shortest){
                shortest = strs.get(i).length();
            }
        }
        return  shortest;
    }
    private static void printShortestString(List<String> strs, int size){
        for (String str : strs){
            if (str.length() == size){
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        fillList(strings);
        int shortestSize = longestStringInList(strings);
        printShortestString(strings, shortestSize);

    }
}

