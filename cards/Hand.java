package cards;
import java.util.*;

public class Hand {

    private ArrayList<Card> hand;

    // Hand constructor ---------------------
    public Hand()
    {
      this.hand = new ArrayList<Card>();
    } 
    
    // Return the Hand ----------------------
    public ArrayList<Card> getHand()
    {
      return this.hand;
    }
    
    // Return the Hand size -------------------
    public int getSize()
    {
        return hand.size();   
    }

    // Add Card to hand ---------------------
    public void addCard(Card card)
    {
      hand.add(card);
    }

    // Remove Card from hand ---------------------
    public void removeCard(Card card) 
    {
      hand.remove(card);
    }

    // check card by index ---------------------
    public Card checkCard(int index)
    {
        return hand.get(index);
    }

    // Get total value of hand -------------------
    public int getTotal()
    {
        // create total to keep all cards value
        int total = 0;
        // total = 0;
        for( Card card: this.hand)
        {
          total += card.getValue();
        }
        return total;   
    }


}