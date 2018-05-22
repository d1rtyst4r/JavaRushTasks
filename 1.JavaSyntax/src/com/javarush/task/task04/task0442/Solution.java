package com.javarush.task.task04.task0442;


/* 
Суммирование
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        boolean repeat =true;
        int sum = 0;
        while (repeat){
            int temp = Integer.parseInt(bufferedReader.readLine());
            sum += temp;
            if (temp == -1){
                repeat = false;
            }
        }
        System.out.println(sum);
    }
}
