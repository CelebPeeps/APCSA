
/**
 * This class performs some basic word processing functions, 
 * namely find, remove, and replace.
 *
 * @author  (your name)
 * @version (today's date)
 */
public class WordProcessor
{
    public static boolean find(String item, String phrase)
    {
        return phrase.indexOf(item) != -1;
    }
    
    public static String remove(String item, String phrase)
    {
        if (find(item, phrase))
        {
        int position = phrase.indexOf(item);
        String beginning = phrase.substring(0, position);
        String ending = phrase.substring(position + item.length());
        return beginning + ending;
        }
        else 
            return phrase;
    }
    public static String replace(String item, String phrase, String replacement)
    {
        if (find(item, phrase))
        {
        int position = phrase.indexOf(item);
        String beginning = phrase.substring(0, position);
        String ending = phrase.substring(position + item.length());
        return beginning + replacement + ending;
        }
    else 
        return phrase;
    }
}
