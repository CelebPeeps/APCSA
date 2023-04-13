import javax.swing.Box;

/**
 * This class represents a binary number as an String containing only 1s and 0s
 * as represented using a two's complement numbering scheme.
 * 
 * @author 
 * @version 
 */
public class BinaryNumber
{
    /** instance variable */
    private String number;

    /** constructor */
    // constructor receives a String parameter and uses it to set the instance variable
public BinaryNumber (String number){
    this.number = number;
}
    /** returns this binary number as a String of 1s and 0s */
    public String getNumber()
    {
        return number;    // replace this line
    }

    /** returns the representation of this binary number where each bit has 
      * been moved to the left one position (a 0 is put in the rightmost position) */
    public BinaryNumber shiftLeft()
    {
        String sL = getNumber().substring(1) + "0";
        return new BinaryNumber(sL);    // replace this line
    }

    /** returns the representation of this binary number where each bit has 
      * been moved to the right one position (a 0 is put in the leftmost position) */  
    public BinaryNumber shiftRight()
    {
        int Length = getNumber().length();
        String s = getNumber().substring(0, Length - 1);
        String sR = "0" + s;
        return new BinaryNumber(sR);    // replace this line
    }
    
    /** returns the individual bit of this binary number at the given position
      * (starting on the far right as position 0) as either True (1) or False (0) */
    public boolean getBit(int position)
    {
       int p = number.length() - 1 - position;
       return (number.substring(p, p + 1).equals("1"));
    }

    /** returns the bitwise 'not' representation of this binary number 
      * (1s become 0s and 0s become 1s) */
    public BinaryNumber not()
    {
        int loopLength = getNumber().length();
        String a = "";
        int bitL = 0;
        for (int i = 1; i <= loopLength; i ++){
            
            if (getBit(bitL) == false){
                 a =  "1"+ a;
            } else if (getBit(bitL) == true){
                a = "0" + a;
                
            }
            bitL += 1;
            
        }
        
        
        return new BinaryNumber(a);   // replace this line
    }

    /** returns the bitwise 'and' representation of this and another binary number
      * ( 1 and 1 -> 1, 1 and 0 -> 0, 0 and 1 -> 0, 0 and 0 -> 0 ) */
    public BinaryNumber and(BinaryNumber other )
    {
        int loopLength = getNumber().length();
        String a = "";
        int bitL = 0;
        for (int i = 1; i <= loopLength; i ++){
            
            if(getBit(bitL) == false && other.getBit(bitL) == false){
                a = "0" + a;
            } else if ((getBit(bitL) == true && other.getBit(bitL) == false) || (getBit(bitL) == false && other.getBit(bitL) == true)){
                a = "0" + a;
            } else{
                a = "1" + a;
            }
            bitL += 1;
        }
        
        return new BinaryNumber(a);    // replace this line
    }

    /** returns the bitwise 'or' representation of this and another binary number
      * ( 1 or 1 -> 1, 1 or 0 -> 1, 0 or 1 -> 1, 0 or 0 -> 0 ) */   
    public BinaryNumber or(BinaryNumber other)
    {
        int loopLength = getNumber().length();
        String a = "";
        int bitL = 0;
        for (int i = 1; i <= loopLength; i ++){
            
            if(getBit(bitL) == true || other.getBit(bitL) == true){
                a = "1" + a;
            } else if(getBit(bitL) == false || other.getBit(bitL) == false){
                a = "0" + a;
            } else {
                a = "1" + a;
            }
            bitL += 1;
        }
            
        
        return new BinaryNumber(a);    // replace this line
    }

    /** returns the bitwise 'xor' representation of this and another binary number
      * ( 1 xor 1 -> 0, 1 xor 0 -> 1, 0 xor 1 -> 1, 0 xor 0 -> 0 ) */
    public BinaryNumber xor(BinaryNumber other)
    {
        int loopLength = getNumber().length();
        String a = "";
        int bitL = 0;
        for (int i = 1; i <= loopLength; i ++){
            if(getBit(bitL) == true && other.getBit(bitL) == true){
                a = "0" + a;
            } else if(getBit(bitL) == false && other.getBit(bitL) == false){
                a = "0" + a;
            } else {
                a = "1" + a;
            }
            bitL += 1;
        }
        return new BinaryNumber(a);    // replace this line
    }

    /** returns the sum of this and another binary number */ 
    public BinaryNumber add(BinaryNumber other)
    {
        int loopLength = getNumber().length();
        String b = "";
        int bitL = 0;
        int n0;
        int on0;
        int nc = 0;
        boolean carry = false;
        for (int i = 1; i <= loopLength; i ++){
            if (carry == true){ 
                nc = 1; // adds carried over 1 if there was one
            } else {nc = 0;}
            if (getBit(bitL) == true){
                n0 = 1; // is the bit a 1 or a 0 from the primary number
            } else {n0 = 0;}
            if (other.getBit(bitL) == true){
                on0 = 1; // is the bit a 1 or a 0 from the other number
            } else {on0 = 0;}
            if (n0 + on0 + nc == 2){
                carry = true;
                b = "0" + b; // if two 1's then put a zero and carry value is true(1)
            } else if ((n0 + on0 + nc == 3) && (getBit(bitL) == true && other.getBit(bitL) == true)){
                carry = true;
                b = "1" + b; 
            } else if ((n0 + on0 + nc == 3) && (getBit(bitL) == false && other.getBit(bitL) == false)){
                carry = false;
                b = "1" + b;
            } else if ((n0 + on0 + nc == 3) && (getBit(bitL) == true && other.getBit(bitL) == false) || (getBit(bitL) == false && other.getBit(bitL) == true)){
                carry = false;
                b = "1" + b;
            }
            else if (n0 + on0 + nc == 1){
                carry = false;
                b = "1" + b;
            }
            else if (n0 + on0 + nc == 0){
                carry = false;
                b = "0" + b;
            }
        
            bitL += 1;
        }
        return new BinaryNumber(b);    // replace this line
    }

    /** returns the additive inverse value of the this binary number (equivalent 
      * to multiplying by -1 .)  Calculated by negating this binary number (using 
      * the 'not' method) and adding 1 to it. */
    public BinaryNumber twosComplement()
    {
         String one = "1";
         for (int i = 0; i < number.length() - 1; i++){
             one = "0" + one;
         }
         return this.not().add(new BinaryNumber(one));// replace this line
    }

    /** returns the decimal value of this binary number using twosComplement */      
    public int binary2decimal()
    {
        int decimal = 0;
        for (int i = 0; i < number.length(); i++){
            if (getBit(i)){
                decimal += Math.pow(2,i);
                if( i == number.length() - 1){
                    decimal -= Math.pow(2, i + 1);
                }
            }
            
        }
        return decimal;      // replace this line
    }

    /** returns the String representation of this binary number.
      * must include both a binary and decimal representation. */
    public String toString()
    {
        return ("Binary: " + number + "Decimal: " + binary2decimal());      // don't replace this line
    }
}
