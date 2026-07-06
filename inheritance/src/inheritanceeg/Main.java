package inheritanceeg;

 class A 
{

	void display()
	{
		System.out.println("CLASS A: PARENT CLASS ");
	}
	
}
	class Bs extends A
	{
		void sum()
		{
			System.out.println("CLASS B: CHILD CLASS");

		}
	}
	
	class Main
	{
		public static void main(String args[])
		{
			Bs b= new Bs ();
			b.display();
			b.sum();
		}
	}



