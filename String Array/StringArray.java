
/**
 * Write a description of class StringArray here.
 *
 * @author  (your name here)
 * @version (today's date)
 */
public class StringArray
{
    private String[] a; 
    
    public StringArray(String[] array)
    {
         a = array;
    }
    
    
    public static int numInArray (String[] a, String w)
    {
        int count = 0;
        
        for (int i = 0; i < a.length; i++) {
            if (w.equals(a[i])) {
                count++;
            }
        }
        return count;
    }
    
    public static String listAllNums(String[] a, String[] b)
    {
        String s = "";
        for (int i = 0; i < a.length; i++) {
            s += a[i] + ": " + numInArray(b, a[i]) + "\n";
        }
        return s;
    }
    
}
