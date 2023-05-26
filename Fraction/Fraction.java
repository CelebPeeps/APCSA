/**
 * Shell class for 3.04 Project ("Fraction")
 * Represents fractions and fraction arithmetic
 * 
 * @author  (put your name here)
 * @version (put the date here)
 */

public class Fraction 
{
   //declare instance variables
   private int numer, denom;
   
   //default constructor with no parameters
   public Fraction()
   {
      this(1, 1);   //this constructor chains the following constructor
   }

   //additional constructor establishes the values of the numerator and denominator
   public Fraction(int n, int d)
   {
      numer = n;
      denom = d;      //    <insert code here>
   }

   //returns the numerator of the fraction
   public int getNumerator()
   {
      // complete the following line
      return numer;
   }

   //returns the denominator of the fraction
   public int getDenominator()
   {
      // complete the following line
      return denom;
   }

   //returns the default string description of the fraction
   //(in the form 'numerator/denominator')
   public String toString()
   {
      // complete the following line
      return numer + "/" + denom;
   }

   //method for multiplying two fractions (without simplifying the result)
   public Fraction multiply(Fraction other)
   {
      // n1   n2   n1(n2)
      // -- * -- = ------
      // d1   d2   d1(d2)
      int n = this.numer * other.numer;
      int d = this.denom * other.denom;
      return new Fraction(n, d).simplify();
   }

   //method for dividing two fractions (without simplifying the result)
   public Fraction divide(Fraction other)
   {
      // n1   n2   n1(d2)
      // -- / -- = ------
      // d1   d2   d1(n2)
      int n = this.numer * other.denom;
      int d = this.denom * other.numer;
      
      
      
      
      return new Fraction(n, d).simplify();
   } 
   
   //method for adding two fractions (without simplifying the result)
   public Fraction add(Fraction other)
   {
      // n1   n2   n1(d2) + n2(d1)
      // -- + -- = ---------------
      // d1   d2        d1(d2)
      int n1 = this.numer * other.denom;
      int n2 = other.numer * this.denom;
      int n = n1 + n2;
      int d = this.denom * other.denom;
      return new Fraction(n, d).simplify();
   }

   //method for subracting two fractions (without simplifying the result)
   public Fraction subtract(Fraction other)
   {
      // n1   n2   n1(d2) - n2(d1)
      // -- - -- = ---------------
      // d1   d2        d1(d2)
      int n1 = this.numer * other.denom;
      int n2 = other.numer * this.denom;
      int n = n1 - n2;
      int d = this.denom * other.denom;
      return new Fraction(n, d).simplify();
   }
   
   public Fraction simplify()
    {
        int first = numer;
        int second = denom;
        int third;
        while (second != 0)
        {
            third = second;
            second = first % second;
            first = third;
        }
        numer = numer/first;
        denom = denom/first;
        return new Fraction(numer, denom);
    }
}


