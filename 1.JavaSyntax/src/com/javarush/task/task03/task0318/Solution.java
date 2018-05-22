package com.javarush.task.task03.task0318;

/* 
План по захвату мира
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));

        String name = bufferedReader.readLine();
        String sTime = bufferedReader.readLine();
        int nTime = Integer.parseInt(sTime);

        System.out.println(name + " захватит мир через " + nTime + " лет. Му-ха-ха!");
        }
    }