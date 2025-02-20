package Bridgelabz_2113100011.Assignment20;

import java.util.HashMap;
import java.util.Map;

public class MergeTwoMaps {
    public static Map<Character, Integer> mergeMaps(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        Map<Character, Integer> map = new HashMap<>();

        // Copy all entries from map1
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }

        // Merge entries from map2
        for (Map.Entry<Character, Integer> entry : map2.entrySet()) {
            // If the key exists, sum the values; otherwise, just add the new key-value pair
            map.put(entry.getKey(), map.getOrDefault(entry.getKey(), 0) + entry.getValue());
        }

        return map;  // ✅ Return the merged map
    }

    public static void main(String[] args) {
        Map<Character, Integer> map1 = new HashMap<>();
        map1.put('A', 1);
        map1.put('B', 2);

        Map<Character, Integer> map2 = new HashMap<>();
        map2.put('B', 3);
        map2.put('C', 4);

        Map<Character, Integer> result = mergeMaps(map1, map2);
        System.out.println(result); // Output: {A=1, B=5, C=4}
    }
}


