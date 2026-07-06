package pratice;

public class main {
	public static void main(String []args)
	{
		S1 s=new S1();
		s.sum();
		s.sum();
	}

}
class S1
{
	int x=10;
	void sum()
	{
		int y=10;
		++x;
		++y;
		System.out.println(x+y);
		
	}
}
