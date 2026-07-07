package Abstractioneg;
import java.util.Scanner;
abstract  class Exam 
{

	
	String Studentname;
	int rollno;
	int marks;
	
	Exam(String Studentname,int rollno,int marks)
	{
		this.Studentname=Studentname;
		this.rollno=rollno;
		this.marks=marks;
	}
	public abstract  void calculateresult();
	public abstract  void Displaygrade();
	


}
class EngineeringExam extends Exam
{
	EngineeringExam(String Studentname,int rollno,int marks)
	{
		super(Studentname,rollno,marks);
	}
		
	public void calculateresult()
	{
	if(marks>40)
	{
		System.out.println("Pass!");
	}
	else
	{
		System.out.println("Fail!");
	}
	}
	
	
	public void Displaygrade()
	{
		if(marks>=85)
		{
			System.out.println("Grade:A");
		}
		else if(marks>=60)
		{
			System.out.println("Grade:B");
		}
		else if(marks>=50)
		{
			System.out.println("Grade:C");
		}
		else
		{
			System.out.println("!!Fail!! ");

		}
	
	}

	}

class MedicalExam extends Exam
{
	MedicalExam(String Studentname,int rollno,int marks)
	{
	super(Studentname,rollno,marks);
	}
	
	public void calculateresult()
	{
	if(marks>40)
	{
		System.out.println("Pass!");
	}
	else
	{
		System.out.println("Fail!");
	}
	}

	
	 public void Displaygrade()
	{
		if(marks>=85)
		{
			System.out.println("Grade:A");
		}
		else if(marks>=60)
		{
			System.out.println("Grade:B");
		}
		else if(marks>=50)
		{
			System.out.println("Grade:C");
		}
		else
		{
			System.out.println("!!Fail!! ");

		}	
}
}
	
	public class Abseg2
	{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			
			
			System.out.println("Enter Name:");
			String name=sc.nextLine();
		
			System.out.println("Enter RollNo:");
			int roll=sc.nextInt();
			
			System.out.println("Enter Marks:");
			int marks=sc.nextInt();
			
			System.out.println("1.Engineering Exam");
			System.out.println("1.Medical Exam");
			
			System.out.println("Enter Choice:");
			int choice=sc.nextInt();
			
			Exam e;
			
			if(choice ==1)
			{
				e= new EngineeringExam(name,roll,marks);
			}
			
			else
			{
				e= new MedicalExam(name,roll,marks);
			}
			
			System.out.println("Student Name:"+name);
			System.out.println("Student RollNo:"+roll);
			System.out.println("Student Marks:"+marks);
			e.calculateresult();
			e.Displaygrade();
			sc.close();
			
		}
	}
