package pratice;

public class reveven {

    public static void main(String args[]) {

        int no = 4562261;

        while (no > 0) {

            int d = no % 10;

            if (d % 2 == 0) {
                System.out.println(d);
            }

            no = no / 10;
        }
    }
}