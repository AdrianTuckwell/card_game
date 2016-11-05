package cards;
import java.util.*;

public class Deck {

  private ArrayList<Card> deck;

  // Deck constructor ---------------------
  public Deck()
  {
    this.deck = new ArrayList<Card>();
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


  
  // ----------------------------------------
  public void shuffle()
  {
    Collections.shuffle(deck);
  }
  // ----------------------------------------



  // ----------------------------------------
  public void dealCard()
  {
  
    
  }
  // ----------------------------------------


  public void cardsLeft(){


  }












}