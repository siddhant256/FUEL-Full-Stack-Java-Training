package pratice;

public class ptnhw 
{
	    public static void main(String[] args) {

	        char ch = 'A';

	        for (int i = 1; i <= 4; i++) {

	            for (int j = 1; j <= i; j++) {
	                System.out.print(ch);
	                ch++;
	            }

	            System.out.println();
	        }

	        for (int i = 3; i >= 1; i--) {

	            for (int j = 1; j <= i; j++) {
	                System.out.print(ch);
	                ch++;
	            }

	            System.out.println();
	        }
	    }
	}


