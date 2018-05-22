package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {

    private static void fillArrayList(ArrayList strs)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            strs.add(reader.readLine());
        }
    }

    private static void findShortestOrLongest(ArrayList<String> strs){
        int first;
        int longestStringIndex = 0;
        int shortestStringIndex =0;
        int longestSize = strs.get(0).length();
        int shortestSize = strs.get(0).length();
        for (int i = 0; i < strs.size(); i++){
            if (shortestSize > strs.get(i).length()){
                shortestStringIndex = i;
                shortestSize = strs.get(i).length();
            }
            if (longestSize < strs.get(i).length()){
                longestStringIndex = i;
                longestSize = strs.get(i).length();
            }
        }
        if (longestStringIndex > shortestStringIndex) System.out.println(strs.get(shortestStringIndex));
        else System.out.println(strs.get(longestStringIndex));
    }

    private static void printLongestOrShortestString(ArrayList<String> strs, int index){
        System.out.println(strs.get(index));
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        fillArrayList(strings);
        findShortestOrLongest(strings);

    }
}
