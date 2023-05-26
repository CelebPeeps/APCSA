
/**
 * This class demonstrates how Fraction objects are used.
 * 
 * @author Mr. B!
 * @version October 8, 2015
 */
public class FractionApp
{
    public static void main(String[] args)
    {
        Fraction oneHalf = new Fraction(1, 2);
        Fraction oneFourth = new Fraction(1, 4);
        Fraction oneThird = new Fraction(1, 3);

        System.out.println("Now demonstrating fraction arithmetic:\n");
        
        System.out.print(oneHalf + " * " + oneFourth + 
            " = " + oneHalf.multiply(oneFourth));

        if(oneHalf.multiply(oneFourth).toString().equals("1/8"))
            System.out.println("\t\tCorrect!\n");
        else
            System.out.println("\t\tIncorrect :(\n");

        System.out.print(oneThird + " / " + oneHalf + 
            " = " + oneThird.divide(oneHalf));

        if(oneThird.divide(oneHalf).toString().equals("2/3"))
            System.out.println("\t\tCorrect!\n");
        else
            System.out.println("\t\tIncorrect :(\n");

        System.out.print(oneThird + " + " + oneFourth + 
            " = " + oneThird.add(oneFourth));

        if(oneThird.add(oneFourth).toString().equals("7/12"))
            System.out.println("\tCorrect!\n");
        else
            System.out.println("\tIncorrect :(\n");

        System.out.print(oneThird + " - " + oneFourth + 
            " = " + oneThird.subtract(oneFourth));

        if(oneThird.subtract(oneFourth).toString().equals("1/12"))
            System.out.println("\tCorrect!\n");
        else
            System.out.println("\tIncorrect :(\n");
    }
}
