package problems;

public class newegtrapping {


	    public static void main(String[] args) {

	        int[] a = {4, 2, 0, 1, 2, 5};

	        int n = a.length;

	        // Left Max Array
	        int[] leftMax = new int[n];
	        int lmax = a[0];

	        for (int i = 0; i < n; i++) {
	            if (a[i] > lmax) {
	                lmax = a[i];
	            }
	            leftMax[i] = lmax;
	        }

	        // Right Max Array
	        int[] rightMax = new int[n];
	        int rmax = a[n - 1];

	        for (int i = n - 1; i >= 0; i--) {
	            if (a[i] > rmax) {
	                rmax = a[i];
	            }
	            rightMax[i] = rmax;
	        }

	        // Print Left Max Array
	        System.out.println("Left Max Array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(leftMax[i] + " ");
	        }

	        System.out.println();

	        // Print Right Max Array
	        System.out.println("Right Max Array:");
	        for (int i = 0; i < n; i++) {
	            System.out.print(rightMax[i] + " ");
	        }

	        System.out.println();

	        // Calculate Total Water
	        int totalWater = 0;

	        for (int i = 0; i < n; i++) {
	            int water = Math.min(leftMax[i], rightMax[i]) - a[i];
	            totalWater += water;
	        }

	        System.out.println("Total Water = " + totalWater);
	    }
	}

