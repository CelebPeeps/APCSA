/**
 * This class represents a mountain climbing event
 *
 * @author Caleb Wang
 * @version 2/6/2022
 */
public class ClimbInfo
{
    private String Name;
    private int time;
    
    public ClimbInfo(String peakName, int climbMinutes){
        Name = peakName;
        time = climbMinutes;
    }
    
    public String getName() {
        return Name;
    }
    
    public int getTime() {
        return time;
    }
}
