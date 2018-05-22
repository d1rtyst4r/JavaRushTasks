package com.javarush.task.task17.task1710Alternative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
!!!!! Attention !!!!!
!!!THIS IS INCORRECT SOLUTION!!! for com.javarush.task.task17.task1710 !!!!
it work with STRING from console as command
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        String command = readLine();
        String[] commands = commandsInArray(command);
        crUD(commands);

    }
    // get command from console
    public static String readLine(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String line = reader.readLine();
            return line;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    // convert command to array
    public static String[] commandsInArray(String com){
        try {
            String[] commands = com.split(" ");
            return commands;
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }

    //read first key and make decision what to do
    public static void crUD (String[] commandsToDo){
        if (commandsToDo[0].equals("-c")){
            try {
                createUser(commandsToDo, allPeople);
            } catch (Exception e){
                e.printStackTrace();
            }
        }
        else  if (commandsToDo[0].equals("-d")){
            deleteUser(commandsToDo, allPeople);
        }
        else if (commandsToDo[0].equals("-u")){
            updateUser(commandsToDo, allPeople);
        }
        else if (commandsToDo[0].equals("-i")){
            getInformationAboutUser(commandsToDo, allPeople);
        }
    }

    // create new person to list
    public static void createUser(String[] com, List<Person> allPeople){
        String name = com[1];
        String sex = com[2];
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMM/yyyy" ,Locale.ENGLISH);
        try {
            date = simpleDateFormat.parse(com[3]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        if (sex.equals("м")){
            Person newPersone = Person.createMale(name, date);{
            }
            allPeople.add(newPersone);
        }
        else if (sex.equals("ж")){
            Person newPersone = Person.createFemale(name, date);
            allPeople.add(newPersone);
        }
    }

    // delete all information about person using his(her) id
    public static void deleteUser(String[] com, List<Person> allPeople){
        int id = Integer.parseInt(com[1]);

        allPeople.get(id).setName(null);
        allPeople.get(id).setBirthDay(null);
        allPeople.get(id).setSex(null);
        }

    // print all information about about person
    public static void getInformationAboutUser(String[] com, List<Person> allPeople){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMM/yyyy" ,Locale.ENGLISH);
        int id = Integer.parseInt(com[1]);
        String resoult = allPeople.get(id).getName();
        if (allPeople.get(id).getSex().equals(Sex.FEMALE)){
            resoult += " ж";
        }
        else resoult += " м ";
        resoult += simpleDateFormat.format(allPeople.get(id).getBirthDay());
        System.out.println(resoult);
    }

    //update information about user
    public static void updateUser(String[] com, List<Person> allPeople){
        String name = com[2];
        String sex = com[3];
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MMM/yyyy" ,Locale.ENGLISH);
        try {
            date = simpleDateFormat.parse(com[4]);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        int id = Integer.parseInt(com[1]);

        if (sex.equals("м")){
            allPeople.get(id).setSex(Sex.MALE);
        }
        else {
            allPeople.get(id).setSex(Sex.FEMALE);
        }
        allPeople.get(id).setBirthDay(date);
        allPeople.get(id).setName(name);
    }
}
