package javaarrayeg;

public class eoindexarray
{
    public static void main(String args[])
    {
        int[] a = {10, 20, 30, 40, 50};

        int[] even = new int[a.length];
        int[] odd = new int[a.length];

        int e = 0, o = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (i % 2 == 0)
            {
                even[e] = a[i];
                e++;
            }
            else
            {
                odd[o] = a[i];
                o++;
            }
        }

        System.out.println("Even Index Array:");

        for (int i = 0; i < e; i++)
        {
            System.out.println(even[i]);
        }

        System.out.println("Odd Index Array:");

        for (int i = 0; i < o; i++)
        {
            System.out.println(odd[i]);
        }
    }
}