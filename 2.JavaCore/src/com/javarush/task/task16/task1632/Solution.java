package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new FirstThread());
        threads.add(new SecondThread());
        threads.add(new ThirdThread());
        threads.add(new ForthThread());
        threads.add(new FifthThread());
    }

    public static void main(String[] args) {
    }


    //firstthreads
    public static class FirstThread extends Thread {
        @Override
        public void run() {
            while (true) {

            }
        }
    }

    public static class SecondThread extends Thread {

        public void run() {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class ThirdThread extends Thread {

        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }

        }
    }

    public static class ForthThread extends Thread implements Message {

        public void run() {
            while (!isInterrupted()){

            }

        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class FifthThread extends Thread {

        public void run() {
            int sum = 0;
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            while (true) {
                try {
                    String text = reader.readLine();
                    if (text.equals("N")) {
                        break;
                    } else {
                        sum += Integer.parseInt(text);
                    }
                } catch (IOException e) {
                }
            }
            System.out.println(sum);
        }
    }
}