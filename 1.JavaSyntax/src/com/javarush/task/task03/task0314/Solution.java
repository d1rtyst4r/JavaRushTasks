package com.javarush.task.task03.task0314;

/* 
Таблица умножения
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        int[][] arr = new int[11][11];
        for (int i = 0; i < 11; i++) {
            arr[i][0] = i;
            arr[0][i] = i;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                arr[i][j] = i * j;
            }
        }
        for (int i = 1; i < arr.length; i++){
            for (int j= 1; j < arr.length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
