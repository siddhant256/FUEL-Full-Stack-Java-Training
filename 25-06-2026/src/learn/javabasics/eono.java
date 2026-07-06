package learn.javabasics;

import java.util.Scanner;

public class eono {

    public static void main(String args[]) {

        Scanner c = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int no = c.nextInt();

        if (no % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        c.close();
    }
}