package com.javarush.task.task09.task0923;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;

/* 
Гласные и согласные
*/

public class Solution {
    public static char[] vowels = new char[]{'а', 'я', 'у', 'ю', 'и', 'ы', 'э', 'е', 'о', 'ё'};

    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        char[] texTochat = text.toCharArray();
        ArrayList<Character> vowels = new ArrayList<>();
        ArrayList<Character> notVowels = new ArrayList<>();
        for (char c : texTochat){
            if (isVowel(c)) {
                vowels.add(c);
            }
            else notVowels.add(c);

        }
        ArrayList<Character>  copy = new ArrayList<>();

        for (char c  :  notVowels){
            if  (c != ' '){
                copy.add(c);
            }
        }
        for (char c : vowels){
            System.out.print(c + " ");
        }
        System.out.println();

        for (char c : copy){
            System.out.print(c + " ");
        }
    }

    // метод проверяет, гласная ли буква
    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // приводим символ в нижний регистр - от заглавных к строчным буквам

        for (char d : vowels)   // ищем среди массива гласных
        {
            if (c == d)
                return true;
        }
        return false;
    }
}