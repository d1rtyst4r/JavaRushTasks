package com.javarush.task.task13.task1326;

/* 
Сортировка четных чисел из файла
*/

import java.io.*;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        //get fileAddress from console
        String fileAddress = getFileAdrees();

        // read file and save data from file to ArrayList<String>
        ArrayList<String> sNumbers = getStringsFromFile(fileAddress);

        //convert strings to odd integers
        ArrayList<Integer> oddNumbers = getOddIntegersFromStrings(sNumbers);

        //sort ArrayList
        sortArrayList(oddNumbers);
        //print all numbers from new string

        //print array to console
        printArrayList(oddNumbers);


    }

    //get fileAddress from console
    public static String getFileAdrees() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String address = reader.readLine();
        reader.close();
        return address;
    }

    // read file and save data from file to ArrayList<String>
    public static ArrayList<String> getStringsFromFile(String address) throws IOException {
        ArrayList<String> stringArrayList = new ArrayList<>();
        String str = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(address)));
        while ((str = reader.readLine()) != null) {
            stringArrayList.add(str);
        }
        reader.close();
        return stringArrayList;
    }

    //convert strings to integers and add only odd integers to ArrayList
    public static ArrayList<Integer> getOddIntegersFromStrings(ArrayList<String> stringArrayList) {
        ArrayList<Integer> oddArrayList = new ArrayList<>();
        int temp;
        for (String string : stringArrayList) {
            temp = Integer.parseInt(string);
            if (temp % 2 == 0) {
                oddArrayList.add(temp);
            }
        }
        return oddArrayList;
    }

    //sort ArrayList
    public static void sortArrayList (ArrayList<Integer> integerArrayList){
        int temp = integerArrayList.get(0);
        for (int i = 1; i < integerArrayList.size(); i++){
            for (int j = 0; j < integerArrayList.size()-1; j++){
                if (integerArrayList.get(j) > integerArrayList.get(j+1)){
                    temp = integerArrayList.get(j);
                    integerArrayList.set(j, integerArrayList.get(j+1));
                    integerArrayList.set(j+1, temp);
                }
            }
        }
    }

    //print ArrayList to console
    public static void printArrayList(ArrayList<Integer> integerArrayList){
        for (int x :integerArrayList){
            System.out.println(x);
        }
    }
}