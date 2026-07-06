package learn.javabasics;
import java.util.Scanner;

public class ovlncon {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);

        if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {

            if (c=='a' || c=='A' ||
                c=='e' || c=='E' ||
                c=='i' || c=='I' ||
                c=='o' || c=='O' ||
                c=='u' || c=='U') {

                System.out.println("Vowel");
            }
            else {
                System.out.println("Consonant");
            }

        }
        else {
            System.out.println("Invalid Input");
        }

        sc.close();
    }
}