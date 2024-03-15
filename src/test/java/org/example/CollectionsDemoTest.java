package org.example;

import org.example.methods.CollectionsDemo;
import org.example.objects.Human;
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
        String string5 = "Dmitriy";
        strings.add(string1);
        strings.add(string2);
        strings.add(string3);
        strings.add(string4);
        strings.add(string5);
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

        Set<Human> outPut1 = new HashSet<>();
        outPut1.add(human1);
        outPut1.add(human3);
        Set<Human> outPut2 = new HashSet<>();

        assertEquals(outPut1, CollectionsDemo.getHumanByID(map, ids));
        assertEquals(outPut2, CollectionsDemo.getHumanByID(map, IDS));
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

        Set<Human> outPut = new HashSet<>();
        outPut.add(human1);
        outPut.add(human2);
        outPut.add(human4);

        assertEquals(outPut, CollectionsDemo.ageFilter(map, set));
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

        Map<Integer, Human> map1 = new HashMap<>();
        Map<Integer, Human> map2 = new HashMap<>();
        map2.put(19, human1);

        assertEquals(map1, CollectionsDemo.getHumanByAge(11, humans));
        assertEquals(map2, CollectionsDemo.getHumanByAge(19, humans));
    }
}