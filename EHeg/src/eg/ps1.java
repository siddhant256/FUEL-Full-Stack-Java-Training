package eg;
import java.util.Scanner;
public class ps1 
{
	public static void main(String args[])
	{
	 Scanner sc=new Scanner(System.in);
	 
	 try
	 {
		 System.out.println("Enter Name:");
		 String name=sc.nextLine();
		 
		 System.out.println("Enter Marks:");
		 int marks=sc.nextInt();
	 
		 
		 if(marks < 0 || marks >100)
		 {
             throw new Exception("Invalid Marks! Marks should be between 0 and 100.");

		 }
		 System.out.println("Student Name:"+name);
			
		 if(marks > 90)
		 {
			 System.out.println("Grade A+");
		 }
		 
		 else if(marks >80)
		 {
			 System.out.println("Grade A");
		 }
		 
		 else if(marks >70)
		 {
			 System.out.println("Grade B");
		 }
		 
		 else if(marks >60)
		 {
			 System.out.println("Grade C");
		 }
		 
		 else
		 {
			 System.out.println("Fail");
		 }
	   }
	 
		 catch(Exception e)
		 {
	            System.out.println(e.getMessage());

		 }
		 finally 
		 {
	            System.out.println("Program Ended Successfully.");
	            sc.close();
		 }
	 
	
	}
}
	

