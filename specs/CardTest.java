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
  // @Ignore
  public void testCanGetRank()
  {
    assertEquals(RankType.ACE, card.getRank());
  }

  @Test // 2 check the card suit --------------
  // @Ignore
  public void testCanGetSuit()
  {
    assertEquals(SuitType.SPADES, card.getSuit());
  }

  @Test // 3 check card value --------------
  public void testGetValue()
  {
    assertEquals(1, card.getValue());
  }


}