package javaarrayeg;

public class evenarray
{
    public static void main(String args[])
    {
        int[] a = {10, 21, 30, 45, 50, 67, 80};

        System.out.println("Even Numbers:");

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 == 0)
            {
                System.out.println(a[i]);
            }
        }

        System.out.println("Odd Numbers:");

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] % 2 != 0)
            {
                System.out.println(a[i]);
            }
        }
    }
}