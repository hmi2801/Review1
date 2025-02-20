package Bridgelabz_2113100011.Assignment20;

import java.awt.desktop.PreferencesEvent;
import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;


public class ReverseList {

    public static void reverseList(List<Integer> list) {
        int left = 0;
        int right = list.size() - 1;

        while (left < right) {
            int temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }

    }

    public static void reverseLinkedList(LinkedList<Integer> linkedList) {
        int left = 0;
        int right = linkedList.size() - 1;

        while (left < right) {
            int temp = linkedList.get(left);
            linkedList.set(left, linkedList.get(right));
            linkedList.set(right, temp);

            left++;
            right--;
        }

    }

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list = Arrays.asList(1, 2, 3, 4, 5);

        reverseList(list);
        System.out.println("Reversed List: ");
        System.out.println(list);
        System.out.println();

        LinkedList<Integer> linkedlist = new LinkedList<>();
        linkedlist.add(1);
        linkedlist.add(2);
        linkedlist.add(3);
        linkedlist.add(4);
        linkedlist.add(5);

        reverseLinkedList(linkedlist);
        System.out.println("Reversed LinkedList: ");
        System.out.println(linkedlist);

    }
}