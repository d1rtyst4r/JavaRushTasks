package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test {
    public static void main(String[] args){
        int sum = 0;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                String text = reader.readLine();
                if (text.equals("N")) {
                    break;
                } else {
                    sum += Integer.parseInt(text);
                }
            } catch (IOException e) {
            }
        }
        System.out.println(sum);
    }
}
