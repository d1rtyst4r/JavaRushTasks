package com.javarush.task.task07.task0707;

import java.util.ArrayList;

/* 
Что за список такой?
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<String> strings = new ArrayList<String>();
        strings.add("abc");
        strings.add("acb");
        strings.add("bac");
        strings.add("bca");
        strings.add("cab");
        System.out.println(strings.size());

        for (String string : strings) {
            System.out.println(string);
        }
    }
}
