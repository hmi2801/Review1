package Bridgelabz_2113100011.Assignment20;

import java.util.HashSet;
import java.util.Set;

public class CompareSets {

    public static void main(String[] args) {
        Set<Integer> set1 =new HashSet<>();
        Set<Integer> set2 =new HashSet<>();

        set1.add(1);
        set1.add(2);
        set1.add(3);

        set2.add(3);
        set2.add(2);
        set2.add(1);

        boolean b=set1.equals(set2);
        System.out.println(b);

    }
}
