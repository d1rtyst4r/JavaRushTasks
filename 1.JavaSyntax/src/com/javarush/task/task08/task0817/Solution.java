package com.javarush.task.task08.task0817;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Нам повторы не нужны
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> humans = new HashMap<>();
        humans.put("Dud", "And");
        humans.put("Jef", "And");
        humans.put("Jas", "Rus");
        humans.put("Ava", "Vit");
        humans.put("Ide", "Vit");
        humans.put("Kuz", "Ole");
        humans.put("Lic", "Jef");
        humans.put("Fer", "Nik");
        humans.put("Sol", "Ser");
        humans.put("Kul", "Ser");

        return humans;
    }


    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {
        //напишите тут ваш код
        HashMap<String, String> copy = new HashMap<>(map);
        ArrayList<String> people = new ArrayList<>();

        for (HashMap.Entry<String,String> pair : copy.entrySet()){
            if (!people.contains(pair.getValue())){
                people.add(pair.getValue());
            }
        }
        for ( String human : people) {
            int count = 1;
            for (HashMap.Entry<String, String> pair : map.entrySet()) {
                String firstname = pair.getValue();

                if (firstname.equals(human)) {
                    count++;
                }
            }
            if (count> 2) {
                removeItemFromMapByValue(map, human);
            }

        }
    }
    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }

    public static void main(String[] args) {
        HashMap<String, String> hashPeople = createMap();
        removeTheFirstNameDuplicates(hashPeople);
    }
}
