
/**
 * Write a description of class SelfDivisor here.
 *
 * @author  (your name here)
 * @version (today's date)
 */
public class SelfDivisor
{
    public static boolean isSelfDivisor(int number){
    int Copy = number;
    while (Copy > 0)
    {
        if (Copy % 10 == 0 || number % (Copy % 10) != 0){
            return false;
        }
        Copy = Copy / 10;
    }
    return true;
    }
    
    public static int[] firstNumSelfDivisors(int start, int num) {
    int counter = 10;
    int [] correctAnswer = new int [num];
    int Store = start;
    for (int i = 0; i < num; i++)
    {
            for (int b = Store; counter < 11; b++) {
                if (isSelfDivisor(b)) {
                    counter++;
                    correctAnswer[i] = b;
                    Store = b + 1;
            }
        }
        counter = 10;
    }
    return correctAnswer;
}
}
