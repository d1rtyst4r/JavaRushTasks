package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        HashSet<Long> byets = new HashSet<>();
        ArrayList<Long> allBytesInFile = new ArrayList<>();
        long maxrerepeats = 0;
        HashMap<Long, Long> bytesAndReapets = new HashMap<>();

        //get file name from console
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        //read file
        FileInputStream fileInputStream = new FileInputStream(fileName);
        while (fileInputStream.available() > 0){
            long data = fileInputStream.read();
            byets.add(data); //add unique byte to set
            allBytesInFile.add(data); //add all bytes to arrayList
        }
        fileInputStream.close(); //close stream


        //count repeats in arrayList
        for (long byteInSet : byets){
            long repeat = 1;
            for (int i = 0; i < allBytesInFile.size(); i++){
                if (byteInSet == allBytesInFile.get(i)){
                    repeat++;
                }
            }
            if (repeat > maxrerepeats){
                maxrerepeats = repeat;
            }
            bytesAndReapets.put(byteInSet, repeat); //put unique byte and it value of repeats to map
        }

        for (HashMap.Entry<Long, Long> hasmap : bytesAndReapets.entrySet()){
            if (hasmap.getValue() == maxrerepeats){
                System.out.print( hasmap.getKey() + " "); // print bytes with max repeats to console
            }
        }
    }
}
