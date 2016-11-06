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

  @Test // 2 check deal card --------------
  public void testDealCard() 
  {
    deck.makeDeck();
    deck.dealCard();
    assertEquals(51, deck.getDeck().size());
  }

  @Test // 2 check cards left in deck --------------
  public void testCardsLeft() 
  {
    // make a deck and deal 2 cards so only 50 remain
    deck.makeDeck();
    deck.dealCard();
    deck.dealCard();
    assertEquals(50, deck.cardsLeft());
  }
  



}