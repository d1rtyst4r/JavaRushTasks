package com.javarush.task.task08.task0814;

import java.io.IOException;
import java.util.*;

/* 
Больше 10? Вы нам не подходите
*/

public class Solution {
    public static HashSet<Integer> createSet() {
        //напишите тут ваш код
        Random rnd = new Random();
        HashSet<Integer> numbersInHashSet = new HashSet<>();
        for (int i = 0; i < 20; i++){
            numbersInHashSet.add(rnd.nextInt(100));
        }
        return numbersInHashSet;
    }

    public static HashSet<Integer> removeAllNumbersMoreThan10(HashSet<Integer> set) {
            for (Iterator<Integer> iterator = set.iterator(); iterator.hasNext();){
                int x = iterator.next();
                if (x > 10){
                    iterator.remove();
                }
            }
            return set;
    }

    public static void main(String[] args){
        HashSet<Integer> integerHashSet = createSet();
        removeAllNumbersMoreThan10(integerHashSet);
    }
}
