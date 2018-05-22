package com.javarush.task.task04.task0425;

/* 
Цель установлена!
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int oX = Integer.parseInt(bufferedReader.readLine());
        int oY = Integer.parseInt(bufferedReader.readLine());

        checkSqueare(oX, oY);
    }
    public static void checkSqueare(int x, int y){
        if (x > 0 && y > 0){
            System.out.println("Your point is in 1 square");
        }
        else if (x >0 && y < 0){
            System.out.println("Your point is in 4 square");
        }
        else if (x < 0 && y < 0){
            System.out.println("Your point is in 3 square");
        }
        else if (x < 0 && y > 0){
            System.out.println("Your point is in 2 square");
        }
    }
}
