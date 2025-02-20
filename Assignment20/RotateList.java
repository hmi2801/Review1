package Bridgelabz_2113100011.Assignment20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotateList {

    public static void reverseList(List<Integer> list, int s, int e) {

        while(s<e){
            int temp=list.get(s);
            list.set(s,list.get(e));
            list.set(e,temp);

            s++;
            e--;
        }

    }

    public static void rotateList(List<Integer> list, int n) {

        n = n % list.size();

        reverseList(list, 0, n - 1);
        reverseList(list, n, list.size() - 1);
        reverseList(list, 0, list.size() - 1);
    }


    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list = Arrays.asList(10, 20, 30, 40, 50);

        rotateList(list,6);
        System.out.println(list);

    }
}
