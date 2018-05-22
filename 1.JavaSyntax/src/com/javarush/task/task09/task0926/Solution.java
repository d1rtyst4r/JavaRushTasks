package com.javarush.task.task09.task0926;

import java.util.ArrayList;
import java.util.Random;

/* 
Список из массивов чисел
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<int[]> list = createList();
        printList(list);
    }

    public static ArrayList<int[]> createList() {
        //напишите тут ваш код
        ArrayList<int[]> arrayList = new ArrayList<>();
        int[] arr1 = new int[5];
        int[] arr2 = new int[2];
        int[] arr3 = new int[4];
        int[] arr4 = new int[7];
        int[] arr5 = new int[0];

        fillArray(arr1);
        fillArray(arr2);
        fillArray(arr3);
        fillArray(arr4);
        arrayList.add(arr1);
        arrayList.add(arr2);
        arrayList.add(arr3);
        arrayList.add(arr4);
        arrayList.add(arr5);
        return arrayList;
    }

    public static void printList(ArrayList<int[]> list) {
        for (int[] array : list) {
            for (int x : array) {
                System.out.println(x);
            }
        }
    }
    public static void fillArray(int[] arr){
        Random rnd = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = rnd.nextInt(100);
        }
    }
}
