import java.util.Scanner;

public class Account {

    private int accountNumber;
    private String name;
    private double balance;

    public Account() {
        this(0, "", 0.0);
    }

    public Account(int accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        accountNumber = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Account Holder's Name: ");
        name = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        balance = scanner.nextDouble();
    }

    
    public void display() {
        System.out.println("Account Details:");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder's Name: " + name);
        System.out.println("Balance: Rs. " + balance);
    }

    
    public void credit(double amount) {
        balance += amount;
        System.out.println("A/C credited with Rs. " + amount + " and Balance: Rs. " + balance);
    }

    
    public void debit(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("A/C debited with Rs. " + amount + " and Balance: Rs. " + balance);
        } else {
            System.out.println("Insufficient funds. Debit operation failed.");
        }
    }

    public static void main(String[] args) {
        
        Account account = new Account();
        System.out.println("Enter details for the account:");
        account.input();
        account.display();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the amount to credit: Rs. ");
        double creditAmount = scanner.nextDouble();
        account.credit(creditAmount);

        System.out.print("Enter the amount to debit: Rs. ");
        double debitAmount = scanner.nextDouble();
        account.debit(debitAmount);
    }
}