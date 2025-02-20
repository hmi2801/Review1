package Bridgelabz_2113100011.Assignment20;

public class CircularBuffer {

    private static final int SIZE = 10;
    int[] arr;
    int front;
    int rear;
    int count;

    CircularBuffer() {
        arr = new int[SIZE];
        front = 0;
        rear = -1;
        count = 0;
    }


    public void addElement(int num) {
        //Overwriting the oldest element
        if (count == SIZE) {
            front = (front + 1) % SIZE;
        } else {
            count++;
        }

        rear = (rear + 1) % SIZE;
        arr[rear] = num;
    }

    public void display() {
        System.out.println("Buffer: ");
        for (int i = 0; i < count; i++) {
            System.out.print(arr[(front + i) % SIZE] + " ");
        }
        System.out.println();
    }
}

class Main2 {
    public static void main(String[] args) {
        CircularBuffer circularBuffer = new CircularBuffer();
        circularBuffer.addElement(1);
        circularBuffer.addElement(2);
        circularBuffer.addElement(3);
        circularBuffer.addElement(4);
        circularBuffer.addElement(5);
        circularBuffer.addElement(6);
        circularBuffer.addElement(7);
        circularBuffer.addElement(8);
        circularBuffer.addElement(9);
        circularBuffer.addElement(10);

        circularBuffer.display();
        circularBuffer.addElement(11);
        circularBuffer.display();
    }

}
