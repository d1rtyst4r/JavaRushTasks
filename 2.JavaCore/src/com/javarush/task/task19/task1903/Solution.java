package com.javarush.task.task19.task1903;

/* 
Адаптация нескольких интерфейсов
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();
    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private IncomeData data; // save data from IncomeData

        IncomeDataAdapter(IncomeData incomeData){ // constructor
            this.data = incomeData;
        }

        @Override
        public String getCompanyName() { //adapter
            return data.getCompany(); //return company name from IncomeData
        }

        @Override
        public String getCountryName() { // using IncomeDate return country name from Map countries
            String countryCode = data.getCountryCode();
            String countryToReturn ="";
            for (Map.Entry<String, String> country: countries.entrySet()){
                if (country.getKey().equals(countryCode)){
                    countryToReturn =  country.getValue();
                }
            }
            return countryToReturn;
        }

        @Override
        public String getName() { // return FullName ( LastName + , FirstName)
            String name = data.getContactLastName() + ", " + data.getContactFirstName();
            return name;
        }

        @Override
        public String getPhoneNumber() { // return
            String phone = String.valueOf(data.getPhoneNumber());

            char[] text = phone.toCharArray();
            ArrayList<Character> characters = new ArrayList<>();
            for (char c : text){
                characters.add(c);
            }
            if (characters.size() < 10) {
                while (characters.size() < 10) {
                    characters.add(0, '0');
                }
            }
            String phoneToRetun = "+" + data.getCountryPhoneCode() + "(" + characters.get(0) + characters.get(1) +
                    characters.get(2) + ")" + characters.get(3) + characters.get(4) + characters.get(5) + "-" +
                    characters.get(6) + characters.get(7) + "-" + characters.get(8) + characters.get(9);
            return phoneToRetun;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //example UA

        String getCompany();            //example JavaRush Ltd.

        String getContactFirstName();   //example Ivan

        String getContactLastName();    //example Ivanov

        int getCountryPhoneCode();      //example 38

        int getPhoneNumber();           //example 501234567
    }

    public static interface Customer {
        String getCompanyName();        //example JavaRush Ltd.

        String getCountryName();        //example Ukraine
    }

    public static interface Contact {
        String getName();               //example Ivanov, Ivan

        String getPhoneNumber();        //example +38(050)123-45-67
    }
}