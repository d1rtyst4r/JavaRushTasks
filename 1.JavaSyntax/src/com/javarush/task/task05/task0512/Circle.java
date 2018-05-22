package com.javarush.task.task05.task0512;

/* 
Создать класс Circle
*/

public class Circle {
    //напишите тут ваш код
    private int centreX;
    private int centreY;
    private int radius;
    private int width;
    private int color;

    public void initialize(int centreX, int centreY, int radius){
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = radius;
    }

    public void initialize(int centreX, int centreY, int radius,int width){
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = radius;
        this.width = width;
    }

    public void initialize(int centreX, int centreY, int radius, int width, int color){
        this.centreX = centreX;
        this.centreY = centreY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }

    public static void main(String[] args) {

    }
}
