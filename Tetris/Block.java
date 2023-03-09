import java.awt.Color;

/**
 * Block class to be completed for Tetris project
 * 
 * @author  (your name) 
 * @version (a version number or a date)
 */
public class Block
{
    private Grid grid;          // Blocks know what grid they are in
    private Location location;  // Blocks know where they are in the grid
    private Color color;        // Blocks know their color

    // constructs a generic Block
    public Block()
    {
        color = null;
        grid = null;
        location = null;
    }

    // gets the color of this block
    public Color getColor()
    {
        return color;    // replace this line
    }

    //sets the color of this block to newColor.
    public void setColor(Color newColor)
    {
        color = newColor; // finish this method
    }

    // gets the grid of this block, or null if this block is not contained in a grid
    public Grid getGrid()
    {
        return grid;      // replace this line
    }

    //gets the location of this block, or null if this block is not contained in a grid
    public Location getLocation()
    {
        return location;      // replace this line
    }

    // removes this block from its grid
    // Precondition: this block is contained in a grid
    public void removeSelfFromGrid()
    {
        // finish this method as follows:
        //      First, using the grid object, call the remove method (pass it this location)
        //      Second, set this location to null
        //      Third, set this grid to null
        
        grid.remove(location);
        location = null;
        grid = null;
    }

    // ************ the methods below are already completed for you  ****************************
    
    // puts this block into location of grid
    // if there is another block at location, it is removed
    // precondition:  (1) this block is not contained in a grid
    //                (2) location is valid in grid
    public void putSelfInGrid(Grid grid, Location location)
    {
        Block block = grid.get(location);
        if (block != null)
            block.removeSelfFromGrid();
        grid.put(location, this);
        this.grid = grid;
        this.location = location;
    }

    // moves this block to newLocation
    // if there is another block at newLocation, it is removed
    // Precondition:  (1) this block is contained in a grid
    //                (2) newLocation is valid in the grid of this block
    public void moveTo(Location newLocation)
    {
        grid.remove(location);
        Block other = grid.get(newLocation);
        if (other != null)
            other.removeSelfFromGrid();
        location = newLocation;
        grid.put(location,this);
    }

    // returns a string with the location and color of this block
    public String toString()
    {
        return "Block[location=" + location + ",color=" + color + "]";
    }
}