package learn.javabasics;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner c = new Scanner(System.in);

        System.out.print("Enter Marks: ");
        int t_m = c.nextInt();

        if (t_m > 90) {
            System.out.println("A");
        } 
        else {
            if (t_m > 80) {
                System.out.println("B");
            } 
            else {
                if (t_m > 75) {
                    System.out.println("C");
                } 
                else {
                    if (t_m >= 35) {
                        System.out.println("D");
                    } 
                    else {
                        System.out.println("Fail");
                    }
                }
            }
        }

        c.close();
    }
}