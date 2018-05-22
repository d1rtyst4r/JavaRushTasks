package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
        DateFormat dateFormatPrt = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

        String name = "";
        String sex = "";
        String bd = "";
        String id = "";


        //checking pattern
        switch (args[0]) {

            //first pattern create all persons in args[]
            case "-c": {
                synchronized (allPeople) {
                    for (int i = 3; i <= (args.length); i += 3) {
                        for (int j = i - 2; j <= i; j += 3) {
                            name = args[j];
                            sex = args[j + 1];
                            bd = args[j + 2];
                        }
                        createPerson(name, sex, bd, dateFormat);
                    }
                }
            } break;

            // update all persons in args[]
            case "-u" : {
                synchronized (allPeople) {
                    for (int i = 4; i <= (args.length); i += 4) {
                        for (int j = i - 3; j <= i; j += 4) {
                            id = args[j];
                            name = args[j + 1];
                            sex = args[j + 2];
                            bd = args[j + 3];
                        }
                        updatePerson(id, name, sex, bd, dateFormat);
                    }
                }
            }break;

            // remove all information about persons in args[]
            case "-d" : {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        id = args[i];
                        removePerson(id);
                    }
                }
            } break;

            // print information about persons in args{}
            case "-i" : {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        id = args[i];
                        printInformationAboutPersone(id, dateFormatPrt);
                    }
                }
            }break;
        }
    }

    //add new person to allPeopleList
    public static void createPerson(String namePersone, String sexPerson, String birthdayPerson, DateFormat df){
        Date date = null;
        try {
            date = df.parse(birthdayPerson);
        } catch (ParseException e) {
            e.getMessage();
        }

        //check sex for person
        if (sexPerson.equals("м")) {
            Person person = Person.createMale(namePersone, date);
            allPeople.add(person);
            //print person index if it's male
            System.out.println(allPeople.indexOf(person));
        } else {
            Person person = Person.createFemale(namePersone, date);
            allPeople.add(person);
            ///print person index if it's male
            System.out.println(allPeople.indexOf(person));
        }

    }
    // update information about person
    public static void updatePerson(String personId, String personName, String personSex, String personBD, DateFormat df){
        int index = Integer.parseInt(personId);
        Person person = allPeople.get(index);

        //update name
        person.setName(personName);

        //udate date
        Date date = null;
        try {
            date = df.parse(personBD);
        } catch (ParseException e) {
            e.getMessage();
        }
        person.setBirthDay(date);

        //update sex
        if (personSex.equals("м"))
            person.setSex(Sex.MALE);
        else
            person.setSex(Sex.FEMALE);
    }
    //remove information about person
    public static void removePerson(String personId){
        int index = Integer.parseInt(personId);
        Person person = allPeople.get(index);
        person.setName(null);
        person.setSex(null);
        person.setBirthDay(null);

    }
    //print information about person
    public static void printInformationAboutPersone(String personId, DateFormat df){
        int index = Integer.parseInt(personId);
        Person person = allPeople.get(index);
        StringBuffer s = new StringBuffer();
        s.append(person.getName());
        s.append(" ");
        s.append(person.getSex() == Sex.MALE ? "м" : "ж");
        s.append(" ");
        s.append(df.format(person.getBirthDay()));
        System.out.println(s);
    }
}