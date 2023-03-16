
/**
 * Write a description of class Time here.
 *
 * @author  Caleb Wang
 * @version 3/14/23
 */
public class Time
{
    private int hours, minutes;
    
    public Time (int h, int m) {
        setTime(h, m);
    }
    
    public void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }
    
    public int getHours () {
        return hours;
    }
    
    public int getMinutes() {
        return minutes;
    }
    
    public boolean isValidTime() {
        if (minutes >= 0 && minutes < 60 && hours < 24 && hours >= 0) {
            return true;
        }
        return false;
    }
    
    public String toString() {
        if (hours < 10) {
            return "0" + hours + ":" + minutes;
        }
        
        return hours + ":" + minutes;
    }
    
    public int minutesUntil(Time other) {
        int thisTotalMinutes = (this.hours * 60) + this.minutes;
        int otherTotalMinutes = (other.hours * 60) + other.minutes;
        return otherTotalMinutes - thisTotalMinutes;
    }
}
