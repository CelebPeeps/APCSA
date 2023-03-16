import java.util.ArrayList;
/**
 * Write a description of class Trip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Trip
{
    // instance variables - replace the example below with your own
    private String trip;
    private ArrayList<Flight> flights;

    /**
     * Constructor for objects of class Trip
     */
    public Trip(String t,  ArrayList<Flight> f)
    {
        flights = f;
        trip = t;
    }
    public int getDuration(){
        int sum = 0;
        if(flights.size() == 0){
            return 0;
        }
        sum = flights.get(0).getDepartureTime().minutesUntil(flights.get(flights.size()-1).getArrivalTime());
        return sum;
    }
    public int getShortestLayover(){
        int smol = 0;
        int index = 0;
        if(flights.size() == 1 || flights.size() == 0){
            return -1;
        }
        for(int i = 0; i < flights.size()-1; i++){
            if(flights.get(i).getArrivalTime().minutesUntil(flights.get(i+1).getDepartureTime()) < flights.get(index).getArrivalTime().minutesUntil(flights.get(index+1).getDepartureTime())){
                smol = flights.get(i).getArrivalTime().minutesUntil(flights.get(i+1).getDepartureTime());
                index = i;
            }
        }
        return smol;
    }
    public String toString(){ 
       String t = "The " + trip + " trip itinerary is as follows:\n\n"; 
       for (int i = 0; i < flights.size(); i++) 
       { 
          t += flights.get(i); 
          if (i < flights.size() - 1) 
          { 
             t += "\nThe layover between flights is "; 
             t += flights.get(i).getArrivalTime().minutesUntil 
                   (flights.get(i + 1).getDepartureTime()); 
             t += " minutes\n\n"; 
          } 
       } 
       t += "\nThe duration of the entire trip is " + getDuration() + " minutes\n"; 
       t += "The shortest layover is " + getShortestLayover() + " minutes"; 
       return t; 
    }
}
