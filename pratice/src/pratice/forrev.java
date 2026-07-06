package pratice;

public class forrev {
	public static void main(String args[])
	{
		int no=4562261;
		 for (; no > 0; no = no / 10)
		 {

	            int d = no % 10;

	            if (d % 2 == 0)
	            {
	                System.out.println(d);
	            }
	            
	}}
}

