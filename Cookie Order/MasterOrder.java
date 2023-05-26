import java.util.*;
public class MasterOrder
{
    /** The list of all cookie orders */
    private List<CookieOrder> orders;
    
    /** Constructs a new MasterOrder object */
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }
    
    /** Add theOrder to the Master order.
      * @param theOrder the cookie order to add to the master order
      */
     public void addOrder(CookieOrder theOrder)
     {
         orders.add(theOrder);
     }
     
     public CookieOrder getOrder(int index)
     {
         return orders.get(index);
     }
     
     public String toString()
     {
         String result = "\nCookie orders on file\n";
         for(CookieOrder order : orders)
            result += order + "\n";
         return result;
     }
     
     /** @return the sum of the number of boxes of all the cookie orders */
     public int getTotalBoxes()
     {
         // to be implemented in part 0
         int sum = 0;
         for (int i = 0; i < orders.size(); i++)
         {
             sum += orders.get(i).getNumBoxes();
         }
         return sum;     // replace this line
     }
     
     /** Removes all cookie orders from the master order that have the same
      * variety of cookie as cookieVar and returns the total number of boxes
      * that were removed.
      * @param cookieVar the variety of cookies to remove from the master order
      * @return the total number of boxes of cookieVar in the cookie orders removed
      */
     public int removeVariety(String cookieVar)
     {
         // to be implemented in part 1
         int removed = 0;
         for (int i = 0; i < orders.size(); i++) {
             if (orders.get(i).getVariety().equals(cookieVar)) {
                 removed += orders.get(i).getNumBoxes();
                 orders.remove(i);
                 if (i > 0) {
                     i--;
                 }
             }
         }
         return removed;     // replace this line
     }
}
