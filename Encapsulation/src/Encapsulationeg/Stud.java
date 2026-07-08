package Encapsulationeg;

 class Student
 {
private int Roll_no;
private String name;
private String  mobile_no;
private String  email;
private String collegename;
 

public void setValue(int Roll_no,String name, String mobile_no, 
		String email,String collegename)
{
	this.Roll_no=Roll_no;
	this.name=name;
	this.mobile_no=mobile_no;
	this.email=email;
	this.collegename=collegename;
}

 
 public int getr()
 {
	 return Roll_no;
 }
 
 public String getn()
 {
	 return name;
 }
 
 public String getmn()
 {
	 return mobile_no;
 }
 
 
 public String gete()
 {
	 return email;
 }
 
 
 public String getcn()
 {
	 return collegename;
 }
 }
 class Stud
 {
	 public static void main(String args[])
	 {
		 
		 Student a=new Student();
		    a.setValue(101 ,"Siddhant","8237900499","siddm@gmail.com","SVPM COE's Malegoan(BK)");
			
			System.out.println("Roll_NO:"+a.getr());
			System.out.println("Name:"+a.getn());
			System.out.println("Mobile_NO:"+a.getmn());
			System.out.println("Email ID:"+a.gete());
			System.out.println("College Name:"+a.getcn());
			
	 }
 }
 
 
 
 
