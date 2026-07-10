package Example;

class AdmitCardCollecting extends Exception
{
    public AdmitCardCollecting()
    {
        System.out.println("Collect Admit Card First");
    }
}

public class College
{
    public void admit() throws AdmitCardCollecting
    {
        throw new AdmitCardCollecting();
    }

    public static void main(String args[])
    {
        College obj = new College();

        try
        {
            obj.admit();
        }
        catch(AdmitCardCollecting e)
        {
            System.out.println("Exception Handled");
        }
    }
}
