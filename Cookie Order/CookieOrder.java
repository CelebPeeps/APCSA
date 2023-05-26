public class CookieOrder
{
    private String variety;
    private int boxes;
    
    /** Constructs a new CookieOrder object */
    public CookieOrder (String variety, int numBoxes)
    {
        this.variety = variety;
        boxes = numBoxes;
    }
    
    /** @return the variety of cookie being ordered */
    public String getVariety()
    {
        return variety;
    }
    
    /** @return the number of boxes being ordered */
    public int getNumBoxes()
    {
        return boxes;   
    }
    
    public String toString()
    {
        String result = boxes + " box";
        if (boxes > 1)
            result += "es";
        result += " of " + variety + " cookies";
        return result;
    }
}
