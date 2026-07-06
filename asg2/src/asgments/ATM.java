package asgments;

import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int originalPin = 1234;
        int enteredPin;
        int choice;
        double balance = 10000;
        double amount;

        System.out.println("******** Welcome to ATM ********");

        System.out.print("Enter PIN: ");
        enteredPin = sc.nextInt();

        if (enteredPin == originalPin) {

            System.out.println("Login Successful");

            do {

                System.out.println("\n===== ATM MENU =====");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");

                System.out.print("Enter Your Choice: ");
                choice = sc.nextInt();

                switch (choice) {

                    case 1:
                        System.out.println("Current Balance: ₹" + balance);
                        break;

                    case 2:
                        System.out.print("Enter Amount to Deposit: ");
                        amount = sc.nextDouble();

                        if (amount > 0) {
                            balance += amount;
                            System.out.println("Deposit Successful");
                            System.out.println("Updated Balance: ₹" + balance);
                        } else {
                            System.out.println("Invalid Amount");
                        }
                        break;

                    case 3:
                        System.out.print("Enter Amount to Withdraw: ");
                        amount = sc.nextDouble();

                        if (amount > 0 && amount <= balance) {
                            balance -= amount;
                            System.out.println("Withdrawal Successful");
                            System.out.println("Remaining Balance: ₹" + balance);
                        } else {
                            System.out.println("Insufficient Balance or Invalid Amount");
                        }
                        break;

                    case 4:
                        System.out.println("Thank You for Using ATM");
                        break;

                    default:
                        System.out.println("Invalid Choice");
                }

            } while (choice != 4);

        } else {
            System.out.println("Invalid PIN");
        }

        sc.close();
    }
}