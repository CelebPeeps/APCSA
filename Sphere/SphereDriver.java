import java.util.Scanner;
/**
 * This class uses the Sphere class to calculate various properties
 * of a sphere
 *
 * @author Mr. B!
 * @version August 25, 2022
 */
public class SphereDriver
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the amazing Sphere properties calculation app!");
        System.out.print("\nEnter a radius (as a whole number): ");
        int radius = keyboard.nextInt();
        System.out.println("\nA sphere of radius " + radius + " has the following properties:");
        System.out.println("    Circumference: " + String.format("%.4f", Sphere.circumference(radius)) + " units");
        if(Math.abs(SphereExemplar.circumference(radius) - Sphere.circumference(radius)) > .0005)
            System.out.println("         Oops. It really should be " + String.format("%.4f", SphereExemplar.circumference(radius)));
        System.out.println("      SurfaceArea: " + String.format("%.4f", Sphere.surfaceArea(radius)) + " square units");
        if(Math.abs(SphereExemplar.surfaceArea(radius) - Sphere.surfaceArea(radius)) > .0005)
            System.out.println("         Oops. It really should be " + String.format("%.4f", SphereExemplar.surfaceArea(radius)));
        System.out.println("           Volume: " + String.format("%.4f", Sphere.volume(radius)) + " cubic units");
        if(Math.abs(SphereExemplar.volume(radius) - Sphere.volume(radius)) > .0005)
            System.out.println("         Oops. It really should be " + String.format("%.4f", SphereExemplar.volume(radius)));

        }
}
