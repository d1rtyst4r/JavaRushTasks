package com.javarush.task.task19.task1904;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException, ParseException {
                String[] data = fileScanner.nextLine().split(" ");
                String lastName = data[0];
                String firstName = data[1];
                String middleName =data[2];
                String strDate = data[3] +  data[4] +  data[5];
                DateFormat df = new SimpleDateFormat("ddMMyyyy");
                Date dateOfBirth = df.parse(strDate);
                Person person = new Person(firstName, middleName, lastName, dateOfBirth);
                return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
