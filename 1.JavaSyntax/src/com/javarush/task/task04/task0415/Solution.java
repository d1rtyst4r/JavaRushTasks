package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int triangleSide1 = Integer.parseInt(bufferedReader.readLine());
        int triangleSide2 = Integer.parseInt(bufferedReader.readLine());
        int triangleSide3 = Integer.parseInt(bufferedReader.readLine());

        if ((triangleSide1 + triangleSide1 > triangleSide3) ||(triangleSide1 + triangleSide2 > triangleSide3)||
                (triangleSide2 + triangleSide3 > triangleSide1)){
            System.out.println("Triangle exist");
        }
        else {
            System.out.println("Triangle don't exist");
        }
    }
}