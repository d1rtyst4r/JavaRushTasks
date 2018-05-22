package com.javarush.task.task14.task1419;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();
        arrayIndexOutOfBoundsException();
        fileNotFound();
        indexOutOfBoundsException();
        numberFormatException();
        negativeArraySizeException();
        stringIndexOutOfBoundsException();
        nullPoint();
        classCastException();
        arrayStoreException();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        //напишите тут ваш код

    }
    private static void arrayIndexOutOfBoundsException(){
        int[] a = new int[2];
        try {
            for (int i = 0; i <= a.length; i++){
                int b = a[i];
            }
        } catch (Exception e ){
            exceptions.add(e);
        }
    }
    private static void fileNotFound(){
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream("sdff")));
        } catch (Exception e){
            exceptions.add(e);
        }
    }
    private static void indexOutOfBoundsException(){
        try {
            ArrayList<Integer> arrayList = new ArrayList<>();
            arrayList.add(1);
            arrayList.add(2);
            for (int i = 0; i <= 3; i++) {
                Integer b = arrayList.get(i);
            }
        } catch (Exception e){
            exceptions.add(e);
        }
    }
    private static void numberFormatException(){
        String s = "asdasd";
        try {
            int b = Integer.parseInt(s);
        }catch (Exception e){
            exceptions.add(e);
        }
    }

    private static void negativeArraySizeException(){
        try{
            int b = -1;
            int[] a = new int[b];
        }catch (Exception e){
            exceptions.add(e);
        }
    }


    public static void stringIndexOutOfBoundsException(){
        String s = "s";
        try{
            char c = s.charAt(2);
        }catch (Exception e){
            exceptions.add(e);
        }
    }
    public static void nullPoint() {
        String a = null;
        try {
            a.trim();
        } catch (Exception e) {
            exceptions.add(e);
        }
    }

        public static void classCastException(){
            try {
                Object x = new Integer(0);
                System.out.print((String)x);
            }catch (Exception e){
                exceptions.add(e);
            }
        }
        public static void arrayStoreException(){
            Object[] str = new String[5];
            try {
                str[2] = new Integer(500);
            }catch (Exception e){
                exceptions.add(e);
            }
        }
    }
