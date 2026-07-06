package javaarrayeg;

public class doubleno 
{
	public static void main  (String args[])
	{
	
	int a[]={0,1,1,10,10,19,15};
	int dpa[]=new int[a.length];
	
	System.out.println("Duplicate Elements Are:");
	for(int i=0;i<7;i++)
	{
		for(int j=0;j<i;j++)
		{
			if(a[i]==a[j])
			{
			System.out.println(a[i]);
			dpa[i]=a[i];
			}
	}
		
	}
	for(int i=1;i<dpa.length;i++)
	{
		if(dpa[i]!=0)
		{
	System.out.println("Elements Are:"+dpa[i]);
		}
	}
	}
}
