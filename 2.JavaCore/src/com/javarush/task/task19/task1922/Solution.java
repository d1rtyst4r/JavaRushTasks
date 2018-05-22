package com.javarush.task.task19.task1922;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Ищем нужные строки
Считать с консоли имя файла.
Вывести в консоль все строки из файла, которые содержат всего 2 слова из списка words.
Закрыть потоки.

Пример:
words содержит слова А, Б, В

Строки:
В Б А Д //3 слова из words, не подходит
А Б А Д //3 слова из words, не подходит
Д А Д //1 слово из words, не подходит
Д А Б Д //2 слова - подходит, выводим
Д А А Д //2 слова - подходит, выводим


Требования:
1. Класс Solution должен содержать публичное статическое поле words типа List, которое должно быть сразу проинициализировано.
2. Класс Solution должен содержать статический блок, в котором добавляются три или больше слов в список words.
3. Программа должна считывать имя файла с консоли (используй BufferedReader).
4. BufferedReader для считывания данных с консоли должен быть закрыт.
5. Программа должна считывать содержимое файла (используй FileReader).
6. Поток чтения из файла (FileReader) должен быть закрыт.
7. Программа должна выводить в консоль все строки из файла, которые содержат всего 2 слова из списка words.
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) throws IOException {
        String fileName = getFileName();
        ArrayList<String> allStringsFromFile = getStringsFromFile(fileName);
        printStringWithTwoWordsFromList(words, allStringsFromFile);

    }

    private static String getFileName() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fName = reader.readLine();
        reader.close();
        return fName;
    }

    // return how many words from list has string
    private static int countHowManyWordsInStringFromList(List<String> words, String strings){
        int count = 0;
        for (String string :strings.split(" ")){
            if (wordInArrayWords(words, string)){
                count++;
            }
        }
        return count;
    }

    // return true if word is in list
    public static boolean wordInArrayWords(List<String> strings, String word){
        boolean isInList = false;
        for (String string : strings){
            if (string.equals(word)){
                isInList = true;
                break;
            }
        }
        return isInList;
    }

    // save all strings from file to ArrayLsit
    private static ArrayList<String> getStringsFromFile(String fileName) throws IOException {
        ArrayList<String> result = new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));
        while (bufferedReader.ready()){
            result.add(bufferedReader.readLine());
        }
        bufferedReader.close();
        return result;
    }

    // print only string with 2 words from List
    private static void printStringWithTwoWordsFromList(List<String> words, ArrayList<String> strings){
        for (String string : strings){
            if (countHowManyWordsInStringFromList(words, string) == 2){
                System.out.println(string);
            }
        }
    }

}
