package com.javarush.task.task16.task1601;

import java.util.concurrent.TransferQueue;

public class testThreads {
    public static void main(String[] args) throws InterruptedException{
        FirstTestThread firstTestThread = new FirstTestThread();
        Thread thread = new Thread(firstTestThread);
        SecondTestThread secondTestThread = new SecondTestThread();
        thread.start();
        Thread.sleep(2000);
        System.out.println("waiting!");
        thread.join(); // second Thread will start then first will finish work
        System.out.println("waiting!!!");
        Thread.sleep(1000);
        secondTestThread.start();
        System.out.println("a!");

    }

    public static class FirstTestThread implements Runnable{
        @Override
        public void run() {
            System.out.println("First Thread Started");
            for (int i = 0; i < 10; i++){
                System.out.println(i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("First Thread finished");
        }
    }

    public static class SecondTestThread extends Thread{
        public void start(){
            System.out.println("Second thread started");
            for (int i = 0; i < 10; i++){
                System.out.println("Second Tread working " + i);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
