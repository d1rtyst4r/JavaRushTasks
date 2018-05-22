package com.javarush.task.task08.task0821;

import java.util.HashMap;
import java.util.Map;

/* 
Однофамильцы и тёзки
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> map = createPeopleList();
        printPeopleList(map);
    }

    public static Map<String, String> createPeopleList() {
        //напишите тут ваш код
        Map<String, String> temp = new HashMap<>();
        temp.put("Jas", "Rus");
        temp.put("Jas", "And");
        temp.put("Jas", "Rit");
        temp.put("Jef", "And");
        temp.put("Dud", "Avb");
        temp.put("Afa", "Vit");
        temp.put("Ide", "Vit");
        temp.put("Kuz", "Ole");
        temp.put("LIe", "Art");
        temp.put("Zyk", "Ale");

        return temp;
    }

    public static void printPeopleList(Map<String, String> map) {
        for (Map.Entry<String, String> s : map.entrySet()) {
            System.out.println(s.getKey() + " " + s.getValue());
        }
    }
}
