import java.util.Scanner;
/**
 * This class 
 * 
 * @author Mr. B!
 * @version October 17, 2013
 */
public class FibonacciDriver
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the amazing Fibonacci number calculator");
        while(true)
        {
            System.out.print("\nEnter a positive integer or -1 to quit: ");
            int n = reader.nextInt();
            if(n == -1)
                break;
            else if (n > 1)
            {
                System.out.println("Fibonacci number " + n + " is " + Fibonacci.calculate(n));
            }
        }
    }
    
}
