import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class CardTest 
{

  Card card;
  
  @Before 
  public void before()
  {
    card = new Card(RankType.ACE, SuitType.SPADES);
  }

  @Test // 1 check the card type --------------
  public void testCanGetRank()
  {
    assertEquals(RankType.ACE, card.getRank());
  }

  @Test // 2 check the card suit --------------
  public void testCanGetSuit()
  {
    assertEquals(SuitType.SPADES, card.getSuit());
  }



}