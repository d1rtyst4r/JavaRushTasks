package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human granddad1 = new Human("Дед1", true, 65);
        Human granddad2 = new Human("Дед2", true, 64);
        Human grandmother1 = new Human("Бабка1", false, 60);
        Human grandmother2 = new Human("Бабка2", false, 61);
        Human father = new Human("Отец", true, 45, granddad1, grandmother1);
        Human mother = new Human("Мать", false, 40, granddad2, grandmother2);
        Human son1 = new Human("Сын1", true, 20, father, mother);
        Human son2 = new Human("Сын2", true, 18, father, mother);
        Human son3 = new Human("Сын3", true, 16, father, mother);

        System.out.println(granddad1);
        System.out.println(granddad2);
        System.out.println(grandmother1);
        System.out.println(grandmother2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(son3);

    }
        public static class Human {
            //напишите тут ваш код
            private String name;
            private boolean sex;
            private int age;
            private Human father;
            private Human mother;

            public Human(String name, boolean sex, int age, Human father, Human mother) {
                this.name = name;
                this.sex = sex;
                this.age = age;
                this.father = father;
                this.mother = mother;
            }

            public Human(String name, boolean sex, int age) {
                this.name = name;
                this.sex = sex;
                this.age = age;
            }

            public String toString() {
                String text = "";
                text += "Имя: " + this.name;
                text += ", пол: " + (this.sex ? "мужской" : "женский");
                text += ", возраст: " + this.age;

                if (this.father != null)
                    text += ", отец: " + this.father.name;

                if (this.mother != null)
                    text += ", мать: " + this.mother.name;

                return text;
            }
        }
    }






















