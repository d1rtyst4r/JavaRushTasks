package com.javarush.task.task05.task0529;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Консоль-копилка
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;

        while (true){
            String sCoins = bufferedReader.readLine();
            if (sCoins.equals("sum")){
                break;
            }
            else {
                int coin = Integer.parseInt(sCoins);
                sum +=coin;
            }
        }
        System.out.println(sum);
    }
}
