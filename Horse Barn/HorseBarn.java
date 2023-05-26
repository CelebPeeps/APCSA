public class HorseBarn
{
    /** The spaces in the barn.  Each array element hold a reference to the horse
     *  that is currently occupying the space.  A null value indicates an empty space.
     */
    private Horse[] spaces;
    
    public HorseBarn(Horse[] spaces)
    {
        this.spaces = spaces;
    }
    
    
    /** Returns the index of the space that contains the horse with the specified name.
     *  Precondition: No two horses in the barn have the same name.
     *  @param name the name of the horse to find
     *  @return the index of the space containing the horse with the specified name;
     *          -1 if no horse with the specified name is in the barn.
     */
    public int findHorseSpace(String name)
    {
        // to be implemented in part a
        
        for (int i = 0; i < spaces.length; i++)
        {
            if(spaces[i] != null && spaces[i].getName().equals(name))
            {
                return i;
            }
        }
        return -1;   // replace this line
    }
    
    /** Consolidates the barn by moving horses so that the horses are in adjacent spaces,
     * starting at index 0, with no empty space between any two horses.
     * Postcondition: The order of the horses is the same as before the consolidation.
     */
    public void consolidate()
    {
        // to be implemented in part b
        Horse[] newBarn = new Horse[spaces.length];
        int extraspace = 0;
        for (int i = 0; i < newBarn.length; i++)
        {
            if(spaces[i] != null)
            {
                newBarn[extraspace] = spaces[i];
                extraspace++;
            }
        }
        spaces = newBarn;
    }
}
