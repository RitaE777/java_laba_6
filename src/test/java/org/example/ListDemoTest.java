package org.example;

import org.example.methods.ListDemo;
import org.example.objects.Human;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class ListDemoTest {
    @Test
    void sameLastname() {
        Human human1 = new Human("Lastname1", "Name1", "Otchestvo1", 19);
        Human human2 = new Human("Lastname2", "Name2", "Otchestvo2", 44);
        Human human3 = new Human("Lastname1", "Name3", "Otchestvo3", 10);
        Human human4 = new Human("Lastname4", "Name2", "Otchestvo1", 35);
        Human human5 = new Human("Lastname5", "Name5", "Otchestvo5", 23);
        Human human6 = new Human("Lastname1", "Name6", "Otchestv6", 23);

        List<Human> people = new ArrayList<>();
        people.add(human1);
        people.add(human2);
        people.add(human3);
        people.add(human4);

        List<Human> result = ListDemo.sameLastname(people, human5);
        assertEquals(0, result.size());
        result = ListDemo.sameLastname(people, human6);
        assertEquals(2, result.size());
    }

    @Test
    void deleteHuman() {
        Human human1 = new Human("Lastname1", "Name1", "Otchestvo1", 19);
        Human human2 = new Human("Lastname2", "Name2", "Otchestvo2", 44);
        Human human3 = new Human("Lastname1", "Name3", "Otchestvo3", 10);
        Human human4 = new Human("Lastname4", "Name2", "Otchestvo1", 35);

        List<Human> people = new ArrayList<>();
        people.add(human1);
        people.add(human2);
        people.add(human3);
        people.add(human4);

        List<Human> result = ListDemo.deleteHuman(people, human1);
        assertEquals(3, result.size());
    }

    @Test
    void setOfIntegers() {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        set1.add(4);
        set1.add(5);
        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(-1);
        set2.add(-2);
        set2.add(-3);
        set2.add(-4);
        Set<Integer> set3 = new HashSet<>();
        set3.add(10);
        set3.add(20);
        set3.add(30);
        set3.add(40);
        set3.add(50);
        List<Set<Integer>> list = new ArrayList<>();
        list.add(set1);
        list.add(set2);
        list.add(set3);

        Set<Integer> mainSet1 = new HashSet<>();
        mainSet1.add(0);
        mainSet1.add(-1);
        mainSet1.add(-2);
        mainSet1.add(-3);
        mainSet1.add(-4);
        Set<Integer> mainSet2 = new HashSet<>();
        mainSet2.add(111);
        mainSet2.add(-112);
        mainSet2.add(215);
        mainSet2.add(319);
        mainSet2.add(141);

        assertEquals(2, ListDemo.setOfIntegers(list, mainSet1).size());
        assertEquals(3, ListDemo.setOfIntegers(list, mainSet2).size());
    }

    @Test
    void maxAge() {
        Human human1 = new Human("Lastname1", "Name1", "Otchestvo1", 19);
        Human human2 = new Human("Lastname2", "Name2", "Otchestvo2", 44);
        Human human3 = new Human("Lastname1", "Name3", "Otchestvo3", 10);
        Human human4 = new Human("Lastname4", "Name2", "Otchestvo1", 35);

        List<Human> people = new ArrayList<>();
        people.add(human1);
        people.add(human2);
        people.add(human3);
        people.add(human4);

        Set<Human> result = ListDemo.maxAge(people);
        assertEquals(1, result.size());

    }
}