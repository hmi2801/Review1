package Assignment3;

import java.util.Scanner;

public class SampleProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        String fromCity = scanner.next();
        String viaCity = scanner.next();
        String toCity = scanner.next();
        double fromToVia = scanner.nextDouble();
        double viaToFinalCity = scanner.nextDouble();
        double timeTaken = scanner.nextDouble();
        System.out.println("The journey starts at "+fromCity +" via "+viaCity +" to "+toCity +" taking "+timeTaken +" hours.");
    }
}

