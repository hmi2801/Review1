package Bridgelabz_2113100011.Assignment20;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.SynchronousQueue;

public class ReverseQueue {

    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

        // Step 1: Dequeue all elements and push them onto the stack
        while (!queue.isEmpty()) {
            stack.push(queue.remove());
        }

        // Step 2: Pop elements from stack and enqueue them back into the queue
        while (!stack.isEmpty()) {
            queue.add(stack.pop());
        }
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);

        System.out.println("Before Reverse: " + queue);
        reverseQueue(queue);
        System.out.println("After Reverse: " + queue);
    }
}
