package com.javarush.task.task10.task1016;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* 
Одинаковые слова в списке
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> words = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            words.add(reader.readLine());
        }

        Map<String, Integer> map = countWords(words);

        for (Map.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }
    }

    public static Map<String, Integer> countWords(ArrayList<String> words) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.size(); i++) {
            String currentWord = words.get(i);
            if (!map.containsKey(currentWord)) {
                int count = 1;
                for (int j = i + 1; j < words.size(); j++) {
                    String nextWord = words.get(j);
                    if (currentWord.equals(nextWord)) {
                        count++;
                    }
                }
                map.put(currentWord, count);
            }
        }
        return map;
    }

}

