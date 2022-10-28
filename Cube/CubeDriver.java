import java.util.Scanner;
/**
 * This class uses the Cube class to calculate various properties
 * of a cube
 *
 * @author Mr. B!
 * @version August 29, 2022
 */
public class CubeDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the amazing Cube properties calculation app!");
        System.out.print("\nEnter a side length (as a whole number): ");
        int length = keyboard.nextInt();
        System.out.println("\nA cube with a side length " + length + " has the following properties:");
        System.out.println("      SurfaceArea: " + Cube.surfaceArea(length) + " square units");
        if(CubeExemplar.surfaceArea(length) != Cube.surfaceArea(length))
            System.out.println("         Oops. It really should be " + CubeExemplar.surfaceArea(length));
        System.out.println("           Volumn: " + Cube.volume(length) + " cubic units");
        if(CubeExemplar.volume(length) != Cube.volume(length))
            System.out.println("         Oops. It really should be " + CubeExemplar.volume(length));
    }
}
