package asgments;
import java.util.Scanner;

public class as3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name;
        double salary, rating, hike = 0, newSalary;
        int experience;

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Current Salary: ");
        salary = sc.nextDouble();

        System.out.print("Enter Performance Rating: ");
        rating = sc.nextDouble();

        System.out.print("Enter Experience (in years): ");
        experience = sc.nextInt();

        if (rating >= 4.5 && experience >= 5) {
            hike = salary * 0.20;
        } else if (rating >= 4.0 && experience >= 3) {
            hike = salary * 0.15;
        } else if (rating >= 3.0) {
            hike = salary * 0.10;
        } else {
            hike = 0;
        }

        newSalary = salary + hike;

        System.out.println("\n------ Employee Salary Report ------");
        System.out.println("Employee Name : " + name);
        System.out.println("Current Salary: ₹" + salary);
        System.out.println("Rating        : " + rating);
        System.out.println("Experience    : " + experience + " Years");
        System.out.println("Salary Hike   : ₹" + hike);
        System.out.println("New Salary    : ₹" + newSalary);

        sc.close();
    }
}