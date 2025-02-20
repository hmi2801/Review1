package Bridgelabz_2113100011.Assignment20;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryNumbersUsingQueue {

    public static Queue<String> generateBinaryNumbers(int N) {
        Queue<String> result = new LinkedList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add("1");

        for (int i = 0; i < N; i++) {
            String s = queue.poll();
            result.add(s);
            queue.add(s + "0");
            queue.add(s + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 5;
        Queue<String> queue = generateBinaryNumbers(N);
        System.out.println(queue);
    }
}
