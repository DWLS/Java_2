package Lesson3.Homework;

import java.util.*;

public class Homework3 {
    public static void main(String[] args) {
        String[] words = {"dog", "cat", "apple", "dog", "bird", "cat", "apple", "cat", "orange", "horse"};

        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        System.out.println(map);
        System.out.println(" ");


        Set<String> uniq = new HashSet<>(Arrays.asList(words));
        System.out.println(uniq);
        System.out.println(" ");


        Phonebook pb = new Phonebook();

        pb.add("Ivanov", "123-45-67");
        pb.add("Petrov", "321-87-93");
        pb.add("Petrov", "547-98-26");

        System.out.println(pb.get("Petrov"));
    }
}

