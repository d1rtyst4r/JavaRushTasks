package com.javarush.task.task19.task1914;

/* 
Решаем пример
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

        String input = outputStream.toString();
        String[] tempResult = input.split(" ");
        int firstNumber = Integer.parseInt(tempResult[0]);
        int secondNumber = Integer.parseInt(tempResult[2]);

        int result = 0;
        if (tempResult[1].equals("+")){
            result = firstNumber + secondNumber;
        }
        else if (tempResult[1].equals("-")){
            result = firstNumber - secondNumber;
        }
        else if (tempResult[1].equals("*")){
            result = firstNumber * secondNumber;
        }

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(tempResult[0] + " ");
        stringBuilder.append(tempResult[1] + " ");
        stringBuilder.append(tempResult[2] + " ");
        stringBuilder.append(tempResult[3] + " ");
        stringBuilder.append(result);
        String finalResult = stringBuilder.toString();

        System.setOut(consoleStream);
        System.out.print(finalResult);


    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

