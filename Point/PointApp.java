
/**
 * Write a description of class PointApp here.
 *
 * @author (your name)
 * @version (today's date)
 */
public class PointApp
{
    public static Point findFarPoint (Point point0, Point point1, Point point2)
    {
        double d0 = point0.getDistanceFromOrigin();
        double d1 = point1.getDistanceFromOrigin();
        double d2 = point2.getDistanceFromOrigin();
        
        if (d1 > d0 && d1 > d2)
        {
            return point1;
        }
        else if (d2 > d0 && d2 > d1)
        {
            return point2;
        }
        else
        {
            return point0;
        }
    }
}
