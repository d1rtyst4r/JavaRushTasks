package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        //String s = reader.readLine().replaceAll("^.+[/?]","");
        String s = "http://javarush.ru/alpha/index.html?obj=3.14&name=Amigo".replace("^.+[/?]","");
        reader.close();
        System.out.println(s);
        String[] strings = s.split("&");
        for (String str : strings){
            System.out.println(str);
        }
        for (String str:strings) System.out.print(str.replaceAll("[=].+$","") + " ");
        for (String str:strings)
            if (str.contains("obj")) {
                try {
                    alert(Double.parseDouble(str.replaceAll("^.+[=]","")));
                }
                catch (Exception e){
                    alert(str);
                }
            }

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }
}