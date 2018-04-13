
/**
 * Write a description of class Dealer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Dealer extends Player
{
    // instance variables - replace the example below with your own
   
    /**
     * Constructor for objects of class Dealer
     */
    public Dealer()
    {
        super("Dealer",-1);
    }
    public void DealerStrats(){
        while (handTotal() < 17){
            hit();
        }
        
        stay();
        
    }
    
}
