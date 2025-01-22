package Assignment3;
import java.util.*;
public class TotalIncome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();
        double bonus = scanner.nextDouble();
        double income = salary + bonus;
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + income);
    }

}
