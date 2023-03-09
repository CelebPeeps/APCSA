// A Grid is a rectangular 2D grid with a specific number of rows and columns.
public class Grid
{
    private Block[][] array;  // the array storing the grid elements

    // Constructs an empty Grid with the given dimensions.
    // Precondition:  rows > 0 and cols > 0.
    public Grid(int rows, int cols)
    {
        array = new Block[rows][cols];
    }

    // returns the number of rows
    public int getNumRows()
    {
        return array.length;
    }

    // returns the number of columns
    public int getNumCols()
    {
        return array[0].length;
    }

    // returns the block at location (or null if the location is unoccupied)
    // precondition:  location is valid in this grid
    public Block get(Location location)
    {
        return array[location.getRow()][location.getCol()];
    }

    // puts block at location in this grid and returns the block previously at that location 
    // (or null if the location is unoccupied)
    // precondition:  location is valid in this grid
    public Block put(Location location, Block block)
    {        
        Block previousBlock = get(location);
        array[location.getRow()][location.getCol()] = block;
        return previousBlock;
    }

    // returns true if location is valid in this grid, false otherwise
    // precondition:  location is not null
    public boolean isValid(Location location)
    {
        if (location.getRow() >= 0 && location.getRow() < getNumRows())
        {
            if (location.getCol() >= 0 && location.getCol() < getNumCols())
            {
                return true;
            }
        }
        return false;
    }

    // removes the block at location from this grid and returns the block that was removed 
    // (or null if the location is unoccupied
    // precondition: location is valid in this grid
    public Block remove(Location location)
    {
        Block block = get(location);
        put(location, null);
        return block;
    }
}