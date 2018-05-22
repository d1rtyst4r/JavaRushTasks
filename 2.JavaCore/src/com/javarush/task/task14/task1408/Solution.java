package com.javarush.task.task14.task1408;

/* 
Куриная фабрика
*/

public class Solution {
    public static void main(String[] args) {
        Hen hen = HenFactory.getHen(Country.UKRAINE);
        hen.getCountOfEggsPerMonth();
        hen.getDescription();
    }

    static class HenFactory {

        //getHen() return relevant hen for her country
        static Hen getHen(String country) {
            Hen hen = null;
            if (country.equals(Country.BELARUS)){
                hen =  new BelarusianHen();
            }
            else if (country.equals(Country.RUSSIA)){
                hen =  new RussianHen();
            }
            else if (country.equals(Country.UKRAINE)){
                hen =  new UkrainianHen();
            }
            else if (country.equals(Country.MOLDOVA)){
                hen =  new MoldovanHen();
            }
            //напишите тут ваш код
            return hen;
        }
    }

    /*
        In all 4 classes realize getCountOfEggsPerMonth() and getDescription()
        getDescription return super.class + Моя страна - country. Я несу eggsPerMonth яиц в месяц."
     */




}
