package com.javarush.task.task05.task0532;

import java.io.*;

/* 
Задача по алгоритмам
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maximum = Integer.parseInt(reader.readLine());
        while (true){
            int num = Integer.parseInt(reader.readLine());
            if (num == 0){
                break;
            }
            else {
                if (num > maximum){
                    maximum = num;
                }
            }
        }

        //напишите тут ваш код

        System.out.println(maximum);
    }
}
