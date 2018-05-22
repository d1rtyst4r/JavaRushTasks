package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son1 = new Human("Son1", true, 15);
        Human son2 = new Human("Son2", true, 14);
        Human son3 = new Human("Son3", true, 12);

        ArrayList<Human> kids = new ArrayList<>();
        kids.add(son1);
        kids.add(son2);
        kids.add(son3);

        Human mother = new Human("Mother", false, 40, kids);
        Human father = new Human("Father", true, 43, kids);

        Human granddad1 = new Human("Granddad1", true, 65, father);
        Human granddad2 = new Human("Granddad2", true, 65, mother);
        Human grandmother1 = new Human("Grandmother1", true, 65, father);
        Human grandmother2 = new Human("Grandmother2", true, 65, mother);

        ArrayList<Human> family = new ArrayList<>();
        family.add(son1);
        family.add(son2);
        family.add(son3);
        family.add(father);
        family.add(mother);
        family.add(granddad1);
        family.add(granddad2);
        family.add(grandmother1);
        family.add(grandmother2);

        for (Human human : family){
            System.out.println(human);
        }
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age){
            ArrayList<Human> kid = new ArrayList<>();
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = kid;
        }
        Human(String name, boolean sex, int age, ArrayList<Human> children){
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }
        Human(String name, boolean sex, int age, Human human){
            this.name = name;
            this.sex = sex;
            this.age = age;
            ArrayList<Human>  kid = new ArrayList<>();
            kid.add(human);
            this.children = kid;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }

}
