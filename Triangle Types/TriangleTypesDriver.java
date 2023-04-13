import java.util.Scanner;
/**
 * This class drives the TriangleTypes class
 * 
 * @author Mr. B!
 * @version September 24, 2021
 */
public class TriangleTypesDriver
{
    public static void main(String[] args)
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("Welcome to the amazing Triangle Types detector");
        boolean student, exemplar;
        while(true)
        {
            System.out.println("\nEnter three positive integers (with a space in between them)");
            System.out.print("as the side lengths of a triangle (or -1 to quit): ");

            int a = reader.nextInt();
            if (a == -1)
                break;
            int b = reader.nextInt();
            int c = reader.nextInt();

            if (a > 0 && b > 0 && c > 0)
            {
                System.out.println("\nA triangle with side lengths of " + a + ", " + b + ", and " + c);

                // test for a possible triangle
                student = TriangleTypes.isTriangle(a, b, c);
                exemplar = TriangleTypesExemplar.isTriangle(a, b, c);
                if (student == exemplar)
                    System.out.print("Correct! ");
                else
                    System.out.print("Oops! ");
                System.out.print("Is ");
                if(!exemplar)
                    System.out.print("not ");
                System.out.print("a triangle ");
                if (student != exemplar)
                    System.out.print("(Your code said the opposite.)");
                System.out.println();
                if (exemplar)   // only test valid triangles
                {
                    // test for Equilateral Triangle
                    student = TriangleTypes.isEquilateral(a, b, c);
                    exemplar = TriangleTypesExemplar.isEquilateral(a, b, c);
                    if (student == exemplar)
                        System.out.print("Correct! ");
                    else
                        System.out.print("Oops! ");
                    System.out.print("Is ");
                    if(!exemplar)
                        System.out.print("not ");
                    System.out.print("an Equilateral triangle ");
                    if (student != exemplar)
                        System.out.print("(Your code said the opposite.)");
                    System.out.println();

                    // test for Isoceles Triangle
                    student = TriangleTypes.isIsoceles(a, b, c);
                    exemplar = TriangleTypesExemplar.isIsoceles(a, b, c);
                    if (student == exemplar)
                        System.out.print("Correct! ");
                    else
                        System.out.print("Oops! ");
                    System.out.print("Is ");
                    if(!exemplar)
                        System.out.print("not ");
                    System.out.print("an Isoceles triangle ");
                    if (student != exemplar)
                        System.out.print("(Your code said the opposite.)");
                    System.out.println();

                    // test for Scalene Triangle
                    student = TriangleTypes.isScalene(a, b, c);
                    exemplar = TriangleTypesExemplar.isScalene(a, b, c);
                    if (student == exemplar)
                        System.out.print("Correct! ");
                    else
                        System.out.print("Oops! ");
                    System.out.print("Is ");
                    if(!exemplar)
                        System.out.print("not ");
                    System.out.print("a Scalene triangle ");
                    if (student != exemplar)
                        System.out.print("(Your code said the opposite.)");
                    System.out.println();

                    // test for Right Triangle
                    student = TriangleTypes.isRight(a, b, c);
                    exemplar = TriangleTypesExemplar.isRight(a, b, c);
                    if (student == exemplar)
                        System.out.print("Correct! ");
                    else
                        System.out.print("Oops! ");
                    System.out.print("Is ");
                    if(!exemplar)
                        System.out.print("not ");
                    System.out.print("a Right triangle ");
                    if (student != exemplar)
                        System.out.print("(Your code said the opposite.)");
                    System.out.println();
                }
            }
            else
            {
                System.out.println("Sorry, invalid input. Try again.");
            }
        }
        System.out.println("\nThanks for using the amazing Triangle Types dectector!");
    }

}
