package com.javarush.task.task07.task0714;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/* 
Слова в обратном порядке
*/

public class Solution {

    private static void fillNamList(ArrayList<String> listForFill) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++){
            listForFill.add(reader.readLine());
        }
    }

    private static void autoFillNameList(ArrayList<String> list) throws IOException{
        for (int i = 1; i <= 5; i++){
            list.add("vasja" + i);
        }
    }

    private static void printListBackForwar(ArrayList<String> list){
        for (int i = list.size()-1; i >=0; i--){
            System.out.println(list.get(i));
        }
    }

    private static void printList(ArrayList<String> list){
        for (String str : list) System.out.println(str);
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> nameList = new ArrayList<>();
        autoFillNameList(nameList);
        nameList.remove(2);
        printList(nameList);
        System.out.println("");
        printListBackForwar(nameList);


    }
}


