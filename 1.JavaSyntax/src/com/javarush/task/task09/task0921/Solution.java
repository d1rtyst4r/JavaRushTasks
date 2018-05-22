package com.javarush.task.task09.task0921;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.spi.NumberFormatProvider;
import java.util.ArrayList;
import java.util.List;

/* 
Метод в try..catch
*/

public class Solution {
    public static void main(String[] args) {
        readData();
    }

    public static void readData(){
        //напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<>();
        try{

            while (true) {
                int c = Integer.parseInt(reader.readLine());
                list.add(c);
            }
        }
        catch (NumberFormatException e){
            for (Integer integer : list) System.out.println(integer);
        }
        catch (IOException e ){

        }
    }
}
