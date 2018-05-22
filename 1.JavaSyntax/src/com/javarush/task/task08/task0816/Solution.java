package com.javarush.task.task08.task0816;

import java.util.*;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Putin", new Date("AUGUST 1 1985"));
        map.put("Ruslan", new Date("SEPTEMBER 13 1986"));
        map.put("Vasj", new Date("OCTOBER 12 1990"));
        map.put("Andrej", new Date("JANUARY 15 1989"));

        //напишите тут ваш код
        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            HashMap.Entry<String, Date> pair = iterator.next();
            String name = pair.getKey();
            Date date = pair.getValue();
            if (date.getMonth() > 4 && date.getMonth() < 8){
                iterator.remove();
            }
        }

    }

    public static void printMap(HashMap<String, Date> map){
        for (HashMap.Entry<String, Date> human : map.entrySet()){
            String name = human.getKey();
            Date dateOfBirth = human.getValue();

            System.out.println(name + " " + dateOfBirth);
        }
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 1;
        for (HashMap.Entry<String, String> pair : map.entrySet()) {
            String firstname = pair.getValue();

            if (firstname.equals(name)) {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        HashMap<String, Date> map = createMap();
        //printMap(map);
        //System.out.println(" ");
        removeAllSummerPeople(map);
        printMap(map);

    }
}
