package com.neoteric.springbootdocker.hashmaptest;

import java.util.*;

public class StudentTest {
    public static void main(String[] args) {
        Map<String, Integer> student = new HashMap<>();

        student.put("Maths", 65);
        student.put("English", 80);
        student.put("Hindhi", 68);
        student.put("Telugu", 79);

//Retrieve data from Map

        Set<Map.Entry<String, Integer>> entrySet = student.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entrySet.iterator();

//  if (iterator.hasNext()){
//
//  }
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entryMap = iterator.next();
            System.out.println(entryMap.getKey() + "  value  " + entryMap.getValue());

        }
        student.entrySet().stream().forEach( entry -> {
            System.out.println(entry.getKey() + "  value  " + entry.getValue());


        });

        Map<String, Integer> myMarksSortedMap = new TreeMap<>();

        myMarksSortedMap.put("Maths", 65);
        myMarksSortedMap.put("English", 80);
        myMarksSortedMap.put("Hindhi", 68);
        myMarksSortedMap.put("Telugu", 79);

        myMarksSortedMap.entrySet().stream().forEach( entry -> {
            System.out.println(entry.getKey() + "  value  " + entry.getValue());

    });
}
}
