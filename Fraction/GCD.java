
/**
 * Write a description of class GCD here.
 *
 * @author (your name)
 * @version (today's date)
 */
public class GCD
{
    public static void main(String [] args)
    {
        int n0 = 48, n1 = 156;
        while (n1 != 0)
        {
            int remainder = n0 % n1;
            n0 = n1;
            n1 = remainder;
        }
        System.out.print(n0);
    }
}
