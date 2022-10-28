
/**
 * This class calculates the circumference, surface area, and volumn 
 * of a sphere of the provided radius.
 *
 * @author  (your name)
 * @version (today's date)
 */
public class Sphere
{
    public static double circumference(int radius)
    {
        return radius * 2 * Math.PI; // replace with your calculation
    }
    
    public static double surfaceArea(int radius)
    {
        return 4 * Math.PI * (radius * radius); // replace with your calculation
    }
    
    public static double volume(int radius)
    {
        return (4/3d) * Math.PI * (radius * radius * radius);// replace with your calculation
    }
}