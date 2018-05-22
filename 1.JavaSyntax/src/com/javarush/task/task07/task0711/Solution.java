package com.javarush.task.task07.task0711;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удалить и вставить
*/

public class Solution {

    private static void fillList(ArrayList<String> strs)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            strs.add(reader.readLine());
        }
    }

    private static void addAndRemoveLastStringInList(ArrayList<String> strs){
        String removedString = strs.get(strs.size()-1);
        for (int i = 0; i < 13; i++){
            strs.remove(strs.size()-1);
            strs.add(0, removedString);
            removedString = strs.get(strs.size()-1);
        }
    }

    private static void printList(ArrayList<String> strs){
        for(String str : strs) System.out.println(str);
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        fillList(strings);
        addAndRemoveLastStringInList(strings);
        printList(strings);

    }
}
