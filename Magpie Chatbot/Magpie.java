/**
 * A program to carry on conversations with a human user.
 * 
 * @author  (your name)
 * @version (today's date)
 */
public class Magpie
{
    /**
     * Get a default greeting     
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }

    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        if (foundKeyword(statement, "no"))
        {
            response = "Why so negative?";
        }
        else if (foundKeyword(statement, "mother")
        || foundKeyword(statement, "father")
        || foundKeyword(statement, "sister") 
        || foundKeyword(statement, "brother"))
        {
            response = "Tell me more about your family.";
        }
        
        else if (foundKeyword(statement, "dog")
        || foundKeyword(statement, "cat"))
        {
            response = "Tell me more about your pets.";
        }
        
        else if (foundKeyword(statement, "problem"))
        {
            response = "Tell me more about your problems.";
        }
        else if (statement.trim().length() == 0)
        {
            response = "Say something, please.";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";

        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }
        else if (whichResponse == 4)
        {
            response = "Got it.";
        }
        else if (whichResponse == 5)
        {
            response = "Very cool.";
        }
        

        return response;
    }

    // helper method to determine if a keyword alone is found in a statement
    private boolean foundKeyword(String statement, String keyword)
    { 
        String phrase = statement.trim().toLowerCase();         // trim blank spaces, convert to lowercase
        keyword = keyword.toLowerCase();                        // convert to lowercase
        int position = phrase.indexOf(keyword);                 // find position of keyword in phrase (if it exists)
        while (position >= 0)                                   // as long as the keyword is present in phrase
        { 
            String before = " ", after = " ";                   // set up before and after to be a blank space
            if (position > 0)                                   // identify the single character before keyword
                before = phrase.substring(position - 1, position); 
            if (position + keyword.length() < phrase.length())  // identify the single character after keyword
                after = phrase.substring(position + keyword.length(), position + keyword.length() + 1);

            if (!isLetter(before) && !isLetter(after))          // if not a letter either before or after keyword
                return true;                                    // then keyword alone has been found
            position = phrase.indexOf(keyword, position + 1);   // othwerwise, keep looking in the rest of the string
        } 
        return false;                                           // keyword alone has not been found
    }

    // helper method to determine if single character is a letter or not
    private boolean isLetter(String character)
    {
        if(character.length() != 1)     // must be a single character
            return false;
        if(character.compareTo("a") >= 0 && character.compareTo("z") <= 0)  // falls somewhere between a...z
            return true;                // yup, it's a letter
        return false;                   // nope, it's not a letter
    }
}
