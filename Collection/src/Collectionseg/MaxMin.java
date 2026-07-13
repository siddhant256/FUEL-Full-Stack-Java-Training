package Collectionseg;
import java.util.ArrayList;

public class MaxMin 
{
 public static void main(String aggs[])
 {
	 ArrayList <Integer> l=new ArrayList<>();
	 l.add(90);
	 l.add(40);
	 l.add(20);
	 l.add(99);
	 
	 int min=l.get(0);
	 int max=l.get(0);
	 
	 for(int i=0;i<l.size();i++)
	 {
		 if(l.get(i) < min)
         {
             min = l.get(i);
         }
		 if(l.get(i) > max)
         {
             max= l.get(i);
         }
			 
	 }
	 
	 	System.out.println("Array List : "+l);

		 System.out.println("Maximin : "+max);
		 System.out.println("Minimum : "+min);

 }
}
