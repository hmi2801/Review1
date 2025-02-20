package Bridgelabz_2113100011.Assignment20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveDuplicates {
    public static void removeDuplicates(List<Integer> list) {
        int index = 0;
        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(index))) {
                index++;
                list.set(index, list.get(i));

            }

        }

        while (list.size() > index + 1) {
            list.remove(list.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>(Arrays.asList(10, 20, 30, 30, 40, 40, 40, 50));


        removeDuplicates(list);
        System.out.println(list);
    }
}
