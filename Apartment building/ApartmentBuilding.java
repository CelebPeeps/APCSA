
/**
 * Write a description of class apartmentBuilding here.
 *
 * @author  (your name here)
 * @version (today's date)
 */
public class ApartmentBuilding extends Building
{
    private double[] wh;
    public ApartmentBuilding(String a, int ap)
    {
        super(a);
        wh = new double[ap]; 
    }
    public double amountOwed()
    {
        double sum = 0;
        for(double w: wh)
        {
           sum += w;
        }
        return sum * RATE;
    }
}

