package inheritanceeg;

class A22 
{
 void display()
 {
	 System.out.println("Parent Class A:");
 }

}

 class B22 extends A22 
{
 void display1()
 {
	 System.out.println("SubClass B:");
 }

}
 
 class C22 extends B22 
{
 void display3()
 {
	 System.out.println("SubClass C:");
 }

}
 
 class Multilevel
 {
	 public static void main(String args[])
	 {
		 C22 c=new C22();
		 c.display();
		 c.display1();
		 c.display3();


	 }
 }