package inheritance7_7_26eg;

 class Person
 {
	 void info(String name,int age)
	 {
		  //name="Siddhant";
		 //age=20;
		 System.out.println("Name:"+name);
		 System.out.println("Age:"+age);

		 
	 }

}
 class Employee extends Person
 {
	 void empinfo(int empid,String Dept)
	 {
		 //empid=101;
		 //Dept="Custom";
		 System.out.println("EMP ID:"+empid);
		 System.out.println("Department:"+Dept);
		 
	 }
 }
 
 class Manger extends Employee
 {
	 void mnginfo(String mnglevel )
	 {
		 //mnglevel="Senior";
		 System.out.println("Manager Position:"+mnglevel);
	 }
 }
 
 class Multilevel
 {
	 public static void main(String args[])
	 {
		 Manger m=new Manger();
		 m.info("Siddhant",21);
		 m.empinfo(101,"Custom");
		 m.mnginfo("Senoir");
		 
	 }
 }
