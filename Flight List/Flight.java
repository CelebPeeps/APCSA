
/**
 * Write a description of class Flight here.
 *
 * @author  Caleb Wang
 * @version 3/15/23
 */
public class Flight
{
    private String flightNumber;
    private Time arrival, departure;
    
    public Flight(String f, Time d, Time a) {
        setFlight(f, d, a);
    }
    
    public void setFlight(String f, Time d, Time a) {
        flightNumber = f;
        arrival = a;
        departure = d;
    }
    
    public Time getDepartureTime () {
        return departure;
    }
    
    public Time getArrivalTime () {
        return arrival;
    }
    
    public String toString() {
        
        return "Flight number" + flightNumber + "departs at" + departure + "and arrives at" + arrival + "and lasts" + departure.minutesUntil(arrival) + "minutes.";
    }
    }

