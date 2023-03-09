import java.awt.Color;

/**
 * Tetrad class to be completed for Tetris project
 * 
 * @author  (your name) 
 * @version (a version number or a date)
 */

public class Tetrad
{
    private Block[] blocks;
    private int shape = 0;

    public Tetrad(Grid grid)
    {
        // Exercise 1.1  Insert code here to
        //                  instantiate blocks Block array (length 4)
        //                  initialize blocks array with 4 new Block objects
        blocks = new Block[4];
        for (int i = 0; i < blocks.length; i++) {
            blocks[i] = new Block();
        }
        // Exercise 1.2  Insert code here to
        //                  set shape to a random integer from 0 to 6
        shape = (int)(Math.random() * 7);
        Location[] locations = new Location[4];
        Color color;

        if(shape == 0)            // I-shaped Tetrad
        {
            color = Color.RED;              // set the color variable
            locations[0] = new Location(0, 4);   // set the block locations
            locations[1] = new Location(0, 3);
            locations[2] = new Location(0, 5);
            locations[3] = new Location(0, 6);
        }
        else if(shape == 1)      // T-shaped Tetrad
        {
            color = Color.GRAY;             // set the color variable
            locations[0] = new Location(0, 4);   // set the block locations
            locations[1] = new Location(0, 3);
            locations[2] = new Location(0, 5);
            locations[3] = new Location(1, 4);
        }
        else if(shape == 2)      // O-shaped Tetrad
        {
            color = Color.CYAN;             // set the color variable
            locations[0] = new Location(0, 4);   // set the block locations
            locations[1] = new Location(0, 5);
            locations[2] = new Location(1, 4);
            locations[3] = new Location(1, 5);
        }
        else if(shape == 3)      // L-shaped Tetrad
        {
            color = Color.YELLOW;           // set the color variable
            locations[0] = new Location(0, 4);   // set the block locations
            locations[1] = new Location(0, 3);
            locations[2] = new Location(0, 5);
            locations[3] = new Location(1, 3);
        }
        else if(shape == 4)      // J-shaped Tetrad
        {
            color = Color.MAGENTA;          // set the color variable
            locations[0] = new Location(0, 4);   // set the block locations
            locations[1] = new Location(0, 3);
            locations[2] = new Location(0, 5);
            locations[3] = new Location(1, 5);
        }
        else if(shape == 5)      // S-shaped Tetrad
        {
            color = Color.BLUE;             // set the color variable
            locations[0] = new Location(0, 4);   // set the block locations
            locations[1] = new Location(0, 5);
            locations[2] = new Location(1, 3);
            locations[3] = new Location(1, 4);
        }
        else // shape = 6        // Z-shaped Tetrad
        {
            color = Color.GREEN;            // set the color variable
            locations[0] = new Location(0, 4);   // set the block locations
            locations[1] = new Location(0, 3);
            locations[2] = new Location(1, 4);
            locations[3] = new Location(1, 5);
        }

        // Exercise 1.3  Insert code here to
        //                  loop through the blocks array to
        //                      set the color of each block
        //                  call addToLocations
        
        for (int i = 0; i < blocks.length; i++) {
            blocks[i].setColor(color);
            addToLocations(grid, locations);
        }
    }

    // Precondition:  blocks are not in any grid;
    //                blocks.length = locations.length = 4.
    // Postcondition: The locations of blocks match locations, and blocks have been put in the grid.
    private void addToLocations(Grid grid, Location[] locations)
    {
        // Exercise 1.0  Insert code here to
        //      loop through the blocks instance variable array using a standard for loop
        //          have blocks[i] call putSelfInGrid using grid and locations[i] as parameters
        for (int i = 0; i < locations.length; i++) {
            blocks[i].putSelfInGrid(grid, locations[i]);
        }
          // replace this line
    }

    // Precondition:  Blocks are in the grid.
    // Postcondition: Returns old locations of blocks;
    //                blocks have been removed from grid.
    private Location[] removeBlocks()
    {
        // Exercise 2.0    Insert code here to
        //      instantiate a new Location array locations of length 4
        //      loop through the blocks instance variable array using a standard for-loop
        //          set locations[i] to blocks[i].getLocation
        //          tell blocks[i] to removeSelfFromGrid
        //      return the locations array
        Location [] Place = new Location[4];
        
        for (int i = 0; i < Place.length; i++) {
            Place[i] = blocks[i].getLocation();
            blocks[i].removeSelfFromGrid();
        }
        return Place;
    }

    // Postcondition: Returns true if each of locations is valid (on the board) 
    //                AND empty in grid; false otherwise.
    private boolean areEmpty(Grid grid, Location[] locations)
    {
        // Exercise 2.1    Insert code here to
        //      loop through locations
        //          if location is not valid in the grid OR grid.get(location) is not null, then return false
        //      return true
        for (int i = 0; i< locations.length; i++) {
            if (!grid.isValid(locations[i]) || grid.get(locations[i]) != null) {
                return false;
            }
        }
        return true;  // replace this line

    }

    // Postcondition: Attempts to move this tetrad deltaRow rows down and 
    //                deltaCol columns to the right, if those positions are valid and empty; 
    //                returns true if successful (or false otherwise).
    public boolean translate(int deltaRow, int deltaCol)
    {
        // Exercise 2.2    Insert code here to
        //      ask any block for its grid and save the value in a local variable
        //      instantiate an array of 4 Location objects called oldLocations
        //      remove the blocks (but save the locations to oldLocations)
        //      instantiate an array of 4 Location objects called newLocations
        //      fill newLocations with the possible new locations as follows
        //          newLocations[i] = new Location(oldLocations[i].getRow() + deltaRow, etc....
        //      check if the new locations are empty in the grid
        //          if so, addToLocations using newLocations and return true;
        //          if not, addToLocations using oldLocations and return false;

        //  if you need help, the completed rotate method below is very similar to this one
        Grid Temp = blocks[0].getGrid(); 
        Location [] oldLocations = new Location [4];
        for (int i = 0; i < blocks.length; i++) {
            oldLocations[i] = blocks[i].getLocation();
            blocks[i].removeSelfFromGrid();
        }
        Location [] newLocations = new Location [4];
        for (int i = 0; i < newLocations.length; i++) {
            newLocations[i] = new Location(oldLocations[i].getRow() + deltaRow, oldLocations[i].getCol() + deltaCol);
        }
        if (areEmpty(Temp, newLocations)) {
                addToLocations(Temp, newLocations);
                return true;
            }
        addToLocations(Temp, oldLocations);
        return false;
            // replace this line
    }

    // Postcondition: Attempts to rotate this tetrad clockwise by 90 degrees about its center, 
    //                if the necessary positions are empty; 
    //                returns true if successful (or false otherwise).
    public boolean rotate()
    {
        Grid grid = blocks[0].getGrid();
        Location[] oldLocations = removeBlocks();
        Location[] newLocations = new Location[oldLocations.length];
        int centerRow = oldLocations[0].getRow();
        int centerCol = oldLocations[0].getCol();
        for(int i = 0; i < newLocations.length; i++)
        {
            newLocations[i] = new Location(centerRow - centerCol + oldLocations[i].getCol(),
                centerRow + centerCol - oldLocations[i].getRow());
        }

        if(areEmpty(grid, newLocations))
        {
            addToLocations(grid, newLocations);
            return true;
        }
        else
        {
            addToLocations(grid, oldLocations);
            return false;
        }
    }
}