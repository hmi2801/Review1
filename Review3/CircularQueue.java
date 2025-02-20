package Bridgelabz_2113100011.Review3;

public class CircularQueue {

    private static final int SIZE = 10;
    private int[] arr;
    int front;
    int rear;
    int count;

    CircularQueue() {
        arr = new int[SIZE];
        front = 0;
        rear = -1;
    }

    public void enqueue(int num) {
        if (count == SIZE) {
            front = (front + 1) % SIZE;
        } else {
            count++;
        }
        rear = (rear + 1) % SIZE;
        arr[rear] = num;
    }

    public void dequeue() {
        if (count == 0) {
            System.out.println("Queue is Empty!!");
            return;
        }
        if (front ==rear) {
            front=rear=-1;
        } else{
            front = (front + 1) % SIZE;
        }
        count--;
    }

    public void display() {
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % SIZE] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        CircularQueue circularQueue=new CircularQueue();
        circularQueue.enqueue(1);
        circularQueue.enqueue(2);
        circularQueue.enqueue(3);
        circularQueue.enqueue(4);
        circularQueue.enqueue(5);
        circularQueue.enqueue(6);
        circularQueue.enqueue(7);
        circularQueue.enqueue(8);
        circularQueue.enqueue(9);
        circularQueue.enqueue(10);

        circularQueue.display();

        circularQueue.enqueue(11);
        circularQueue.enqueue(12);
        circularQueue.enqueue(13);

        circularQueue.display();

        circularQueue.dequeue();

        circularQueue.display();

    }


}
