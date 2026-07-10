package Example;

public class Nestedtry {
	    public static void main(String args[])
	    {
	        try
	        {
	            System.out.println("Outer Try");

	            try
	            {
	                int a = 10 / 0;
	                System.out.println(a);
	            }
	            catch (ArithmeticException e)
	            {
	                System.out.println("Inner Catch");
	            }

	            System.out.println("After Inner Try");
	        }
	        catch (Exception e)
	        {
	            System.out.println("Outer Catch");
	        }

	        System.out.println("Program End");
	    }
	}

