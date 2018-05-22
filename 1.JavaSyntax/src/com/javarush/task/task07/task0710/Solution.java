package com.javarush.task.task07.task0710;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
В начало списка
*/

public class Solution {
    private static void fillList(ArrayList<String> strs) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            strs.add(0, reader.readLine());
        }
    }

    private static void printList(ArrayList<String> strs){
        for (String string : strs){
            System.out.println(string);
        }
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        fillList(strings);
        printList(strings);
    }
}
