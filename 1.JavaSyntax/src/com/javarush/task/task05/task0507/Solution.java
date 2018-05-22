package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double count = 0;
        boolean cycle = true;
        while (cycle){
            double number = Double.parseDouble(bufferedReader.readLine());
            if (number == -1.0){
                cycle = false;
            }
            else {
                sum += number;
                count += 1.0;
            }
        }
        double mid = sum / count;
        System.out.println(mid);
    }

}

