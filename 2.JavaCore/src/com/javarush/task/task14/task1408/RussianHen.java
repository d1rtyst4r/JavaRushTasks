package com.javarush.task.task14.task1408;
// create class RussianHen extends Hen
class RussianHen extends Hen {

    @Override
    public int getCountOfEggsPerMonth() {
        return 50;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " Моя страна - "+ Country.RUSSIA+". Я несу "+getCountOfEggsPerMonth() +" яиц в месяц.";}
}


