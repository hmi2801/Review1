package Bridgelabz_2113100011.Assignment20;

import java.util.HashSet;
import java.util.Set;

public class SymmetricDifferenceOfSets{

    public static Set<Integer> differenceOfSets(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> result = new HashSet<>(set1); // Copy set1
        result.addAll(set2); // Add all elements of set2

        Set<Integer> intersection = new HashSet<>(set1);
        intersection.retainAll(set2); // Get common elements

        result.removeAll(intersection); // Remove common elements
        return result;
    }
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(4);
        set2.add(5);


        Set<Integer> set = differenceOfSets(set1, set2);
        System.out.println("Difference of two sets  " + set1 + " and " + set2 + " is " + set);

    }
}
