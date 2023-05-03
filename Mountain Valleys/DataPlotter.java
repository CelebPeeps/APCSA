import java.awt.Color;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * This DataPlotter object reads a space delimited text file of elevations
 * and plots the result as a range of greyscale images, and then calculates 
 * and plots the steepest downward path from each location in the image.
 * 
 * @author  Caleb Wang
 * @version April 13, 2023
 */
public class DataPlotter
{
    private static int[][] grid;
    private static DrawingPanel panel;
    private static Scanner fileReader;
    private static int rows, cols;

    public static void main(String[] args) throws IOException
    {
        readValues("Colorado");
        plotData();
        try {Thread.sleep(3000); } catch (Exception e){};  // pause display for 3 seconds
        plotAllPaths();
    }

    private static void readValues(String fileName) throws IOException
    {
        fileReader = new Scanner(new File(fileName + ".dat"));
        rows = fileReader.nextInt();    // the first integer in the file is the number of rows
        // the second integer in the file is the number of columns
        cols = fileReader.nextInt();
        // instantiate and initialize the instance variable grid
        grid = new int[rows][cols];
        // then read all of the data into the array in row major order
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                grid[r][c] = fileReader.nextInt();
            }
        }
        
    }

    // plot the altitude data read from file
    private static void plotData()
    {
        panel = new DrawingPanel(cols, rows);
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] > Max) {
                    Max = grid[r][c];
                }
                if (Min > grid[r][c]) {
                    Min = grid[r][c];
                }
            }
        }
        
        double scaleFactor = (double)255 / (Max - Min);
        
        for (int r = 0; r < rows; r++) {
            for ( int c = 0; c < cols; c++) {
                int value = (int)((grid[r][c] - Min) * scaleFactor);
                Color color = new Color(value, value, value);
                panel.setPixel(c, r, color);
            }
        }
        
        
    }

    // for a given x, y value, plot the downhill path from there
    private static void plotDownhillPath(int x, int y)
    {
        int xMinus1 = Math.max(0, x - 1);
        int yMinus1 = Math.max(0, y - 1);
        int xPlus1 = Math.min(cols - 1, x + 1);
        int yPlus1 = Math.min(rows - 1, y + 1);
        int lowestX = x;
        int lowestY = y;
        for (int testX = xMinus1; testX <= xPlus1; testX++) {
            for (int testY = yMinus1; testY <= yPlus1; testY++) {
                if (grid[testY][testX] < grid[lowestY][lowestX]) {
                    lowestX = testX;
                    lowestY = testY;
                }
            }
        }
        if (x != lowestX || y != lowestY) {
            panel.setPixel(lowestX, lowestY, Color.blue);
            plotDownhillPath(lowestX, lowestY);
        }
    }

    private static void plotAllPaths()
    {
        for (int x = 0; x < cols; x++) {
            for (int y = 0; y < rows; y++) {
                plotDownhillPath(x, y);
            }
        }
    }
}
    
