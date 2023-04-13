/**
 * This class represents a crossword entry and clue as a String
 *
 * @author  Caleb Wang
 * @version September 16th 2022
 */
public class SecretCrossword
{
    /** This instance variable will hold a combined crossword entry
     *  and clue. The String begins with the crossword entry, which
     *  is a grouping of capital letters followed by a single blank 
     *  space, followed by the clue (which may contain more blank
     *  spaces). In other words, the crossword entry and the clue 
     *  are separated by a single blank space.
     */ 
    private String crosswordClue;

    /** Constructor that sets the crosswordClue instance variable. */
    public SecretCrossword(String cwc)
    {
        crosswordClue = cwc;
    }

    /** Returns the number of characters of the crossword entry */
    public int getEntryLength()
    {
        // hint: find the index of the first blank space in crosswordClue
        return crosswordClue.indexOf(" ");
    }

    /** Extracts and returns the crossword entry */
    public String getEntry()
    {
        // hint: return the beginning substring of crosswordClue
        // (how many characters? Use the method you just wrote)
        return crosswordClue.substring(0, getEntryLength());
    }

    /** Extracts and returns the clue */
    public String getClue()
    {
        // hint: return the rest of crosswordClue after the 
        // first blank space
        return crosswordClue.substring(getEntryLength() + 1);
    }

    /** Returns the first letter of the entry */
    public String getFirstLetter()
    {
        // hint: return the first character of crosswordClue
        return crosswordClue.substring(0, 1);
    }

    /** Returns true if guess matches crossword entry (exactly);
        false otherwise */
    public boolean isCorrectGuess(String guess)
    {
        // hint: compare guess and entry to see if they are equivalent
        // be sure to use the proper method for String comparision
        return getEntry().equals(guess);
    }
}
