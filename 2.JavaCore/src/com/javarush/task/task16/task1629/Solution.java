package com.javarush.task.task16.task1629;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Solution {
    public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws InterruptedException {
        Read3Strings t1 = new Read3Strings();
        Read3Strings t2 = new Read3Strings();
        t1.start();
        t1.join();
        t2.start();
        t2.join();

        //add your code here - добавьте код тут

        t1.printResult();
        t2.printResult();
    }

    //add your code here - добавьте код тут
    public static class Read3Strings extends Thread{
        int reapet = 3;
        ArrayList<String> strings = new ArrayList<>();
        public void run(){
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            while (reapet != 0){
                try {
                    strings.add(reader.readLine());
                } catch (IOException e) {
                }
                reapet--;
            }

        }
        public void printResult(){
            for (String str : strings){
                System.out.print(str + " ");
            }
            System.out.println();
        }
    }
}
