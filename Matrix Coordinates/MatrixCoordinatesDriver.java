import java.util.Scanner;
/**
 * This class drives the MatrixCoordinates class
 *
 * @author Mr. B!
 * @version September 13, 2022
 */
public class MatrixCoordinatesDriver
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("This program displays the coordinates of a matrix");
        System.out.print("Enter the number of rows: ");
        int rows = reader.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = reader.nextInt();
        System.out.println();
        System.out.println("The matrix coordinates in normal order");
        System.out.println(MatrixCoordinates.normalOrder(rows, cols));
        System.out.println("The matrix coordinates in reverse order");
        System.out.println(MatrixCoordinates.reverseOrder(rows, cols));
    }
}
