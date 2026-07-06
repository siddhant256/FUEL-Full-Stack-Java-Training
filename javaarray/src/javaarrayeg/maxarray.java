package javaarrayeg;

public class maxarray
{
    public static void main(String args[])
    {
        int[] a = {10, 12, 100, 201, 215, 325};

        int max = a[0];

        for (int i = 0; i < a.length; i++)
        {
            if (a[i] > max)
            {
                max = a[i];
            }
        }

        System.out.println("Max Number: " + max);
    }
}