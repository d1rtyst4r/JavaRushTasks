package com.javarush.task.task19.task1912;

/* 
Ридер обертка 2
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream consoleStream = System.out;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(outputStream);
        System.setOut(stream);
        testString.printSomething();
        char[] result = outputStream.toString().toCharArray();
        for (int i = 0; i <result.length -1; i++){
            if (result[i] == 't' && result[i+1] =='e'){
                result[i] = '?';
                result[i+1] = '?';
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char c :result){
            stringBuilder.append(c);
        }
        String finalResult = stringBuilder.toString();
        System.setOut(consoleStream);
        System.out.println(finalResult);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("it's a text for testing");
        }
    }
}
