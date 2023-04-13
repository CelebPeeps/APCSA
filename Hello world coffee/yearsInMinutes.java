
/**
 * Write a description of class yearsInMinutes here.
 *
 * @author (your name)
 * @version (today's date)
 */
public class yearsInMinutes
{
    public static void main(String [] args) 
    {
        int Year = 1;
        int minutesInHour = 60;
        int hoursinDay = 24;
        int daysInYear = 365;
        int yearsInMinutes = Year * daysInYear * hoursinDay * minutesInHour;
        System.out.println(yearsInMinutes);
    }
}
