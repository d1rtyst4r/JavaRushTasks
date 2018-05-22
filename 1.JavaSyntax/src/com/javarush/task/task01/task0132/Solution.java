package com.javarush.task.task01.task0132;

/* 
Сумма цифр трехзначного числа
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(sumDigitsInNumber(546));
    }

    public static int sumDigitsInNumber(int number) {
        //напишите тут ваш код
        int num = number;
        int sum = 0;
        while (num > 9){
            int temp = num % 10;
            sum +=temp;
            num = (num - temp) / 10;
        }
        sum += num;
        return sum;
    }
}