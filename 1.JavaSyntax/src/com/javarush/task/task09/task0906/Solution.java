package com.javarush.task.task09.task0906;

/* 
Логирование стек трейса
*/

public class Solution {
    public static void main(String[] args) {
        log("In main method");
    }

    public static void log(String s) {
        //напишите тут ваш код
        String message = null;
        StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
           message =  stackTraceElements[2].getClassName() +  ": " + stackTraceElements[2].getMethodName();
        System.out.println(message +": " + s);
    }
}
