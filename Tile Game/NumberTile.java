/**
 * This class represents a square number tile with an integer value
 * located on the top, right, bottom, and left sides of the tile
 * 
 * @author Tom Bredemeier
 * @version March 9, 2011
 */
public class NumberTile
{
    private int top, right, bottom, left;

    /**
     * Constructor for objects of class NumberTile
     */
    public NumberTile(int t, int r, int b, int l)
    {
        top = t;    // top number
        right = r;  // right number
        bottom = b; // bottom number
        left = l;   // left number
    }

    /**
     * Rotates the tile 90 degrees clockwise
     */
    public void rotate()
    {
        int temp = top;
        top = left;
        left = bottom;
        bottom = right;
        right = temp;
    }

    /**
     * @return value at left edge of tile
     */
    public int getLeft()
    {
        return left;
    }
    
    /**
     * @return value at right edge of tile
     */    
    public int getRight()
    {
        return right;
    }
}
