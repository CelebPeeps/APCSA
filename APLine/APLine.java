
/**
 * Write a description of class APLine here.
 *
 * Caleb Wang
 * 11/7/2022
 */
public class APLine
{
    private int a, b, c;
    public APLine(int a, int b, int c)
    {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public double getSlope()
    {
        return (a * -1.0) / b;
    }
    
    public boolean isOnLine(int x, int y)
    {
        return a * x + b * y + c == 0;
    }
}
