package inheritanceeg;

class Base{
	int a,b,c,d;
	void mul(int a,int b) {
		this.a=a;
		this.b=b;	
		System.out.println("Multiplication A * B ="+(a*b));
	}
	void div(int c,int d) {
		this.c=c;
		this.d=d;
		System.out.println("Division C / D ="+(c/d));
	}
}
class newclass extends Base{
	void add() {
		System.out.println("Addition A + B ="+(a+b));
	}
	void sub() {
		System.out.println("Substrsction A - B ="+(a-b));

	}
}
public class Muladdsubdiv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		newclass n = new newclass();
		n.mul(10,20);
		n.div(10, 5);
		n.add();
		n.sub();
	}

}