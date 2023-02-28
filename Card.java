public class Card 
{
    private String suit;
    private int value;
    private String rank;
    
    //Default Constructors
    public Card()
    {
        suit = "X";
        value = 0;
    }
    
    //Constructors
    public Card(int value, String suit)
    {
        this.value = value;
        this.suit = suit;
    }
    
    public void setSuit(String suit)
    {
        this.suit = suit;
    }
    
    public String getSuit()
    {
        return suit;
    }
    
    public void setValue(int value, String rank)
    {
        this.value = value;
        this.rank = rank;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String getRank() {
        return rank;
    }
    
    public String toString()
    {
        return value + " of " + suit;
    }
}