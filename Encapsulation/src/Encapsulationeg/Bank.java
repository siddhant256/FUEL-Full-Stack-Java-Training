package Encapsulationeg;

import java.util.Scanner;

class BankAccount {

    private long accountNumber;
    private String accountHolderName;
    private String accountType;
    private String mobileNumber;
    private double balance;

  
    public BankAccount() {

    }

    
    public BankAccount(long accountNumber, String accountHolderName,
            String accountType, String mobileNumber, double balance) {

        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountType = accountType;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getAccountType() {
        return accountType;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }


    public void displayAccount() {

        System.out.println("\n------ Account Details ------");
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Type   : " + accountType);
        System.out.println("Mobile Number  : " + mobileNumber);
        System.out.println("Balance        : " + balance);
    }
    public void deposit(double amount) {

        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited Successfully.");
        } else {
            System.out.println("Invalid Deposit Amount.");
        }
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount.");
        } else if (balance - amount >= 1000) {
            balance -= amount;
            System.out.println("Withdrawal Successful.");
        } else {
            System.out.println("Minimum Balance should be 1000.");
        }
    }

    public void checkBalance() {
        System.out.println("Current Balance : " + balance);
    }
}

public class Bank {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        int choice;

        do {

            System.out.println("\n========== Bank Management System ==========");
            System.out.println("1. Create New Account");
            System.out.println("2. Display Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Check Balance");
            System.out.println("6. Update Mobile Number");
            System.out.println("7. Update Account Holder Name");
            System.out.println("8. Exit");

            System.out.print("Enter Your Choice : ");
            choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Account Number : ");
                long accNo = sc.nextLong();

                if (accNo <= 0) {
                    System.out.println("Invalid Account Number.");
                    break;
                }

                sc.nextLine();

                System.out.print("Enter Account Holder Name : ");
                String name = sc.nextLine();

                System.out.print("Enter Account Type (Saving/Current) : ");
                String type = sc.nextLine();

                System.out.print("Enter Mobile Number : ");
                String mobile = sc.nextLine();

                if (mobile.length() != 10) {
                    System.out.println("Invalid Mobile Number.");
                    break;
                }

                System.out.print("Enter Initial Balance : ");
                double balance = sc.nextDouble();

                if (balance < 500) {
                    System.out.println("Initial Balance must be at least 1000.");
                    break;
                }

                account.setAccountNumber(accNo);
                account.setAccountHolderName(name);
                account.setAccountType(type);
                account.setMobileNumber(mobile);
                account.setBalance(balance);

                System.out.println("Account Created Successfully.");
                break;

            case 2:

                account.displayAccount();
                break;

            case 3:

                System.out.print("Enter Deposit Amount : ");
                double deposit = sc.nextDouble();
                account.deposit(deposit);
                break;

            case 4:

                System.out.print("Enter Withdrawal Amount : ");
                double withdraw = sc.nextDouble();
                account.withdraw(withdraw);
                break;

            case 5:

                account.checkBalance();
                break;

            case 6:

                sc.nextLine();

                System.out.print("Enter New Mobile Number : ");
                String newMobile = sc.nextLine();

                if (newMobile.length() == 10) {
                    account.setMobileNumber(newMobile);
                    System.out.println("Mobile Number Updated Successfully.");
                } else {
                    System.out.println("Invalid Mobile Number.");
                }

                break;

            case 7:

                sc.nextLine();

                System.out.print("Enter New Account Holder Name : ");
                String newName = sc.nextLine();

                account.setAccountHolderName(newName);

                System.out.println("Name Updated Successfully.");
                break;

            case 8:

                System.out.println("Thank You...");
                break;

            default:

                System.out.println("Invalid Choice.");
            }

        } while (choice != 8);

        sc.close();
    }
}