package com.javarush.task.task15.task1519;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/* 
Разные методы для разных типов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //напиште тут ваш код
        while (true){
            String line = readLineFromConsole();
            if (line.equals("exit")) break;
            else{
                printStringToConsole(line);
            }
        }

    }

    //read line from console
    public static String readLineFromConsole() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();
        return text;
    }
    // return true if string is Double
    public static boolean isDouble(String s){
        boolean isDec = false;
        char[] chars = s.toCharArray();
        try{
            Double.parseDouble(s);
            for (char c : chars) {
                if (c == '.') {
                    isDec = true;
                }
            }
        }catch (IllegalArgumentException e){
        }
        return isDec;
    }
    //method return true if string is integer
    public static boolean isInteger(String s){
        boolean isInt= false;
        char[] chars = s.toCharArray();
        try {
            int number = Integer.parseInt(s);
            isInt = true;
        } catch (IllegalArgumentException e){
        }
        return isInt;
    }

    public static void printStringToConsole(String s){
        if (!s.isEmpty() && isDouble(s) && !isInteger(s)){
            print(Double.parseDouble(s));
        }
        else if (!s.isEmpty() && isInteger(s) && (Integer.parseInt(s) < 128)
                &&(Integer.parseInt(s) > 0) && !isDouble(s)){
            print(Short.parseShort(s));
        }
        else if (!s.isEmpty() && isInteger(s) && ((Integer.parseInt(s) >=128)
                || (Integer.parseInt(s) <=0)) && !isDouble(s)){
            print(Integer.parseInt(s));
        }
        else print(s);

    }

    public static void print(Double value) {
        System.out.println("Это тип Double, значение " + value);
    }

    public static void print(String value) {
        System.out.println("Это тип String, значение " + value);
    }

    public static void print(short value) {
        System.out.println("Это тип short, значение " + value);
    }

    public static void print(Integer value) {
        System.out.println("Это тип Integer, значение " + value);
    }
}
