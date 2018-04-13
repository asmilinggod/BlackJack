
/**
 * Write a description of class Game here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Game
{
    // instance variables - replace the example below with your own
    // ArrayList<Player> table = new ArrayList();
    int money;
    Deck d = new Deck();
    Player p1 = new Player();
    Dealer d1 = new Dealer();
    int bet;
    boolean userWins;
    /**
     * Constructor for objects of class Game
     */
    public Game()
    {
        System.out.println("welcome to blackjack");
        playGame();
    }
    // public
    public void playGame(){
        p1.bet;
        dealCards(p1); //setup
        dealCards(d1);
        p1.Turn();
        d1.dealerStrats;
        determineWinner();
        endGame();
    }
    public void dealCards(Player p){
        Card c = d.deal();
        
        p1.hit(c);
        p1.hit(c);
        
    }
    public String determineWinner(){
        if(p1.handTotal > d1.handTotal && p1.handTotal <= 21){
            userWins = true;
        }
        else{
            userWins = false;
        }
    }
    public void endGame(){
        System.out.print("do you want to play again y or n");
    }
    
}
