package javaarrayeg;

public class remduplicateele
{
    public static void main(String args[])
    {
        int a[] = {0, 1, 1, 10, 10, 19, 15};

        System.out.println("Duplicate Elements:");

        for (int i = 0; i < a.length; i++)
        {
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] == a[j])
                {
                    System.out.println(a[i]);
                }
            }
        }

        System.out.println("Array Without Duplicates:");

        for (int i = 0; i < a.length; i++)
        {
            boolean duplicate = false;

            for (int j = 0; j < i; j++)
            {
                if (a[i] == a[j])
                {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate)
            {
                System.out.println(a[i]);
            }
        }
    }
}