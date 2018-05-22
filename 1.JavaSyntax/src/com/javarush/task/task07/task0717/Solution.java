package com.javarush.task.task07.task0717;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Удваиваем слова
*/

public class Solution {

    public static void main(String[] args) throws Exception {
        // Считать строки с консоли и объявить ArrayList list тут
        ArrayList<String> list = new ArrayList<>();
        fillArrayWithTenStrings(list);
        ArrayList<String> result = doubleValues(list);
        printArrayListToConsole(result);
        // Вывести на экран result
    }

    public static ArrayList<String> doubleValues(ArrayList<String> arrlist) {
        //напишите тут ваш код
        for (int i = 0; i < 19; i +=2){
            arrlist.add(i + 1,arrlist.get(i));
        }
        return arrlist;
    }

    public static void fillArrayWithTenStrings(ArrayList arrayList) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            arrayList.add(reader.readLine());
        }
    }
    /*public static void autoFillArrayWithTenStrings(ArrayList arrayList){
        for (int i = 0; i < 10; i++){
            arrayList.add("a" +i);
        }
    }*/
    public static void printArrayListToConsole(ArrayList arrayList){
        for (int i = 0; i < arrayList.size(); i++){
            System.out.println(arrayList.get(i));
        }
    }
}
