package inheritanceeg;

 class Parent1 
 {
 void disp()
 {
	 System.out.println(" Parent Class:");
	 
 }
}
 
 class Child1 extends Parent1
 {
 void disp1()
 {
	 System.out.println(" Child:1 Class:");
	 
 }
}
 
 class Child2 extends Parent1
 {
 void disp2()
 {
	 System.out.println(" Child:2 Class:");
	 
 }
}
 
 class hierchal1
 {
	 public static void main(String args[])
	 {
		 Child1 c=new Child1();
		 Child2 c2=new Child2();
		 c.disp();
		 c.disp1();
		 c2.disp();
		 c2.disp2();
	 }
 }

