package com.javarush.task.task04.task0405;

/* 
Реализовать метод setCatsCount
*/

public class Cat {
    private static int catsCount = 0;

    public static void setCatsCount(int catsCount) {
        //напишите тут ваш код
        Cat.catsCount =catsCount;
    }
    public static void printCatsCount(){
        System.out.println(catsCount);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        printCatsCount();
        setCatsCount(5);
        printCatsCount();
    }
}