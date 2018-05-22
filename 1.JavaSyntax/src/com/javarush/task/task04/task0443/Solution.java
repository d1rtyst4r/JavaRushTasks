package com.javarush.task.task04.task0443;


/* 
Как назвали, так назвали
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String name = bufferedReader.readLine();
        int day = Integer.parseInt(bufferedReader.readLine());
        int mounth = Integer.parseInt(bufferedReader.readLine());
        int year = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Меня зовут " + name +".");
        System.out.println("Я родился " + day +"." + mounth + "." + year);
    }
}
