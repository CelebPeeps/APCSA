
/**
 * Write a description of class Clock here.
 *
 * Caleb Wang
 * 11/2/2022
 */
public class Clock
{
    private int seconds;
    private int minutes;
    private int hours;
    
    public Clock()
    {
        hours = 0;
        minutes = 0;
        seconds = 0;
    }
    
    public Clock(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public void setClock(int hours, int minutes, int seconds)
    {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }
    
    public int getHours()
    {
        return hours;
    }
    
    public int getMinutes()
    {
        return minutes;
    }
    
    public int getSeconds()
    {
        return seconds;
    }
    
    public String toString()
    {
        return hours + ":" + minutes + ":" + seconds;
    }
    
}
