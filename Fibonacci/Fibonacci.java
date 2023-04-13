
/**
 * This class represents a Fibonacci function
 * 
 * @author 
 * @version 
 */
public class Fibonacci
{
    // complete the following method
    public static int calculate(int n)
    {
        int fibonacci = 1;
        int a = 1;
        int b = 1;
        int count = 3;
        while (count <= n)
        {
            fibonacci = a + b;
            a = b;
            b = fibonacci;
            count++;
        }
        return fibonacci;  // replace this with your code
    }
}
