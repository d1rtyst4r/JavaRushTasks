package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    static void midle(float first, float second, float third){
        float mid = (float)((first + second + third) / 3.0);
        System.out.println(mid);

    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        float a = Float.parseFloat(bufferedReader.readLine());
        float b = Float.parseFloat(bufferedReader.readLine());
        float c = Float.parseFloat(bufferedReader.readLine());
        midle(a, b, c);
    }
}
