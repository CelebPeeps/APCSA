import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * A Greep is an alien creature that likes to collect tomatoes.
 * 
 * @author (your name here)
 * @version (today's date)
 */

public class Greep extends Creature
{
    // Remember: you cannot extend the Greep's memory. So:
    // no additional fields (other than final fields) allowed in this class!
    
    /**
     * Create a Greep with its home space ship.
     */
    public Greep(Ship ship)
    {
        super(ship);
    }
    
    
    /**
     * This method specifies the name of the author (for display on the result board).
     */
    public static String getAuthorName()
    {
        return "Average Greeps";  // write your name here!
    }


    /**
     * Do what a greep's gotta do.
     */
    public void act()
    {
        super.act();   // do not delete! leave as first statement in act().
        if (carryingTomato()) 
        {
            if(atShip()) 
            {
                dropTomato();
            }
            
            else if (atShip() == false)
            {
                turnHome();
                
                if (atWater()){
                    turn(90);
                    move();
                    
                    
                    
                }
                else if (atWorldEdge()){
                    turn(180);
                    this.act();
                    move();
                }
                move();
                
            }
            
        }
        else if (carryingTomato()== false)
        {
            
            
            move();
            
            checkFood();
            
            if (atWater()){
                    
                    turn(90);
                    this.act();
                    move();
                }
            if (atWorldEdge()){
                    
                    turn(145);
                    this.act();
                    move();
                }
        }
        
    }

    /**
     * Is there any food here where we are? If so, try to load some!
     */
    public void checkFood()
    {
        // check whether there's a tomato pile here
        TomatoPile tomatoes = (TomatoPile) getOneIntersectingObject(TomatoPile.class);
        if(tomatoes != null) 
        {
            
            
            setRotation((int) (180 * Math.atan2(tomatoes.getY() - getY(),tomatoes.getX() - getX()) / Math.PI));
            
            loadTomato();
            // Note: this attempts to load a tomato onto *another* Greep. It won't
            // do anything if we are alone here.
        }
    }


    /**
     * This method specifies the image we want displayed at any time. (No need 
     * to change this for the competition.)
     */
    public String getCurrentImage()
    {
        if(carryingTomato())
            return "greep-with-food.png";
        else
            return "greep.png";
    }
}