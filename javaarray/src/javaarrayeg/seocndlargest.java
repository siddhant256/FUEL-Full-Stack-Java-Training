package javaarrayeg;

public class seocndlargest
{
    public static void main(String args[])
    {
        int[] a = {10, 12, 100, 200, 215, 325};

        int max = 0;
        int slargest = 0;

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
             	slargest = max;
                max = a[i];
           

            }
            else if (a[i] > slargest)
            {
                slargest = a[i];
            }
        }

        System.out.println("Largest Number = " + max);
        System.out.println("Second Largest Number = " + slargest);
    }
}