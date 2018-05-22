package com.javarush.task.task10.task1013;

/* 
Конструкторы класса Human
*/

public class Solution {
    public static void main(String[] args) {
    }

    public static class Human {
        // напишите тут ваши переменные и конструкторы
        private String name;
        private String lastname;
        private int age;
        private boolean sex;
        private double weight;
        private byte amountOfChildren;

        public Human(String name, String lastname, int age, boolean sex, double weight, byte amountOfChildren){
            this.name = name;
            this.lastname = lastname;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.amountOfChildren = amountOfChildren;
        }

        public Human(String name, String lastname, int age, boolean sex, double weight){
            this.name = name;
            this.lastname = lastname;
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }

        public Human(String name, String lastname, int age, boolean sex, byte amountOfChildren){
            this.name = name;
            this.lastname = lastname;
            this.age = age;
            this.sex = sex;
            this.amountOfChildren = amountOfChildren;
        }
        public Human(String name, String lastname, boolean sex, double weight, byte amountOfChildren){
            this.name = name;
            this.lastname = lastname;
            this.sex = sex;
            this.weight = weight;
            this.amountOfChildren = amountOfChildren;
        }
        public Human(String name, String lastname){
            this.name = name;
            this.lastname = lastname;

        }
        public Human(String name, String lastname, boolean sex, byte amountOfChildren){
            this.name = name;
            this.lastname = lastname;
            this.sex = sex;
            this.amountOfChildren = amountOfChildren;
        }
        public Human(String name, String lastname, int age){
            this.name = name;
            this.lastname = lastname;
            this.age = age;
        }
        public Human(String name, String lastname, int age, boolean sex){
            this.name = name;
            this.lastname = lastname;
            this.age = age;
        }
        public Human(String name, int age, boolean sex, double weight){
            this.name = name;
            this.lastname = "Dow";
            this.age = age;
            this.sex = sex;
            this.weight = weight;
        }
        public Human(int age, boolean sex, double weight, byte amountOfChildren){
            this.name = "Jon";
            this.lastname = "Dow";
            this.age = age;
            this.sex = sex;
            this.weight = weight;
            this.amountOfChildren = amountOfChildren;
        }

    }

}
