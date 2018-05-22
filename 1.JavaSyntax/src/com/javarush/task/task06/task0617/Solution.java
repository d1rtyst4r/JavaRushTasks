package com.javarush.task.task06.task0617;

/* 
Блокнот для новых идей
*/

public class Solution {
    public static void printIdea(Idea idea){
        System.out.println(idea.getDescriprion());
    }
    public static void main(String[] args) {
        printIdea(new Idea());
    }
    //напишите тут ваш код

    public static class Idea {
        public static String getDescriprion(){
            return "Text";
        }
    }
}
