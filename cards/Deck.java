package cards;
// for use when using array lists
import java.util.*;

public class Deck {

  private ArrayList<Card> deck;

  // Deck constructor ---------------------
  public Deck()
  {
    this.deck = new ArrayList<Card>();
    makeDeck();
  } 
  //---------------------------------------


  // count how many cards in the Deck -----
  public int getDeckSize() 
  {
    return this.deck.size();
  }
  //---------------------------------------

  
  // Return the Deck ----------------------
  public ArrayList<Card> getDeck()
  {
    return this.deck;
  }
  //---------------------------------------

  // make the deck from the Suit and Rank -----
  public void makeDeck()
  {   
      for( SuitType suit : SuitType.values())
      {
        for ( RankType rank : RankType.values())
        {
         deck.add(new Card(rank, suit));  
        }
      }
    }
  //---------------------------------------

  



  public void shuffle(){

  }

  public void deal(){

    
  }

}