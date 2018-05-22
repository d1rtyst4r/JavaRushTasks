package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Random;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        Random rnd = new Random();
        ArrayList<String>[] arrayLists = new ArrayList[rnd.nextInt(10)];
        for (int i = 0; i < arrayLists.length; i++){
            arrayLists[i] = new ArrayList<>();
            for (int j = 1; j < rnd.nextInt(100); j++){
                arrayLists[i].add("s"+j);
            }
        }

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}