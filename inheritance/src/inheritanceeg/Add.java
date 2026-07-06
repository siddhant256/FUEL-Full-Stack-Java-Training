package inheritanceeg;

 class S2neg 
{
	
	
int a=10;
int b=20;
	
}

class Bq extends S2neg
{
	void add()
	{
		int c=a+b;
		System.out.println("Addition:" + c);
	}
}

 class Add
 {
	 
 public static void main(String arg[])
 {
	 Bq b=new Bq();
	 b.add();
 }
			
 }