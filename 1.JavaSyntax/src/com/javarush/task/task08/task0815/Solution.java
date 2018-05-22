package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> people = new HashMap<>();
        people.put("Jax", "Rus");
        people.put("Jax", "And");
        people.put("Jax", "Rit");
        people.put("Afa", "Vit");
        people.put("Ide", "Vit");
        people.put("Jef", "And");
        people.put("Bai", "Lub");
        people.put("Lal", "Jek");
        people.put("Mos", "Vla");
        people.put("Dud", "And");
        return people;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 1;
        for (HashMap.Entry<String, String> pair : map.entrySet()){
            String firstname = pair.getValue();

            if (firstname.equals(name)){
                count++;
            }
        }
        return  count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 1;
        for (HashMap.Entry<String, String> pair : map.entrySet()){
            String last = pair.getKey();

            if (last.equals(lastName)){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        HashMap<String, String> testPeople = createMap();
        int repeatInNames = getCountTheSameFirstName(testPeople, "And");
        int repeatInLastName = getCountTheSameLastName(testPeople, "Jax");
        System.out.println(repeatInLastName + " " + repeatInNames);

    }
}
