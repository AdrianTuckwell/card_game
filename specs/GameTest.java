import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class GameTest {

  Game game;
  Player player1;
  Player player2;
  Hand hand1;
  Hand hand2;
  Card card1;
  Card card2;
  Card card3;
  Card card4;
  Deck deck;

  @Before 
  public void before()
  {
    game = new Game();
    player1 = new Player("Ross");
    player2 = new Player("Dealer");
    hand1 = new Hand();
    hand2 = new Hand();
    card1 = new Card(RankType.ACE, SuitType.SPADES);
    card2 = new Card(RankType.ACE, SuitType.HEARTS);
    card3 = new Card(RankType.KING, SuitType.HEARTS);
    card4 = new Card(RankType.NINE, SuitType.HEARTS);
    deck = new Deck();
  }

  @Test
  public void hasNamePlayer1()
  {
    assertEquals("Ross", player1.getName());
  }

  @Test
  public void hasNamePlayer2()
  {
    assertEquals("Dealer", player2.getName());
  }

  @Test 
  public void testGameGetSize()
  {
    assertEquals(0, game.getSize());
  }

  @Test 
  public void testGameHasTwoPlayer()
  {
    game.addPlayer(player1);
    game.addPlayer(player2);
    assertEquals(2, game.getSize());   
  }

  @Test
  public void testHand1()
  {
    hand1.addCard(card1);
    hand1.addCard(card3);
    assertEquals(11, hand1.getTotal());
  }

  @Test
  public void testHand2()
  {
    hand2.addCard(card2);
    hand2.addCard(card4);
    assertEquals(10, hand2.getTotal());
  }





}