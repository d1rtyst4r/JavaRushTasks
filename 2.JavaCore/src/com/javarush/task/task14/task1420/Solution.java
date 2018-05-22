package com.javarush.task.task14.task1420;

/* 
НОД
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sFirstNumber = reader.readLine();
        String sSecondNumber = reader.readLine();
        int firstNumber = Integer.parseInt(sFirstNumber);
        if (firstNumber <= 0) throw new Exception();
        int secondNumber = Integer.parseInt(sSecondNumber);
        if (secondNumber <=0) throw new Exception();
        int gcd = greatestCommonDivision(firstNumber, secondNumber);
        System.out.println(gcd);

    }
    public static int greatestCommonDivision(int first, int second){
        //euclidean algorithm
        int a = first;
        int b = second;
        int c = (a % b);

        while (c !=0){
            a = b;
            b = c;
            c = a % b;
        }
        return b;
    }
}
