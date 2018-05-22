package com.javarush.task.task04.task0437;


/* 
Треугольник из восьмерок
*/

public class Solution {
    public static void repeatEightNTimes (int repeat){
        for (int i = 1; i <= repeat; i++){
            System.out.print(8);
        }
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        for (int i = 1; i <= 10; i++){
            repeatEightNTimes(i);
            System.out.println();
        }

    }
}
