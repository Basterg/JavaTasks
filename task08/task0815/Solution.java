package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("Lalova", "lalka");
        map.put("Lalova1", "lalka1");
        map.put("Lalova2", "lalka1");
        map.put("Lalova3", "lalka2");
        map.put("Lalova4", "lalka3");
        map.put("Lalova5", "lalka4");
        map.put("Lalova6", "lalka4");
        map.put("Lalova7", "lalka4");
        map.put("Lalova8", "lalka5");
        map.put("Lalova9", "lalka6");

        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int countSameFirstNames = 0;
        for (String firstName : map.values()) {
            if (firstName.equals(name)) {
                countSameFirstNames += 1;
            }
        }
        return countSameFirstNames;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        int countSameLastNames = 0;
        for (String name : map.keySet()) {
            if (name.equals(lastName)) {
                countSameLastNames++;
            }
        }
        return countSameLastNames;
    }

    public static void main(String[] args) {
        HashMap<String, String> map = createMap();
        System.out.println(getCountTheSameFirstName(map, "lalka4"));
        System.out.println(getCountTheSameLastName(map, "Lalova"));
    }
}
