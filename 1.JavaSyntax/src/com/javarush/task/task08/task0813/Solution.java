package com.javarush.task.task08.task0813;

import java.util.Set;
import java.util.HashSet;

/* 
20 слов на букву «Л»
*/

public class Solution {
    public static Set<String> createSet() {
        //напишите тут ваш код
        HashSet<String> strings = new HashSet<>();
        for (int i = 0; i < 20; i++){
            strings.add("л" + i);
        }
        return strings;
    }

    public static void main(String[] args) {
        Set<String> stringHashSet  = createSet();
    }
}
