
/**
 * This class classifies various triangle types
 *
 * @author Caleb Wang
 * @version September 29, 2022
 */
public class TriangleTypes
{
    // returns true if this is an Equilateral triangle, false if not
    public static boolean isEquilateral(int a, int b, int c)
    {
        if(a == b && b == c)   
        {
            return true;
        }
        else 
        return false;
    }

    // returns true if this is an Isoceles triangle, false if not
    public static boolean isIsoceles(int a, int b, int c)
    {
        return(a == b || b ==c || c ==a);
    }

    // returns true if this is a Scalene triangle, false if not
    public static boolean isScalene(int a, int b, int c)
    {
        if(a != b && b != c && c != a)
        {
            return true;
        }
        return false;
    }

    // returns true if this is a Right triangle, false if not
    public static boolean isRight(int a, int b, int c)
    {
        if (a > b && a > c)
        {
            if ((b*b) + (c*c) ==(a*a))
            {
              return true;
            }
            return false;
        }
        else if (c > a && c >b)
        {
            if ((a*a) + (b*b) == (c*c))
            {
                return true;
            }
            return false;
        }
        else if (b > a && b > c)
        {
            if ((a*a) + (c*c) == (b*b))
            {
                return true;
            }
            return false;
        }
        return false;
    }


    // returns true if a triangle is possible with the given sides, false if not
    public static boolean isTriangle(int a, int b, int c)
    {
        if (a > b && a > c)
        {
            if (b + c > a)
            {
                return true;
            }
            return false;
        }    
        
        else if (b > a && b > c)
        {
            if (a + c > b)
            {
                return true;
            }
            return false;
        }
        else if (c > a && c > b)
        {
            if (a + b > c)
            {
                return true;
            }
            return false;
        }
        return false;
    }
}
