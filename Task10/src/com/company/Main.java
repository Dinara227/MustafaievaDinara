package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //Task10.1
        Set<String> set1 = new HashSet<String>();
        Set<String> set2 = new HashSet<String>();
        set1.add("Anna");
        set1.add("Alina");
        set1.add("Ihor");
        set1.add("Oleksiy");

        set2.add("Anna");
        set2.add("Ivan");
        set2.add("Ihor");
        set2.add("Katia");
        set2.add("Vasyl");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Union set: " + union(set1, set2) + "\n");

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Intersected set: " + intersect(set1, set2) + "\n");


        //Task10.2
        Map<String, String> personMap = new HashMap();

        personMap.put("Pavliuk", "Anna");
        personMap.put("Shabarkevych", "Alina");
        personMap.put("Medvid", "Ihor");
        personMap.put("Rudenko", "Oleksiy");
        personMap.put("Khanyk", "Victor");
        personMap.put("Vasylchak", "Olena");
        personMap.put("Ferbei", "Dasha");
        personMap.put("Draga", "Vasyl");
        personMap.put("Lesiv", "Oleg");
        personMap.put("Ivanov", "Ivan");
        personMap.put("Petrenko", "Ivan");

        //Task10.2.1
        System.out.println("The map: " + personMap + "\n");

        //Task10.2.2
        System.out.println("Are there two or more same names?");

        HashSet<String> firstNames = new HashSet<String>();
        for (String value : personMap.values()) {
            firstNames.add(value);
        }
        if (personMap.values().size() != firstNames.size()){
            System.out.println("Yes, there are." + "\n");
        }
        else System.out.println("No, there aren't." + "\n");

        //Task10.2.3
        for (Iterator<String> iterator = personMap.values().iterator(); iterator.hasNext(); ) {
            String value = iterator.next();
            if (value == "Ivan") {
                iterator.remove();
            }
        }
        System.out.println("Changed map(all 'Ivan' values deleted): " + personMap);
    }

    public static Set<String> union(Set set1, Set set2) {
        Set<String> unionSet = new HashSet<>(set1);
        unionSet.addAll(set2);
        return unionSet;
    }

    public static Set<String> intersect(Set set1, Set set2) {
        Set<String> intersectSet = new HashSet<>(set1);
        intersectSet.retainAll(set2);
        return intersectSet;
    }
}