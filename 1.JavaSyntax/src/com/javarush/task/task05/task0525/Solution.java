package com.javarush.task.task05.task0525;

/* 
И целой утки мало
*/

public class Solution {

    public static void main(String[] args) {
        Duck duck1 = new Duck();
        Duck duck2 = new Duck();
        System.out.println(duck1);
        System.out.println(duck2);

        Cat cat1 = new Cat();
        System.out.println(cat1);

        Dog dog1 = new Dog();
        System.out.println(dog1);

        //напишите тут ваш код
    }

    public static class Duck {
        public String toString() {
            return "Duck";
        }
    }

    public static class Cat {
        @Override
        public String toString() {
            return "Cat";
        }
    }

    public static class Dog{
        @Override
        public String toString() {
            return "Dog";
        }
    }

    //напишите тут ваш код
}
