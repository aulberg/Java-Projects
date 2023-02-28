import java.util.Random;
public class PickTwoCards 
{
    public static void main(String [] arg)
    {
       
        final int CARDS_IN_SUIT = 13;
        int myValue = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
        int myValue2 = ((int)(Math.random() * 100) % CARDS_IN_SUIT + 1);
    
        System.out.println("Your first card is " + myValue + " of Spades");
        System.out.println("Your second card is " + myValue2 + " of Diamonds");
    
    }

}