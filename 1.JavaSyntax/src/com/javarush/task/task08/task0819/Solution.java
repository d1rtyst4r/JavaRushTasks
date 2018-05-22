package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;

/* 
Set из котов
*/

public class Solution {

    public static class Cat {

    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        cats.remove(cats.toArray()[0]);
        //напишите тут ваш код. step 3 - пункт 3

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> catsSet = new HashSet<>();
        for (int i = 0; i < 3; i++) {
            catsSet.add(new Cat());
        }
        return catsSet;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        for (Cat cat : cats) {
            System.out.println(cat);
        }

        // step 1 - пункт 1
    }
}
