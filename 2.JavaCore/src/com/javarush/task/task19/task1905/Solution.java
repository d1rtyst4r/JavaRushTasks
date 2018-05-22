package com.javarush.task.task19.task1905;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Закрепляем адаптер
*/

public class Solution {
    public static Map<String,String> countries = new HashMap<String,String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class DataAdapter implements RowItem {
        private Customer customer;
        private Contact contact;

        public DataAdapter(Customer customer, Contact contact) {
            this.contact = contact;
            this.customer = customer;
        }

        @Override
        public String getCountryCode() { // return counrty code from countries using countryName
            String value = customer.getCountryName();
            String countryToReturn = "";
            for (Map.Entry<String, String> country : countries.entrySet()) {
                if (country.getValue().equals(value)) {
                    countryToReturn = country.getKey();
                }
            }
            return countryToReturn;
        }

        @Override
        public String getCompany() { // return company name
            return customer.getCompanyName();
        }

        @Override
        public String getContactFirstName() { // return first name from full name
            String[] fullnameArray = contact.getName().split(", ");
            return fullnameArray[1];
        }

        @Override
        public String getContactLastName() { // return last name from full name
            String[] fullnameArray = contact.getName().split(", ");
            return fullnameArray[0];
        }

        @Override
        public String getDialString() { // return moderated contact phone number
            char[] number = contact.getPhoneNumber().toCharArray();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("callto://");
            for (char c : number) {
                if ((c != '(') && (c != ')') && (c!='-')) {
                    stringBuilder.append(c);
                }
            }
            return stringBuilder.toString();
        }
    }

    public static interface RowItem {
        String getCountryCode();        //example UA
        String getCompany();            //example JavaRush Ltd.
        String getContactFirstName();   //example Ivan
        String getContactLastName();    //example Ivanov
        String getDialString();         //example callto://+380501234567
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