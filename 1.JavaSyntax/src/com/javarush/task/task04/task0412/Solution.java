package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String sInteger = bufferedReader.readLine();
        int nInteger = Integer.parseInt(sInteger);
        positiveOrNegative(nInteger);

    }
    public static void positiveOrNegative(int a){
        if (a > 0){
                System.out.println(a * 2);
        }
        else if (a < 0){
            System.out.println(a + 1);
        }
        else System.out.println(0);
    }

}