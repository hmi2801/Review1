package Bridgelabz_2113100011.Assignment20;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class NthElementFromEnd {

    public static Character elementFromEnd(LinkedList<Character> linkedList, int N) {
       int first=0,second=0;

       while(first<N){
           first++;
       }

       while(first<linkedList.size()){
           first++;
           second++;
       }
       return linkedList.get(second);
    }

    public static void main(String[] args) {
        LinkedList<Character> linkedList = new LinkedList<>();
        linkedList.add('A');
        linkedList.add('B');
        linkedList.add('C');
        linkedList.add('D');
        linkedList.add('E');

        char ch = elementFromEnd(linkedList, 4);
        System.out.println("Element from end is " + ch);
    }
}
