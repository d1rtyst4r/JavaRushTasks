package com.javarush.task.task07.task0718;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Проверка на упорядоченность
*/
public class Solution {

    public static void fillArrayList(ArrayList list) throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i =0; i < 10; i++) {
            list.add(reader.readLine());
        }
    }
    // method check list is it sorted, if it not, print index of thirst unsorted unit.
    public static void checkingIsListSorted(ArrayList<String> stringsList){
        for (int i =1; i < stringsList.size();){
            if(stringsList.get(i-1).length() > stringsList.get(i).length()){
                System.out.println(i);
                break;
            }
            else i++;
        }
    }
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<>();
        fillArrayList(strings);
        checkingIsListSorted(strings);

    }
}

