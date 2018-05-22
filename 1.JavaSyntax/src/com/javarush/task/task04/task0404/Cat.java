package com.javarush.task.task04.task0404;

/* 
Реализовать метод addNewCat
*/

public class Cat {
    private static int catsCount = 0;

    public static void addNewCat() {
        //напишите тут ваш код
        catsCount +=1;
    }
    public static void printCats(){
        System.out.println(catsCount);
    }

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.addNewCat();
        cat.addNewCat();
        cat.printCats();
    }
}
