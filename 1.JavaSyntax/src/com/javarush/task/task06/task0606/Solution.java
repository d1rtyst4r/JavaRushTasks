package com.javarush.task.task06.task0606;

import java.io.*;

/* 
Чётные и нечётные циферки
*/

public class Solution {

    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());
        while (number > 0){
            int temp = number % 10;// get last number in user number
            if (temp % 2 == 0){ // check is it even
                even++; // if even rise even for 1
            }
            else odd++; // if odd rise odd for 1
            number = (number - temp) / 10; // reduce user number for last number
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
