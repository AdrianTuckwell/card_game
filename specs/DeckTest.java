import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class DeckTest {

  Deck deck;
  Card card;
  
  @Before 
  public void before()
  {
    deck = new Deck();
    card = new Card(RankType.ACE, SuitType.SPADES);

  }

  @Test // 1 check deck size --------------
  public void testMakeDeck() 
  {
      deck.makeDeck();
      assertEquals(52, deck.getDeck().size());
  }


  // @Test // 2 get card --------------
  // public void testGetCard() 
  // {
  //     deck.makeDeck();
  //     // Card card = (Card)deck.getCard(0);
  //     // assertEquals(RankType.ACE, card.getRank());
  //     // assertEquals(SuitType.CLUBS, card.getSuit());
      
  // }
  



}