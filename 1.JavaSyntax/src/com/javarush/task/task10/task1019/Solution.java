package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> hashMap = new HashMap<>();
        while (true){
            String sInt = reader.readLine();
            if (sInt.isEmpty()){
                break;
            }
            else{
                int id = Integer.parseInt(sInt);
                String name = reader.readLine();
                hashMap.put(name, id);
            }
        }
        for (HashMap.Entry<String, Integer> keyValues : hashMap.entrySet()){
            System.out.println(keyValues.getValue() + " " + keyValues.getKey());
        }

    }
}
