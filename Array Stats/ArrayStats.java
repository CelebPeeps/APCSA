
/**
 * Write a description of class ArrayStats here.
 *
 * @author  (your name here)
 * @version (today's date)
 */
public class ArrayStats
{
    public static double findMean(int[] a)
    {
        int sum = 0;
        for (int i = 0; i < a.length; i++)
        {
            sum += a[i];
        }
        
        return (double) sum/a.length;
    }
    
    public static int findMedian(int[] a)
    {
        return a[a.length/2];
    }
    
    public static int findMode(int[] a)
    {
        int counter = 0;
        int counter2 = 0;
        int mode = 0;
        for (int i = 0; i < a.length; i++)
        {
            if (i+1 != a.length && a[i] == a[i+1])
            {
                counter++;
            }
            else 
            {
                if(counter >= counter2)
                {
                counter2 = counter;
                mode = a[i];
                counter = 0;
                }
                counter = 0;
            }
        }
        return mode;
    }
}

