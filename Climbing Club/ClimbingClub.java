import java.util.ArrayList;
/**
 * This class represents a list of the climbs by the members
 * of a climbing club.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ClimbingClub
{
    /** The list of climbs completed by members of the club.
     * Guaranteed not to be null. Contains only non-null references. 
     */
    private ArrayList<ClimbInfo> climbList;

    /** Creates a new ClimbingClub object. */
    public ClimbingClub()
    { 
        climbList = new ArrayList<ClimbInfo>(); 
    }

    /** Adds a new climb with name peakName and time climbTime to the list of climbs.
     * @param peakName the name of the mountain peak climbed
     * @param climbTime the number of minutes taken to complete the climb
     */
    public void addClimb(String peakName, int climbTime)
    { /* start by adding ClimbInfo objects in the order they are given */
        int index = 0;
        while(index < climbList.size() && climbList.get(index).getName().compareTo(peakName) < 0) 
            index++;
            climbList.add(index, new ClimbInfo(peakName, climbTime));
        
    }

    /** @return the number of distinct names in the list of climbs */ 
    public int distinctPeakNames()
    { /* given an alphabetical list, determine the number of unique peak names */
        int counter = 1;
        String name = climbList.get(0).getName();
        for (int i = 1; i < climbList.size(); i++) {
            if (!climbList.get(i).getName().equals(name))
            {
                counter++;
                name = climbList.get(i).getName();
            }
        }
        return counter;      // remove this line
    }
}