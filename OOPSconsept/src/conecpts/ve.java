package conecpts;

public class ve 
{
	void display(String name,int brandno,String color,String brand)
	{
		System.out.println("\n Name:"+name + "\n Brand No:" + brandno + 
				"\n Colour:"+ color + "\n Brand:"+ brand );
		
	}
	public static void main(String args[])
	{
		ve n= new ve();
		
		System.out.println("\n Car Information Company No:1");
		
		n.display("Rollce Royce ",2061,"White","RR");
		
		ve n1=new ve();
		
		System.out.println("\n Car Information Company No:2");
		
		n1.display("Hyundai ",2061,"White","CREATA");
		
		ve n3=new ve();
		
		System.out.println("\n Car Information Company No:3");
		
		n3.display("Maruti Suzeki ",2061,"White","SWIFT");
		

		
		
		
	}

}
