/**
 * This Trail object . . .
 * 
 * @author  
 * @version 
 */
public class Trail
{
    /** Representation of the trail. The number of markers on the trail is markers.length. */
    private int[] markers;

    public Trail(int[] trail)
    {
        markers = trail;
    }
    
    /** Determines if a trail segment is level. A trail segment is defined by a starting marker,
    * an ending marker, and all markers between those two markers.
    * A trail segment is level if it has a difference between the maximum elevation
    * and minimum elevation that is less than or equal to 10 meters.
    * @param start the index of the starting marker
    * @param end the index of the ending marker
    * Precondition: 0 <= start < end <= markers.length - 1
    * @return true if the difference between the maximum and minimum
    * elevation on this segment of the trail is less than or equal to 10 meters;
    * false otherwise.
    */
   public boolean isLevelTrailSegment(int start, int end)
   {
       //to be completeted in part a
       int max = Integer.MIN_VALUE;
       int min = Integer.MAX_VALUE;
       for (int i = start; i < end; i++) {
        int x = markers[i];
        if (x <= min) {
        min = x;   
        }
        if (x >= max) {
        max = x;    
        }
        }
       return (max - min <= 10); 
       }
   

   /** Determines if this trail is rated difficult. A trail is rated by counting the number of changes
   * in elevation that are at least 30 meters (up or down) between two consecutive markers. A trail
   * with 3 or more such changes is rated difficult.
   * @return true if the trail is rated difficult; false otherwise.
   */
  public boolean isDifficult()
  {
      //to be completed in part b
      int counter = 0;
      for (int i = 1; i < markers.length; i++) {
          if (Math.abs(markers[i-1] - markers[i]) >= 30) {
              counter++;
          }
      }
      return counter >= 3;
  }
  
  // returns a string representation of this Trail object
  public String toString()
  {
      String index =   "Marker   ";
      String element = "Elevation";
      for (int i = 0; i < markers.length; i ++)
      {
          index += "\t" + i;
          element += "\t" + markers[i];
      }
      return (index + "\n" + element);
  }
}