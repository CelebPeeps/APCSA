
/**
 * Write a description of class APCircle here.
 *
 * Caleb Wang
 * 11/3/2022
 */
 

public class APCircle
{    
   private int HCoord, KCoord, RValue;    
   public APCircle(int h, int k, int r)
    {
        HCoord = h;
        KCoord = k;
        RValue = r;
   }    
   public double getArea()
   {    
     return Math.PI * RValue * RValue;
   }    
   public boolean isOnCircle(int x, int y)
   {    
        return (x - HCoord) * (x - HCoord) + (y - KCoord) * (y - KCoord) == RValue * RValue;
   }
}