package polymorphismeg;

 class Overloading
 {
   void  add(int a,int b)
{
System.out.println("Addition :" +(a+b));

}
 


	 void  add(float  a,float b)
	 {
	 System.out.println("Addition :" +(a+b));

	 }

 
	 void  add(double  a,double b)
	 {
	 System.out.println("Addition :" +(a+b));

	 }
 
	 void  add(long  a,long b)
	 {
	 System.out.println("Addition :" +(a+b));

	 }
 

	public static void main(String args[])
	{
		 Overloading o=new Overloading();
		 o.add(10, 10);
		 o.add(10f, 200f);
		 o.add(11.11, 22.00);
		 o.add(111.00,234);
	}
 }
 
 
 
