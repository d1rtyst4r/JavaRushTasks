package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> humans = new HashMap<>();
        humans.put("Vasja", 600);
        humans.put("Vitalik", 600);
        humans.put("Ruslan", 500);
        humans.put("Petja", 501);
        humans.put("Kolja", 1600);
        humans.put("Zina", 900);
        humans.put("Zoja", 600);
        humans.put("Andrej", 1000);
        humans.put("Oleg", 400);
        humans.put("Jefgenij", 600);

        return humans;
    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        HashMap<String, Integer> copy = new HashMap<>(map);
        Integer boder = 500;

        for (HashMap.Entry<String, Integer> human : copy.entrySet()){
            if (human.getValue() < boder){
                map.remove(human.getKey());
            }
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> people = createMap();
        removeItemFromMap(people);
    }
}