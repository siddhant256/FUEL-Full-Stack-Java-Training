package pratice;

public class stud {

    public static void main(String args[]) {

        studn s = new studn();
        studn s1 = new studn();

        s.add();
        s1.add();
        s.add();
        s1.add();
    }
}

class studn {
    static int b = 20;
    int a = 10;

    void add() {
        int c = 30;
        System.out.println(a + b+c);
        a++;
        b++;
        c++;
    }
}