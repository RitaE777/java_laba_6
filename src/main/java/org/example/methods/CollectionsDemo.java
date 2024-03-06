package org.example.methods;
import org.example.objects.Human;

import java.util.*;

public class CollectionsDemo {

    public static int countStrings(List<String> strings, char symbol){
        int count = 0;
        for(String s : strings){
            if(s.charAt(0) == symbol){
                count++;
            }
        }
        return  count;
    }
    public static Set<Human> getHumanByID(Map<Integer, Human> map, Set<Integer> IDs){
        Set<Human> result = new HashSet<>();
        for(int id : IDs){
            if(map.containsKey(id))
                result.add(map.get(id));
        }
        return result;
    }
    public static Set<Human> ageFilter(Map<Integer,Human> map, Set<Integer> set) {
        Set<Human> result = new HashSet<>();
        for(int id : set){
            if(map.get(id).getAge() > 18){
                result.add(map.get(id));
            }
        }
        return result;
    }
    public static Map<Integer,Integer> comparePersonsAge(Map<Integer, Human> map){
        Map<Integer, Integer> result = new HashMap<>();
        for(Map.Entry<Integer, Human> entry : map.entrySet()){
            int key = entry.getKey();
            Human human = entry.getValue();
            int age = human.getAge();
            result.put(key, age);
        }
        return result;
        //while (map.hasNext)
    }
    public static Map<Integer, List<Human>> getHumanByAge(int age, Set<Human> humans){
        Map<Integer, List<Human>> result = new HashMap<>();
        List<Human> list = new ArrayList<>();
        for(Human human : humans){
            if(human.getAge() == age){
                list.add(human);
                result.put(age, list);
            }
        }
        return result;
    }
}
