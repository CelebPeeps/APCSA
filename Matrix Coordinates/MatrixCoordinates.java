
/**
 * This class creates a String representation of a matrix of (x,y) coordinates
 * of 'rows' rows and 'cols' columns, both in normal order, and reverse order.
 *
 * @author (your name)
 * @version (today's date)
 */
public class MatrixCoordinates
{
    public static String normalOrder(int rows, int cols)
    {
        String result = "";
        // these nested loops go forwards, starting with the first row and column
        for(int row = 0; row < rows; row++)// put your rows loop here   
        {
            for(int col = 0; col < cols; col++)  // put your columns loop here
            {
                result += "(" + row + "," + col + ")";
             }
            result += "\n";
        }
        return result;
    }
    
    public static String reverseOrder(int rows, int cols)
    {
        String result = "";
        // these nested loops go backwards, starting with the last row and column
        for(int row = rows - 1; row >= 0; row--)  // put your rows loop here   
        {
            for(int col = cols - 1; col >= 0; col--){  // put your columns loop here
            
                result += "(" + row + "," + col + ")";
             }
            result += "\n";
        }
        return result;
    }
}


