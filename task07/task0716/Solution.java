package com.javarush.task.task07.task0716;

import java.util.ArrayList;

/* 
Р или Л
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("роза"); // 0
        list.add("лоза"); // 1
        list.add("лира"); // 2
        list.add("роза");
        list.add("лира");
        list.add("лоза");
        list = fix(list);

        for (String s : list) {
            System.out.println(s);
        }
    }

    public static ArrayList<String> fix(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<>();
        for (String word : list) {
            if (word.contains("р") && word.contains("л")) {
                newList.add(word);
            } else if (word.contains("л")) {
                newList.add(word);
                newList.add(word);
            } else  if (!word.contains("р") && !word.contains("л")) {
                newList.add(word);
            }
        }
        return newList;
    }
}