package com.javarush.task.task04.task0419;

/* 
Максимум четырех чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int firsNumber = Integer.parseInt(bufferedReader.readLine());
        int secondNumber = Integer.parseInt(bufferedReader.readLine());
        int thirdNumber = Integer.parseInt(bufferedReader.readLine());
        int forthNumber = Integer.parseInt(bufferedReader.readLine());

        max(firsNumber, secondNumber, thirdNumber, forthNumber);
    }
    public static void max(int first, int second, int third, int forth){
        if (first >= second && first >= third && first >= forth){
            System.out.println(first);
        }
        else if (second >= first && second >= third && second >= forth) {
            System.out.println(second);
        }
        else if (third >= first && third >= second && third >= forth){
            System.out.println(third);
        }
        else if (forth >= first && forth >= second && forth >= third){
            System.out.println(forth);
        }
    }
}
