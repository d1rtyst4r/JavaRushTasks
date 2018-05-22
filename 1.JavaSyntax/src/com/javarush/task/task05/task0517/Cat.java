package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    //напишите тут ваш код
    private String name = null;
    private int age;
    private int weight;
    private String address = null;
    private String color;

    public Cat(String name){
        this.name = name;
        this.age = 5;
        this.weight = 10;
        this.color = "red";
        this.address = null;
    }
    public Cat(String name, int weight, int age){
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.color = "red";
        this.address = null;
    }
    public Cat(String name, int age){
        this.name = name;
        this.age = age;
        this.weight = 7;
        this.address = null;
        this.color = "red";
    }
    public Cat(int weight, String color){
        this.name = null;
        this.age = 7;
        this.weight = weight;
        this.address = null;
        this.color = color;
    }
    public Cat(int weight, String color, String address){
        this.name = null;
        this.age = 5;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
