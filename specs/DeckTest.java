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
  public void testMakeDeck() 
  {
      deck.makeDeck();
      assertEquals(52, deck.getDeck().size());
  }

}