package com.javarush.task.task19.task1919;

/*
Самый богатый
*/

import javafx.collections.transformation.SortedList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        ArrayList<String[]> allLinesInFile = getAllLinesFromFiles(fileName);
        TreeSet<String> uniqueNames = getUniqueNamesFromFile(allLinesInFile);
        TreeMap<String, Double> namesAndValue = getMapWithNamesAndAmounts(uniqueNames, allLinesInFile);
        printPersoneAndAmounts(namesAndValue);


    }
    // save allLines in Array list as array
    private static ArrayList<String[]> getAllLinesFromFiles(String fName) throws IOException {
        ArrayList<String[]> lines = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fName));
        while (bufferedReader.ready()){
            lines.add(bufferedReader.readLine().split(" "));
        }
        bufferedReader.close();
        return lines;
    }

    // get All unique names in file
    private static TreeSet<String> getUniqueNamesFromFile(ArrayList<String[]> lines){
        TreeSet<String> names = new TreeSet<>();
        for (String[] strings : lines){
            names.add(strings[0]);
        }
        return names;
    }

    // create Map with Person name and his total amount
    private static TreeMap<String, Double> getMapWithNamesAndAmounts(TreeSet<String> names, ArrayList<String[]> namesAndValue){
        TreeMap<String, Double> result = new TreeMap<>();
        double amount = 0.0;
        for (String name : names){
            for (String[] strings : namesAndValue){
                if (name.equals(strings[0])){
                    amount += Double.parseDouble(strings[1]);
                }
            }
            result.put(name, amount);
            amount = 0.0;
        }
        return result;
    }

    // print Person name and his total amount
    private static void printPersoneAndAmounts(TreeMap<String, Double> namesAndValues){
        for (Map.Entry<String, Double> map : namesAndValues.entrySet()){
            System.out.println(map.getKey() + " " + map.getValue());
        }
    }

}
