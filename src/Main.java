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
                System.out.println("Create Account feature coming soon...");
            } else if (choice == 2) {
                System.out.println("View Accounts feature coming soon...");
            } else if (choice == 3) {
                System.out.println("Deposit feature coming soon...");
            } else if (choice == 4) {
                System.out.println("Withdraw feature coming soon...");
            } else if (choice == 5) {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid choice. Try again.");
            }
        }

        scanner.close();
    }
}
