package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String granddadNamme = reader.readLine();
        Cat catGrandDad = new Cat(granddadNamme);

        String grandmatherName = reader.readLine();
        Cat catGrandMather = new Cat(grandmatherName);

        String motherName = reader.readLine();
        Cat catMother = new Cat(motherName, catGrandMather, catGrandDad);

        String fatherName = reader.readLine();
        Cat catFather = new Cat(fatherName);

        String sonName = reader.readLine();
        Cat catSon = new Cat(sonName, catMother, catFather);

        String daughterName = reader.readLine();
        Cat catDaughter = new Cat(daughterName, catMother, catFather);

        System.out.println(catGrandDad);
        System.out.println(catGrandMather);
        System.out.println(catMother);
        System.out.println(catFather);
        System.out.println(catSon);
        System.out.println(catDaughter);
    }

    public static class Cat {
        private String name;
        private Cat mother;
        private Cat father;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat mother) {
            this.name = name;
            this.mother = mother;
        }
        Cat(String name, Cat mother, Cat father){
            this.name = name;
            this.mother = mother;
            this.father = father;
        }

        @Override
        public String toString() {
            if (mother == null && father != null) {
                return "Cat name is " + name + ", no mother, father name is " + father;
            }
            else if (mother == null && father == null){
                return "Cat name is " + name + ", no mother, no father";
            }
            else if (father == null && mother != null){
                return "Cat name is " + name + ", mother is " + mother.name + ", no father";
            }
            else return "Cat name is " + name + ", mother is " + mother.name + ", father is " + father.name;
        }
    }

}
