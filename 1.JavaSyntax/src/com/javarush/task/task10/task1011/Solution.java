package com.javarush.task.task10.task1011;

/* 
Большая зарплата
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        String s = "Я не хочу изучать Java, я хочу большую зарплату";

        char[] chars = s.toCharArray();
        ArrayList<Character> characters = new ArrayList<>();
        for (char c : chars){
            characters.add(c);
        }
        for (int i = 0; i < 40; i++){
            for (char c : characters){
                System.out.print(c);
            }
            System.out.println();
            characters.remove(0);
        }
    }
}

