package com.javarush.task.task19.task1920;

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
        HashSet<String> uniqueNames = getUniqueNamesFromFile(allLinesInFile);
        HashMap<String, Double> namesAndValue = getMapWithNamesAndAmounts(uniqueNames, allLinesInFile);
        printAllNamesWithMaxValue(namesAndValue);

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
    private static HashSet<String> getUniqueNamesFromFile(ArrayList<String[]> lines){
        HashSet<String> names = new HashSet<>();
        for (String[] strings : lines){
            names.add(strings[0]);
        }
        return names;
    }

    // create Map with Person name and his total amount
    private static HashMap<String, Double> getMapWithNamesAndAmounts(HashSet<String> names, ArrayList<String[]> namesAndValue){
        HashMap<String, Double> result = new HashMap<>();
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

    // print to console all Persons names with max amount
    private static void printAllNamesWithMaxValue(HashMap<String, Double> namesValue){
        double amount = Collections.max(namesValue.values()); // get max amount in map

        Set<String> set = new TreeSet<>();

        for (Map.Entry<String, Double> pair : namesValue.entrySet()){ // save all names with max amount
            if (pair.getValue() >= amount) set.add(pair.getKey());
        }

        for (String name : set){
            System.out.println(name);
        }
    }
}
