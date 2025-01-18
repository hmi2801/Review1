public class EvenOddList {
    public static void main(String[] args) {
        System.out.println("Even numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if ((i & 1) == 0) { // Check if the number is even
                System.out.print(i + " ");
            }
        }

        System.out.println("\nOdd numbers from 1 to 10:");
        for (int i = 1; i <= 10; i++) {
            if ((i & 1) == 1) { // Check if the number is odd
                System.out.print(i + " ");
            }
        }
    }
}

