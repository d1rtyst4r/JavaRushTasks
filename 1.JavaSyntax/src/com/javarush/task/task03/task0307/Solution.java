package com.javarush.task.task03.task0307;

/* 
Привет Starcraft!
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 12; i++){
            if (i < 10){
                Zerg zerg = new Zerg();
                zerg.name = "zerg" + i;
            }

            if (i < 5){
                Protoss protoss = new Protoss();
                protoss.name = "protoss" + i;
            }

            if ( i < 12){
                Terran terran = new Terran();
                terran.name = "terran" + i;
            }

        }
    }

    public static class Zerg {
        public String name;
    }

    public static class Protoss {
        public String name;
    }

    public static class Terran {
        public String name;
    }
}
