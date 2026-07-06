package conecpts;

public class Book 
{
	Book()
	{
		System.out.println("Default Constructor:");
	}
	
	Book(int no)
	{
		System.out.println("Parameteries Constructor:"+no);

	}
	Book(int no,String name)
	{
		System.out.println("Parameteries Constructor:"+no +name);
	}
	
	public static void main(String args[])
	{
		Book b=new Book();
		Book b1=new Book(25);
		Book b2=new Book(25,"\n SIDDHANT");


		
	}

}
