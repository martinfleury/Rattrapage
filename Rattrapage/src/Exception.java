public class Exception
{
    public static void main (String[] args)
    {
        try
        {
            System.out.println (9 / 0);
        }
        catch (ArithmeticException exception)
        {
            System.out.println ("Erreur : " + exception.getMessage());
            exception.printStackTrace();
        }
    }
}