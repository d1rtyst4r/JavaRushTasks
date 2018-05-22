package com.javarush.task.task14.task1421;

public class test {

    public static void print(Object o){
        System.out.println(o);
    }

    public static void print(String s){
        System.out.println(s);
        System.out.print("this");
    }

    public static void main(String[] args){
        test.print(1);
        test.print(null);
    }
}
