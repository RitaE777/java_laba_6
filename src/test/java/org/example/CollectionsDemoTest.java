package org.example;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CollectionsDemoTest {

    @org.junit.jupiter.api.Test
    void countStrings() {
        List<String> strings = new ArrayList<>();
        String string1 = "Dimic";
        String string2 = "Ritka";
        String string3 = "Oleg";
        String string4 = "Markovka";
        String string5 = "Dimic2";
        strings.add(string1);
        strings.add(string2);
        strings.add(string3);
        strings.add(string4);
        assertEquals(2, CollectionsDemo.countStrings(strings, 'D'));
        assertEquals(0, CollectionsDemo.countStrings(strings, 'P'));
        assertEquals(1, CollectionsDemo.countStrings(strings, 'M'));
    }

    @org.junit.jupiter.api.Test
    void getHumanByID() {
        Human human1 = new Human("Lastname1", "Name1", "Otchestvo1", 19);
        Human human2 = new Human("Lastname2", "Name2", "Otchestvo2", 44);
        Human human3 = new Human("Lastname1", "Name3", "Otchestvo3", 10);
        Human human4 = new Human("Lastname4", "Name2", "Otchestvo1", 35);
        Map<Integer, Human> map = new HashMap<>();
        map.put(1, human1);
        map.put(2, human2);
        map.put(3, human3);
        map.put(4, human4);

        Set<Integer> ids = new HashSet<>();
        ids.add(1);
        ids.add(6);
        ids.add(3);
        Set<Integer> IDS = new HashSet<>();
        ids.add(0);
        ids.add(10);
        ids.add(5);

        assertEquals(2, CollectionsDemo.getHumanByID(map, ids).size());
        assertEquals(0, CollectionsDemo.getHumanByID(map, IDS).size());
    }

    @Test
    void ageFilter() {
        Human human1 = new Human("Lastname1", "Name1", "Otchestvo1", 19);
        Human human2 = new Human("Lastname2", "Name2", "Otchestvo2", 44);
        Human human3 = new Human("Lastname1", "Name3", "Otchestvo3", 10);
        Human human4 = new Human("Lastname4", "Name2", "Otchestvo1", 35);
        Map<Integer, Human> map = new HashMap<>();
        map.put(1, human1);
        map.put(2, human2);
        map.put(3, human3);
        map.put(4, human4);

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(4);

        assertEquals(3, CollectionsDemo.ageFilter(map, set).size());
    }
    @Test
    void comparePersonsAge(){
        Human human1 = new Human("Lastname1", "Name1", "Otchestvo1", 19);
        Human human2 = new Human("Lastname2", "Name2", "Otchestvo2", 44);
        Human human3 = new Human("Lastname1", "Name3", "Otchestvo3", 10);
        Human human4 = new Human("Lastname4", "Name2", "Otchestvo1", 35);
        Map<Integer, Human> map = new HashMap<>();
        map.put(1, human1);
        map.put(2, human2);
        map.put(3, human3);
        map.put(4, human4);

        assertEquals(19, CollectionsDemo.comparePersonsAge(map).get(1));
        assertEquals(44, CollectionsDemo.comparePersonsAge(map).get(2));
        assertEquals(10, CollectionsDemo.comparePersonsAge(map).get(3));
        assertEquals(35, CollectionsDemo.comparePersonsAge(map).get(4));
    }
    @Test
    void getHumanByAge(){
        Human human1 = new Human("Lastname1", "Name1", "Otchestvo1", 19);
        Human human2 = new Human("Lastname2", "Name2", "Otchestvo2", 44);
        Human human3 = new Human("Lastname1", "Name3", "Otchestvo3", 10);
        Human human4 = new Human("Lastname4", "Name2", "Otchestvo1", 35);
        Set<Human> humans = new HashSet<>();
        humans.add(human1);
        humans.add(human2);
        humans.add(human3);
        humans.add(human4);
        System.out.println(humans);
        System.out.println(humans.size());

        assertEquals(0, CollectionsDemo.getHumanByAge(11, humans).size());
        assertEquals(1, CollectionsDemo.getHumanByAge(19, humans).size());
    }
}