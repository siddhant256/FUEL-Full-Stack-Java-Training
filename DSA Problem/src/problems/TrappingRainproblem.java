package problems;

public class TrappingRainproblem {

    public static void main(String args[]) {

        int h[] = {3, 0, 2, 0, 4};

        int n = h.length;
        int water = 0;

        for (int i = 1; i < n - 1; i++) {

            int leftmax = h[i];

            for (int j = 0; j <= i; j++) {
                leftmax = Math.max(leftmax, h[j]);
            }

            int rightmax = h[i];

            for (int j = i; j < n; j++) {
                rightmax = Math.max(rightmax, h[j]);
            }

            water += Math.min(leftmax, rightmax) - h[i];
        }

        System.out.println("Total Water = " + water);
    }
}