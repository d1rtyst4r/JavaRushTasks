package com.javarush.task.task19.task1913;

/* 
Выводим только цифры
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();

        char[] result = outputStream.toString().toCharArray();
        ArrayList<Character> tempResult = new ArrayList<>();
        for (char x : result){
            if (isInteger(x)){
                tempResult.add(x);
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (Character z : tempResult){
            stringBuilder.append(z);
        }
        String finalResult = stringBuilder.toString();
        System.setOut(consoleStream);
        System.out.print(finalResult);

    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's 1 a 23 text 4 f5-6or7 tes8ting");
        }
    }
    private static boolean isInteger(char c){
        boolean result = false;
        if (c == '1' || c == '2' || c == '3'|| c =='4' || c == '5' || c == '6' || c == '7' || c == '8'
                || c == '9' || c == '0'){
            result = true;
        }
        return result;
    }
}
