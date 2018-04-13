
/**
 * Write a description of class Deck here.
 *public static void main(String[] args){
        int[] deck = new int[52];
        String suits = {"Spades", "Hearts", "Diamonds", "Clubs"};
        String ranks = {"Ace", "2", "3","4","5","6","7","8","9",
            "10","Jack","Queen","King"};
        //initialize cards
        for(int i = 0, i<52, i++){
            Deck[i] = i;
        }
    }
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Deck
{
    // instance variables - replace the example below with your own
    private ArrayList<Card> deck;
    
    public Deck(){
        deck = new ArrayList<Card>();
        initializeDeck();


        
    }
   
    public void initializeDeck(){

        for(String s: suits){
            int value = 1;
            for(String r: ranks){
                Card temp = new Card(value, s , r);
                value ++;
                if (value > 10) value = 10;
                deck.add(temp);
            }
        }
    }
    public Card deal(){
        int index = (int)Math.random()*deck.size();
        return deck.remove(index);
    }
    public void printDeck(){
        for(Card c : deck){
                System.out.println(c);
            }
    }
    
}
