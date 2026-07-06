package learn.javabasics;

import java.util.Scanner;

public class mainfile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String correctUsername = "Admin";
        String correctPassword = "1234";

        System.out.print("Enter Username : ");
        String username = sc.next();

        System.out.print("Enter Password : ");
        String password = sc.next();

        if (username.equals(correctUsername) && password.equals(correctPassword)) {

            sc.nextLine();

            System.out.println("\n===== WELCOME =====");

            System.out.print("Enter Student Name : ");
            String name = sc.nextLine();

            System.out.print("Enter Roll Number : ");
            int rollNo = sc.nextInt();

            int total = 0;

            System.out.println("\nEnter Marks of 5 Subjects");

            for (int i = 1; i <= 5; i++) {
                System.out.print("Subject " + i + " Marks : ");
                int marks = sc.nextInt();
                total += marks;
            }

            System.out.print("\nEnter Family Income : ");
            double income = sc.nextDouble();

            double percentage = total / 5.0;

            String grade;

            if (percentage >= 75) {
                grade = "FIRST CLASS WITH DISTINCTION";
            } else if (percentage >= 60) {
                grade = "FIRST CLASS";
            } else if (percentage >= 50) {
                grade = "SECOND CLASS";
            } else if (percentage >= 40) {
                grade = "PASS";
            } else {
                grade = "FAIL";
            }

            int scholarship = 0;

            if (percentage >= 90 && income < 200000) {
                scholarship = 10000;
            } else if (percentage >= 75 && income < 300000) {
                scholarship = 7500;
            } else if (percentage >= 60 && income < 500000) {
                scholarship = 5000;	
            } else if (percentage >= 50) {
                scholarship = 2500;
            }

            System.out.println("\n=================================");
            System.out.println("         STUDENT REPORT          ");
            System.out.println("=================================");
            System.out.println("Name         : " + name);
            System.out.println("Roll No      : " + rollNo);
            System.out.println("Total Marks  : " + total + "/500");
            System.out.println("Percentage   : " + percentage + "%");
            System.out.println("Grade        : " + grade);

            if (scholarship > 0) {
                System.out.println("Scholarship  : Rs. " + scholarship);
            } else {
                System.out.println("Scholarship  : Not Eligible");
            }

            System.out.println("=================================");

        } else {
            System.out.println("Invalid Username or Password!");
        }

        sc.close();
    }
}