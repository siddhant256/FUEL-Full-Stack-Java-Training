package inheritanceeg;

 interface  A0
{
	void show();
	
}
 interface B
 {
	 void show1(); 
 }
 class D
 {
	 void display()
	 {
		 System.out.println("Extends Class:");
	 }
 }
 class C extends D implements A0,B
 {
	 public void show()
	 {
		 System.out.println("The interface 1");
	 }
	 
	 public void show1()
	 {
		 System.out.println("The interface 2");
	 }
 }
 
 
 
 public class Interface
 {
	 public static void main(String args[])
	 {
		 C c=new C();
		 c.show();
		 c.show1();
		 c.display();
		 
	 }
 }



