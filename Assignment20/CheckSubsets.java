package Bridgelabz_2113100011.Assignment20;

import java.util.HashSet;
import java.util.Set;

public class CheckSubsets {

    public static boolean checkforSubset(Set<Integer> set1, Set<Integer> set2){
        return set1.containsAll(set2) || set2.containsAll(set1);
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        set1.add(2);
        set1.add(3);

        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);
        set2.add(5);

        boolean b=checkforSubset(set1,set2);

        System.out.println("Subsets  exist: "+b);



    }
}
