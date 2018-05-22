package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

/* 
Играем в Jолушку
*/

public class Solution {

    private static void fillList (ArrayList<Integer> nums)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 20; i++){
            nums.add(Integer.parseInt(reader.readLine()));
        }
    }

    private static void autofillList (ArrayList<Integer> nums) throws IOException{
        Random random = new Random();
        for (int i = 0; i < 20; i ++){
            nums.add(random.nextInt(100));
        }
    }

    private static ArrayList dividesByThree(ArrayList<Integer> nums){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (Integer number : nums)
            if (number % 3 == 0){
            numbers.add(number);
        }
        return  numbers;
    }
    private static ArrayList dividesByTwo(ArrayList<Integer> nums){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (Integer number : nums){
            if (number % 2 == 0){
                numbers.add(number);
            }
        }
        return numbers;
    }
    private static ArrayList lastNumbers(ArrayList<Integer> nums){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (Integer number : nums){
            if (number % 2 != 0 || number % 3 != 0){
                numbers.add(number);
            }
        }
        return numbers;
    }

    private static void printLIst(ArrayList<Integer> numbs){
        for (int number : numbs){
            System.out.println(number);
        }
    }
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> numbers = new ArrayList<>();
        autofillList(numbers);
        ArrayList numbersDivisionByTree = dividesByThree(numbers);
        ArrayList numbersDivisonByTwo = dividesByTwo(numbers);
        ArrayList lastNumbs = lastNumbers(numbers);
        printLIst(numbers);
        System.out.println();
        printLIst(numbersDivisionByTree);
        System.out.println();
        printLIst(numbersDivisonByTwo);
        System.out.println();
        printLIst(lastNumbs);
    }
}
