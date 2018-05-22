package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //list of addresses
        HashMap<String, String> people = new HashMap<>();
        while (true) {
            String city = reader.readLine();
            if (city.isEmpty()) break;
            String family = reader.readLine();
            people.put(family, city);

        }
        String cityforChech = reader.readLine();

        for (HashMap.Entry<String, String> human : people.entrySet()) {
            if (human.getValue().equals(cityforChech)) {
                System.out.println(human.getKey());
            }
        }
    }
}
