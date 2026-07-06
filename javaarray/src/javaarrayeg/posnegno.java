package javaarrayeg;

public class posnegno
{
    public static void main(String args[])
    {
        int[] a = {10, -20, 30, -40, 50, -60};

        System.out.println("Positive Numbers:");

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > 0)
            {
                System.out.println(a[i]);
            }
        }

        System.out.println("Negative Numbers:");

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] < 0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
