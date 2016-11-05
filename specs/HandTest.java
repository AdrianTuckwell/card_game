import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class HandTest {

  Hand hand;
  Card card1;
  Card card2;

  
  @Before 
  public void before()
  {
    hand = new Hand();
    card1 = new Card(RankType.ACE, SuitType.SPADES);
    card2 = new Card(RankType.ACE, SuitType.HEARTS);
  }

  @Test // 1 test hand is empty  ---------------
  public void testHandGetSize()
  {
    assertEquals(0, hand.getSize());
  }

  @Test // 2 add 1 card to hand  ---------------
  public void testHandHasOneCard()
  {
    hand.addCard(card1);
    assertEquals(1, hand.getSize());   
  }

  @Test // 3 add 2 cards to hand  ---------------
  public void testHandHasTwoCards()
  {
    hand.addCard(card1);
    hand.addCard(card2);
    assertEquals(2, hand.getSize());   
  }

}