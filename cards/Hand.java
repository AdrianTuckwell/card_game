package cards;
import java.util.*;

public class Hand {

    private ArrayList<Card> hand;

    // Hand constructor ---------------------
    public Hand()
    {
      this.hand = new ArrayList<Card>();
    } 
    //---------------------------------------

    // Return the Hand ----------------------
    public ArrayList<Card> getHand()
    {
      return this.hand;
    }
    //---------------------------------------

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
    // ---------------------------------------




    public void removeCard() {

    }




}