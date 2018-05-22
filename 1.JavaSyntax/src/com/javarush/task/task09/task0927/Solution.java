package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> cats = new HashMap<>();
        Cat cat1 = new Cat("Murzik");
        Cat cat2 = new Cat("Vasjka");
        Cat cat3 = new Cat("Busjka");
        Cat cat4 = new Cat("Masja");
        Cat cat5 = new Cat("Anton");
        Cat cat6 = new Cat("Zina");
        Cat cat7 = new Cat("Zhuza");
        Cat cat8 = new Cat("Barsik");
        Cat cat9 = new Cat("Sharik");
        Cat cat10 = new Cat("Rizik");

        cats.put(cat1.name, cat1);
        cats.put(cat2.name, cat2);
        cats.put(cat3.name, cat3);
        cats.put(cat4.name, cat4);
        cats.put(cat5.name, cat5);
        cats.put(cat6.name, cat6);
        cats.put(cat7.name, cat7);
        cats.put(cat8.name, cat8);
        cats.put(cat9.name, cat9);
        cats.put(cat10.name, cat10);

        return cats;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        HashSet<Cat> catHashSet = new HashSet<>();
        for (HashMap.Entry<String, Cat> catsMap: map.entrySet()){
            catHashSet.add(catsMap.getValue());
        }
        return catHashSet;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }


}
