/*
 A bank wants to create a simple system to manage its customers’ savings accounts.
 Each customer has a savings account with details such as account number, account
 holder’s name, and account balance. The bank also needs to ensure that account
 details like balance are secure and cannot be accessed directly. The bank requires
 that the system:
 • Protects the account balance by restricting direct access to it.
 • Provides methods (getters and setters) to retrieve the balance and allow de
posits and withdrawals, ensuring the balance cannot become negative.
 (a) Create a class SavingsAccount with necessary attributes.
 (b) Implement getters and setters for accountNumber and accountHolder
Name.
 (c) Create a getter for balance (No setter for balance).
 (d) Implement a method called deposit(double amount) that adds amount to
 balance (amount should be positive).
 (e) Implement a methodcalled withdraw(double amount) thatdeducts amount
 from balance only if there are sufficient funds.
 (f) Create a displayAccountDetails() to print account details.
 */
import java.util.Scanner;

public class savingaccount {
    private String accountHolderName;
    private int accountNumber;
    private double balance;

    public savingaccount() {}

    public savingaccount(String accountHolderName, int accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void deposit(double amount) {
        this.balance += amount;

        System.out.print("Deposited : " + amount );

        System.out.println(" New balance : " + this.balance );

    }

    public void withdraw(double amount) {
        this.balance -= amount;
        System.out.print("Withdrawal : " + amount );

        System.out.println(" New balance : " + this.balance );
    }

    public void displayAccount() {

        System.out.println("Final Account Details ");
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);

    }

}

public void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    savingaccount account = new savingaccount();

    System.out.println("Enter Account Holder Name: ");
    account.setAccountHolderName(sc.next());

    System.out.println("Enter Account Number : ");
    account.setAccountNumber(sc.nextInt());

    System.out.println("Enter The Initial Deposit : ");
    account.deposit(sc.nextDouble());

    System.out.println("Enter The Deposit Amount : ");
    account.deposit(sc.nextDouble());

    System.out.println("Enter the withdrawal amount : ");
    account.withdraw(sc.nextDouble());

    account.displayAccount();


}
