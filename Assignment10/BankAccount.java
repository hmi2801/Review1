package Assignment10;

public class BankAccount {

    static String bankName = "Global Bank";
    String accountHolderName;
    final double accountNumber;
    static int accountCount = 0;

    static void getTotalAccounts() {
        System.out.println("Total Number of accoutns : " + accountCount);
    }

    BankAccount(String accountHolderName, double accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        accountCount++;
    }

    void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);

        } else {
            System.out.println("Invalid account object!!");
        }
    }

    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("John Doe", 1001);
        BankAccount acc2 = new BankAccount("Jane Smith", 1002);

        acc1.displayDetails();
        getTotalAccounts();

    }
}

