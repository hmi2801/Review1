package Bridgelabz_2113100011.Assignment20;

import java.util.HashSet;
import java.util.Set;

public class UnionIntesectionOfSets {


    public static Set<Integer> intersectionOfSets(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set=new HashSet<>();

        for(Integer num:set1){
            if(set2.contains(num)){
                set.add(num);
            }
        }
        return set;
    }
    public static Set<Integer> unionOfSets(Set<Integer> set1, Set<Integer> set2) {
        set1.addAll(set2);

        return set1;
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

        Set<Integer> set = unionOfSets(set1, set2);
        System.out.println("Union of two sets  " + set1 + " and " + set2 + " is " + set);

        set=intersectionOfSets(set1,set2);
        System.out.println("Intersection of two sets  " + set1 + " and " + set2 + " is " + set);

    }
}
