package Bridgelabz_2113100011.Assignment20;
import java.util.*;
public class InvertMap {
    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> map) {
        Map<V, List<K>> invertedMap = new HashMap<>();
        for (K key : map.keySet()) {
            V value = map.get(key);
            invertedMap.putIfAbsent(value, new ArrayList<>());
            invertedMap.get(value).add(key);
        }
        return invertedMap;
    }

    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);

        Map<Integer, List<String>> invertedMap = invertMap(inputMap);
        System.out.println("Inverted Map: " + invertedMap);
    }
}
