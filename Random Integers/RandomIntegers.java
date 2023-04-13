
/**
 * This class represents a variety of methods that generate random integer values
 * 
 * @author 
 * @version 
 */
public class RandomIntegers
{
    /* Returns a random integer from 0 to n - 1
     * @param n the upper limit (exclusive)
     * Precondition: n > 0
     * @return a random integer from 0 to n - 1
     */
    public static int randomInteger(int n)
    {
        return (int)(Math.random() * n); // replace this line
    }
    
    /* Returns a random integer from 'start' to 'end' (inclusive)
     * @param start the lower limit of random numbers (inclusive)
     * @param end the upper limit of random numbers (inclusive)
     * Precondition: 0 <= start <= end
     * @return a random integer from 'start' to 'end' (inclusive)
     */
    public static int randomInteger(int start, int end)
    {
        return (int)(Math.random() * ((end - start) + 1) + start); // replace this line
    }
    
    /* Returns one of 'count' integers spaced 'span' units apart beginning at 'start'.
     * For example, the call randomInteger(5, 20, 10) would randomly generate
     * one of the following integers [10, 30, 50, 70, 90]. In this example
     * there are a total five possibilities (count), 
     * spaced 20 numbers apart (span),
     * beginning at (start).
     * @param count the amount of possible random numbers
     * @param span how far apart are each possible random number
     * @param start the lower limit of random numbers (inclusive)
     * Precondition: count > 0, span > 0, and start >= 0
     * @return one of 'count' integers spaced 'span' units apart beginning at 'start'
     */
    public static int randomInteger(int count, int span, int start)
    {  
        return (int)(Math.random() * count) * span + start;
    }
}

