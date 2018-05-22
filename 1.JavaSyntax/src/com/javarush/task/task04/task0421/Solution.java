package com.javarush.task.task04.task0421;

/* 
Настя или Настя?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String firstName = bufferedReader.readLine();
        String secondName = bufferedReader.readLine();

        checkNames(firstName, secondName);
    }
    public static void checkNames(String first, String second){
        if (first.length() == second.length()){
            if (first.equals(second)){
                System.out.println("Имена идентичны");
            }
            else  {
                System.out.println("Длины имен равны");
            }
        }
    }
}
