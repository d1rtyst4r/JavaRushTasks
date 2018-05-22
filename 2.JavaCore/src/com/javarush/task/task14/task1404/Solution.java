package com.javarush.task.task14.task1404;

/* 
Коты
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код

        ArrayList<Cat> catsArrayList = new ArrayList<>();
        while (true){
            //enter cats name from console
            String catName = catsName();
            if (catName.isEmpty()){ //while empty string
                break;
            }
            else {
                //add cats to ArrayListOfCats
                addNewCatToArrayList(catsArrayList, catName);
            }
        }

        //print cats name to console
        printCatsToConsole(catsArrayList);



    }

    static class CatFactory {
        static Cat getCatByKey(String key) {
            Cat cat = null;
            if ("vaska".equals(key)) {
                cat = new MaleCat("Василий");
            } else if ("murka".equals(key)) {
                cat = new FemaleCat("Мурочка");
            } else if ("kiska".equals(key)) {
                cat = new FemaleCat("Кисюлька");
            } else {
                cat = new Cat(key);
            }
            return cat;
        }
    }

    static class Cat {
        private String name;

        protected Cat(String name) {
            this.name = name;
        }

        public String getName() {
            return this.name;
        }

        public String toString() {
            return "Я уличный кот " + getName();
        }
    }

    static class MaleCat extends Cat {
        MaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - солидный кошак по имени " + getName();
        }
    }

    static class FemaleCat extends Cat {
        FemaleCat(String name) {
            super(name);
        }

        public String toString() {
            return "Я - милая кошечка по имени " + getName();
        }
    }

    //get catsName from console
    public static String catsName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String catName = reader.readLine();
        return catName;
    }

    //add cat to ArrayLists<Cat>
    public static void addNewCatToArrayList (ArrayList<Cat> catArrayList, String catsName){
        catArrayList.add(CatFactory.getCatByKey(catsName)); //using CatFactory to get what kind of cat create
    }
    //print cats Name to console
    public static void printCatsToConsole (ArrayList<Cat> catsArrayList){
        for (Cat cat : catsArrayList){
            System.out.println(cat);
        }
    }
}
