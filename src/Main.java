// Bank Management System
// Author: CodeNestJava
// Description: Console-based Java application using OOP

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Account> accounts = new ArrayList<>();

        while (true) {
            System.out.println("\n===== Bank Management System =====");
            System.out.println("1. Create Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();
          if (choice == 1) {

           System.out.print("Enter Account Number: ");
           int accNumber = scanner.nextInt();
           scanner.nextLine();

            System.out.print("Enter Account Holder Name: ");
             String name = scanner.nextLine();

            Account newAccount = new Account(accNumber, name);
           accounts.add(newAccount);

           System.out.println("Account created successfully!");   
            } else if (choice == 2) {

    if (accounts.isEmpty()) {
        System.out.println("No accounts found.");
    } else {
        System.out.println("\n--- Account List ---");

        for (Account acc : accounts) {
            System.out.println(
                "Account Number: " + acc.getAccountNumber() +
                ", Holder: " + acc.getAccountHolder() +
                ", Balance: " + acc.getBalance()
            );
        }
    }
           } else if (choice == 3) {

    System.out.print("Enter Account Number: ");
    int accNumber = scanner.nextInt();

    boolean found = false;

    for (Account acc : accounts) {

        if (acc.getAccountNumber() == accNumber) {

            System.out.print("Enter deposit amount: ");
            double amount = scanner.nextDouble();

            acc.deposit(amount);

            System.out.println("Deposit successful!");
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Account not found.");
    }

}
            else if (choice == 4) {

    System.out.print("Enter Account Number: ");
    int accNumber = scanner.nextInt();

    boolean found = false;

    for (Account acc : accounts) {

        if (acc.getAccountNumber() == accNumber) {

            System.out.print("Enter withdraw amount: ");
            double amount = scanner.nextDouble();

            if (acc.getBalance() >= amount) {
                acc.withdraw(amount);
                System.out.println("Withdrawal successful!");
            } else {
                System.out.println("Insufficient balance.");
            }

            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("Account not found.");
    }

}
             else if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
