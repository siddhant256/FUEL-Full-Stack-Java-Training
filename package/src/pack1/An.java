package pack1;

class An {

    void fun() {
        System.out.println("Hello Buddy");
    }
}

class B extends An {

    public static void main(String[] args) {

        B obj = new B();
        obj.fun();
    }
}