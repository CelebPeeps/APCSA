/**
 * Tetris class to be completed for Tetris project
 * 
 * @author  (your name)
 * @version (today's date)
 */
public class Tetris implements ArrowListener
{
    public static void main(String[] args)
    {
        Tetris tetris = new Tetris();
        tetris.play();
    }

    private Grid grid;
    private BlockDisplay display;
    private Tetrad activeTetrad;

    public Tetris()
    {
        grid = new Grid(20, 10);
        display = new BlockDisplay(grid);
        display.setTitle("Tetris");
        display.setArrowListener(this);
        activeTetrad = new Tetrad(grid);
    }

    public void play()
    {
        int pause = 1000;   //default one second
        int score = 0;
        while (true)
        {
            try { Thread.sleep(pause); } catch(Exception e) {}

            if(!activeTetrad.translate(1,0))
            {
                clearCompletedRows();
                if(!topRowsEmpty())
                   return;
                activeTetrad = new Tetrad(grid);
                score += 10;
                pause *= 0.95;
                display.setTitle("Tetris        Score: " + score);
            }
            display.showBlocks();
        }
    }

    // Precondition:  0 <= row < number of rows
    // Postcondition: Returns true if every cell in the given row is occupied;
    //                returns false otherwise.
    private boolean isCompletedRow(int row)
    {
        // Exercise 3.0  Insert code here to
        //      Iterate through each grid column in the given row, 
        //      making a temporary new Location object for the row and column in question. 
        //      Call grid.get(location) to see if there is a block there or not. 
        //      If a given location ever returns null (nothing there), 
        //      then the row is not completed (return false). 
        //      If you get through the entire row and every location has a block, 
        //      the row is completed (return true).
        for (int i = 0; i < grid.getNumCols(); i++) {
            Location yes = new Location(row, i);
            if (grid.get(yes) == null) {
                return false;
            }
        }
        return true;    // replace this line
    }

    // Precondition:  0 <= row < number of rows;
    //                given row is full of blocks
    // Postcondition: Every block in the given row has been removed, 
    //                and every block above row has been moved down one row.
    private void clearRow(int row)
    {
        // Exercise 3.1  Insert code here to
        //      remove all the blocks in the given completed row
        //      then move all the blocks in each row above down by one

        for (int i = 0; i < grid.getNumCols(); i++) {
                Block block = grid.get (new Location(row, i));
                block.removeSelfFromGrid();
        }
        for (int Rows = row - 1; Rows >= 0; Rows--) {
            for (int Cols = 0; Cols < grid.getNumCols(); Cols++) {
                Block block = grid.get(new Location(Rows, Cols));
                if (block != null) {
                        block.moveTo(new Location(Rows + 1, Cols));
                }
            }
        }
    }

    // Postcondition: All completed rows have been cleared.
    private void clearCompletedRows()
    {
        // Exercise 3.2  Insert code here to
        //      iterate backwards from bottom row to the top
        //      if the given row is completed, call clearRow(row)
        //      (if so, make sure the row counter stays in place)
        for (int i = grid.getNumRows() - 1; i >= 0; i--) 
        {
            if(isCompletedRow(i))
            {
                clearRow(i);
                i++;
            }
        }
    }

    // Returns true if top two rows of the grid are empty (no blocks), false otherwise
    private boolean topRowsEmpty()
    {
        // Exercise 3.3  Insert code here to
        //      iterate through the top two rows
        //      if any blocks there, return false
        //      otherwise return true
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < grid.getNumCols(); col++) {
                if ( grid.get(new Location(row, col)) != null) {
                    return false;
                }
            }
        }
        return true;
           // replace this line
    }

    public void upPressed()
    {
        activeTetrad.rotate();
        display.showBlocks();
    }

    public void downPressed()
    {
        activeTetrad.translate(1, 0);
        display.showBlocks();
    }

    public void leftPressed()
    {
        activeTetrad.translate(0, -1);
        display.showBlocks();
    }

    public void rightPressed()
    {
        activeTetrad.translate(0, 1);
        display.showBlocks();
    }

    public void spacePressed()
    {
        while(activeTetrad.translate(1,0));
        display.showBlocks();
    }
}