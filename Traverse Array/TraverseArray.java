
/**
 * This class creates a String representation of an array of integer values
 * both in normal order, and reverse order, plus the sum of elements of the array.
 *
 * @author Mr. B!
 * @version October 27, 2022
 */
public class TraverseArray
{
    /**
     * Traverses array in normal order (from beginning index to end), appending
     * each integer value to the String to be returned. Each integer value in
     * the String is followed by a single blank space (to separate each value).
     */
    public static String normalOrder(int[] array)
    {
        String result = "";
        for(int i = 0; i < array.length; i++)
        {
            result += array[i] + " ";
        }
        return result;  // replace this line
    }

    /**
     * Traverses array in reverse order (from end index to beginning), appending
     * each integer value to the String to be returned. Each integer value in
     * the String is followed by a single blank space (to separate each value).
     */
    public static String reverseOrder(int[] array)
    {
        String result = "";
        for(int i = array.length - 1; i >= 0; i--)
        {
          result += array[i] + " ";
        }
        return result;  // replace this line
    }

    /**
     * Traverses array, adding up each integer value, and returning the total.
     */
    public static int sum(int[] array)
    {
        int result = 0;
        for(int i = 0; i < array.length; i++)
        {
            result += array[i];
        }
        return result;  // replace this line
    }
}
