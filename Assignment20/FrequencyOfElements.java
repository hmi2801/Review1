package Bridgelabz_2113100011.Assignment20;

import java.util.*;

public class FrequencyOfElements {

    public static Map<String, Integer> frequencyCount(List<String> list) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        for (int i = 0; i < list.size(); i++) {
            map.put(list.get(i), map.getOrDefault(list.get(i),0)+1);
        }
        return map;
    }

    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list = Arrays.asList("apple", "banana", "apple", "orange");

        Map<String, Integer> map = new HashMap<>();
        map = frequencyCount(list);

        System.out.println(map);


    }
}
