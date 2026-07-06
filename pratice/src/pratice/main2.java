package pratice;

public class main2 {

    public static void main(String[] args) {
        S2 s = new S2();
        s.sum();
        s.sum();
    }
}

class S2 {
    static int x = 10;
    static int y = 18;

    void sum() {
        int y = 10; // local variable
        ++x;
        ++y;
        System.out.println(x + y);
    }
}