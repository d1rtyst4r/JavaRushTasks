package com.javarush.task.task08.task0812;

import java.io.*;
import java.util.ArrayList;

/* 
Cамая длинная последовательность
*/
public class Solution {

    public static void fillArayList(ArrayList<Integer> arrayList) throws  IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++){
            arrayList.add(Integer.parseInt(reader.readLine()));
        }
    }
    public static void findLongestreapet(ArrayList<Integer> arrayList){
        int repeat = 1;
        int longestRepeat = 0;
        for (int i = 0; i < arrayList.size() - 1; i++){
            if (arrayList.get(i) == arrayList.get(i+1)){
                repeat++;
            }
            else repeat = 1;
            if (repeat > longestRepeat){
                longestRepeat = repeat;
            }
        }
        System.out.println(longestRepeat);
    }
    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        ArrayList<Integer> numbers = new ArrayList();
        fillArayList(numbers);
        findLongestreapet(numbers);


    }
}