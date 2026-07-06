package javaarrayeg;

public class minarry {
	    public static void main(String args[])
	    {
	        int[] a = {10, 12, 100, 201, 215, 325};

	        int min = a[0];

	        for (int i = 0; i < a.length; i++)
	        {
	            if (a[i] < min)
	            {
	                min = a[i];
	            }
	        }

	        System.out.println("Min Number: " + min);
	    }
	}


