package org.example;

import org.example.methods.ListDemo;
import org.example.objects.Human;
import org.junit.jupiter.api.Test;

import java.util.*;

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
        assertEquals(new ArrayList<Human>(), result);

        List<Human> result2 = ListDemo.sameLastname(people, human6);
        List<Human> people2 = new ArrayList<>();
        people2.add(human1);
        people2.add(human3);
        assertEquals(people2, result2);
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
        List<Human> people2 = new ArrayList<>();
        people2.add(human2);
        people2.add(human3);
        people2.add(human4);

        List<Human> result = ListDemo.deleteHuman(people, human1);
        assertEquals(people2, result);
    }

    @Test
    void setOfIntegers() {
        /*Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        Set<Integer> set2 = new HashSet<>();
        set2.add(0);
        set2.add(-1);
        set2.add(-2);
        List<Set<Integer>> inputList = new ArrayList<>();
        inputList.add(set1);
        inputList.add(set2);

        Set<Integer> mainSet1 = new HashSet<>();
        mainSet1.add(11);
        mainSet1.add(-1);
        mainSet1.add(-22);
        Set<Integer> mainSet2 = new HashSet<>();
        mainSet2.add(111);
        mainSet2.add(-112);
        mainSet2.add(215);

        List<Set<Integer>> outputList = new ArrayList<>();
        outputList.add(set1);

        assertEquals(outputList, ListDemo.deletingSetsIntegerNumbers(inputList, mainSet1));*/
        Set<Integer> inputSet = new HashSet<>();
        inputSet.add(101);
        inputSet.add(5);
        inputSet.add(301);

        Set<Integer> set1 = new HashSet<>();
        set1.add(5);
        set1.add(10);
        set1.add(15);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(6);
        set2.add(9);

        Set<Integer> set3 = new HashSet<>();
        set3.add(10);
        set3.add(20);
        set3.add(30);

        List<Set<Integer>> inputList = new ArrayList<>();
        inputList.add(set1);
        inputList.add(set2);
        inputList.add(set3);

        List<Set<Integer>> output = new ArrayList<>();
        output.add(set2);
        output.add(set3);
        assertEquals(output, ListDemo.setOfIntegers(inputList, inputSet));
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
        Set<Human> outputSet = new HashSet<>();
        outputSet.add(human2);
        assertEquals(outputSet, result);

    }
    @Test
    void idk(){
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "String1");
        mapa.put(2, "String1");
        mapa.put(3, "String1");
        mapa.put(1, "String12");
        System.out.println(mapa.get(1));
    }
}