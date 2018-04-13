
/**
 * Write a description of class Card here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Card
{
    // instance variables - replace the example below with your own
    private int value;// the #value of a card
    private final int rank; 
    private final int suit;
    String[] suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
    String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9",
            "10", "Jack", "Queen", "King"};
    /**
     * Constructor for objects of class Card
     */
    public Card(int val, String s, String r )
    {
        // initialise instance variables
        this.value = val;
        this.suit = s;
        this.rank = r;
    }
    
    public int getRank(){
        return this.rank;
    }
    public int getSuit(){
        return this.suit;
    }
    public int getValue(){
        if(rank > 10){
            value = 10;
        }        
        else if(rank==1 && handTotal()<21 ){
            value = 11;
        }
        
        else if(rank == 1 && handTotal()>21){
            value = 1; //if the ace will put you over the top, then it is reverted to a 1
        }
        else{
            value = rank;
        }
        return value;
    }
    public String toString(){
        return rank + "of" +suit;
    }
    
}
