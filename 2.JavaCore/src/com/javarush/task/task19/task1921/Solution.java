package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        String fileName = args[0];
        ArrayList<String> allLines = getAllLinesInFile(fileName);

        for (String line : allLines){
            PEOPLE.add(new Person(getName(line.split(" ")), getDate(line.split(" "))));
        }
    }

    private static ArrayList<String> getAllLinesInFile(String fName) throws IOException {
        ArrayList<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(fName));
        while (reader.ready()){
            lines.add(reader.readLine()); // add all lines from file in array list
        }
        reader.close();
        return lines;
    }

    private static boolean isInteger(String line){ // check is this word integer or not
        boolean isInt = true;
        try {
            Integer.parseInt(line);
        }catch (NumberFormatException e){
            isInt = false;
        }
        return isInt;
    }

    private static String getName(String[] line){ // I know this solution is't very nice =( but its work
        String name = "";
        StringBuilder stringBuilder = new StringBuilder();
        for (String word :line){
            if (!isInteger(word)){
                stringBuilder.append(word + " "); // get all words from line and add space between them
            }
        }
        char[] temp = stringBuilder.toString().toCharArray(); //this part delete last space in string
        StringBuilder st = new StringBuilder();
        for (int i = 0; i < temp.length; i++){
            if (i != temp.length-1){
                st.append(temp[i]);
            }
        }
        name = st.toString();
        return name;
    }

    private static Date getDate(String[] line) throws ParseException { // return date from line
        StringBuilder stringBuilder = new StringBuilder();
        String pattern = "dd.MM.yyyy.";
        for (String word : line) {
            if (isInteger(word)) {
                stringBuilder.append(word+".");
            }
        }
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        Date date = simpleDateFormat.parse(stringBuilder.toString());
        return date;
    }
}
