package Example;

public class Ud
{
    public static void main(String args[])
    {
        int age = 16;

        try
        {
            if (age < 18)
            {
                throw new Exception("Age is not eligible.");
            }

            System.out.println("Eligible");
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}