package pratice;

public class digstr {
	    public static void main(String[] args) {

	        // Upper Half
	        for (int i = 1; i <= 5; i++) {

	            // Print Spaces
	            for (int j = 1; j <= 5 - i; j++) {
	                System.out.print(" ");
	            }

	            // Print Stars
	            if (i == 1) {
	                System.out.print("*");
	            } else {
	                for (int k = 1; k <= 2 * i; k++) {
	                    System.out.print("*");
	                }
	            }

	            System.out.println();
	        }

	        // Lower Half
	        for (int i = 4; i >= 1; i--) {

	            // Print Spaces
	            for (int j = 1; j <= 5 - i; j++) {
	                System.out.print(" ");
	            }

	            // Print Stars
	            if (i == 1) {
	                System.out.print("*");
	            } else {
	                for (int k = 1; k <= 2 * i; k++) {
	                    System.out.print("*");
	                }
	            }

	            System.out.println();
	        }
	    }
	}


