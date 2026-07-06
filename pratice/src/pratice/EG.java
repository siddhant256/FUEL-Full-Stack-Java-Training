package pratice;

public class EG {

    int a = 10;
    int b = 20;

    void add() {
        int c = 10;

        System.out.println(a + b + c);
        b = 30;
        a++;
        b++;
        
    }
    

    public static void main(String args[]) {

        EG obj = new EG();

        obj.add();
        obj.add();
        obj.add();
        obj.add();
    }
}