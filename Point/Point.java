
/**
 * Write a description of class Point here.
 *
 * Caleb Wang
 * 11/10/22
 */
public class Point
{
    private int Xcoordinate, Ycoordinate;
    
    public Point()
    {
        Xcoordinate = 0;
        Ycoordinate = 0;
    }
    
    public Point(int x, int y)
    {
        Xcoordinate = x;
        Ycoordinate = y;
    }
    
    public void setPoint (int x, int y)
    {
        Xcoordinate = x;
        Ycoordinate = y;
    }
    
    public int getX()
    {
        return Xcoordinate;
    }
    
    public int getY()
    {
        return Ycoordinate;
    }
    
    public String toString()
    {
        return "(" + getX() + "," + getY() + ")";
    }
    
    public double getDistanceFromOrigin()
    {
        double X = Xcoordinate;
        double Y = Ycoordinate;
        return Math.sqrt((X * X) + (Y * Y));
    }
}
