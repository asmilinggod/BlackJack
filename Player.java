
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Player
{
    // instance variables - replace the example below with your own
    private String name;
    
    private int amtMoney;
    private int moneyBet;
    private int handTotal;
    public int numCards;
    Scanner sc = new Scanner(System.in);
    /**
     * Constructor for objects of class Player
     */
    public Player(String nm, double m)
    {
        hand = new ArrayList<Card>();
        this.amtMoney = m;
        this.nm = name;
    }
    
    public void bet(){
        
        System.out.println("how much would you like to bet between 0 and "  
        + amtMoney);
        int betAmount = sc.nextInt();
         moneyBet += i;
    }
    
    public int hit(){
        Deal(currentP);
        //card recieved
    }
   // public void dea(){
    public void stay(){
        nextP();
    }
    
    public int handTotal(){
        handTotal[0] = 0;
        handTotal[1] = 0;
        for (int i = 0; i < numCards; i++){
            total += deck[i].value();
            if(total  > 21){
                 Ace.value = 1;
            }
            else{
                Ace.value = 11;
            }
            total += deck[i].value();
        }
    }
    public String toString(){
        return "you have $ " + amtMoney;
    }

    
}
