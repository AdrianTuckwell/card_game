import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class DeckTest {

  Deck deck;
  
  @Before 
  public void before()
  {
    deck = new Deck();
  }

  @Test // 1 check deck size --------------
  public void testGetDeckSize() 
  {
    assertEquals(52, deck.getDeckSize());
  }

  @Test // 2 check deck size --------------
  public void testMakeDeck() 
  {
      assertEquals(52, deck.getDeck().size());
  }

}