package pratice;

public class dowhilerev {

    public static void main(String args[]) {

        int no = 4562261;

        do {

            int d = no % 10;

            if (d % 2 == 0) {
                System.out.println(d);
            }

            no = no / 10;

        } while (no > 0);
    }
}