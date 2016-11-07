import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class HandTest {

  Hand hand;
  Card card1;
  Card card2;
  Card card3;

  @Before 
  public void before()
  {
    hand = new Hand();
    card1 = new Card(RankType.ACE, SuitType.SPADES);
    card2 = new Card(RankType.ACE, SuitType.HEARTS);
    card3 = new Card(RankType.KING, SuitType.HEARTS);
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

  @Test // 4 remove 1 card from hand  ---------------
  public void testRemoveCard()
  {
    hand.addCard(card1);
    hand.addCard(card2);
    hand.removeCard(card1);
    assertEquals(1, hand.getSize());   
  }

  @Test // 5 check card  -------------------------
  public void testCheckCard()
  {
    hand.addCard(card1);
    Card card = hand.checkCard(0);
    assertEquals(SuitType.SPADES, card.getSuit());
    assertEquals(RankType.ACE, card.getRank());
  }

  @Test // 6 check card  -------------------------
  public void testCheckHand()
  {
    Card card;
    // add two cards
    hand.addCard(card1);
    hand.addCard(card2);
    // Card 1 check
    card = hand.checkCard(0);
    assertEquals(RankType.ACE, card.getRank());
    assertEquals(SuitType.SPADES, card.getSuit());
    // Card 2 check
    card = hand.checkCard(1);
    assertEquals(RankType.ACE, card.getRank());
    assertEquals(SuitType.HEARTS, card.getSuit());
  }

  @Test // 7 check hand value --------------
  public void testGetTotal()
  {
    // 2 x ACE's and 1 KING = 12
    hand.addCard(card1);
    hand.addCard(card2);
    hand.addCard(card3);
    assertEquals(12, hand.getTotal());
  }






}