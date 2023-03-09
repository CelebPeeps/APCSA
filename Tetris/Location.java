/**
 * Write a description of class Location here.
 *
 * @author  (your name here)
 * @version (today's date)
 */
public class Location
{
    private int Row;
    private int Col;
    
    public Location (int row, int col) {
        Row = row;
        Col = col;
    }
    
    public int getRow() {
        return Row;
    }
    
    public int getCol() {
        return Col;
    }
    
    public boolean equals(Location other) {
        return other.getRow() == Row && other.getCol() == Col;
    }
    
    public String toString () {
        return Row + " " + Col;
    }
}
