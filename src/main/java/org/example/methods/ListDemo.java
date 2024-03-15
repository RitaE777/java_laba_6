package org.example.methods;

import org.example.objects.Human;

import java.util.*;

public class ListDemo {
    public static List<Human> sameLastname(List<Human> people, Human human) {
        List<Human> samePeople = new ArrayList<>();
        for (Human person : people) {
            if (person.getLastname().equals(human.getLastname())) {
                samePeople.add(person);
            }
        }
        return samePeople;
    }

    public static List<Human> deleteHuman(List<Human> people, Human human) {
        List<Human> copyOfList = new ArrayList<>(people);
        copyOfList.remove(human);
        return copyOfList;
    }

    /*public static List<Set<Integer>> setOfIntegers(List<Set<Integer>> list1,
                                                   Set<Integer> mainSet) {
        List<Set<Integer>> list2 = new ArrayList<>(list1);
        for (int i = 0; i < list2.size(); i++) {
            Set<Integer> set = list2.get(i);
            if (mainSet.equals(set)) {
                list2.remove(set);
            }
            //пройтись внутри множества 1 2 3, 1 4 6(пересекаются)
        }
        return list2;
    }*/

    /*public static List<Set<Integer>> setOfIntegers(List<Set<Integer>> inputList,
                                                   Set<Integer> mainSet){
        List<Set<Integer>> outputList = new ArrayList<>(inputList);
        for(Set<Integer> set : outputList){
            if(Collections.disjoint(set, mainSet)){
                outputList.remove(set);
            }
        }
        return outputList;
    }*/
    public static List<Set<Integer>> setOfIntegers(List<Set<Integer>> inputList,
                                                   Set<Integer> mainSet){

        List<Set<Integer>> outputList = new ArrayList<>();
        for (Set<Integer> set: inputList) {
            if (Collections.disjoint(set,mainSet)) {
                outputList.add(set);
            }
        }
        return outputList;
    }

    public static Set<Human> maxAge(List<? extends Human> list) {
        Set<Human> result = new HashSet<>();
        int maxAge = -1;
        for (Human human : list) {
            if (human.getAge() > maxAge) {
                maxAge = human.getAge();
            }
        }
        for (Human human : list) {
            if (human.getAge() == maxAge)
                result.add(human);
        }
        return result;
    }

}
