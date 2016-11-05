import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class PlayerTest {

  Player player1;
  Player player2;

  @Before
  public void before()
  {
     player1 = new Player("Ross");
     player2 = new Player("Bobby");
  }

  @Test
  public void hasNamePlayer1()
  {
    assertEquals("Ross", player1.getName());
  }

  @Test
  public void hasNamePlayer2()
  {
    assertEquals("Bobby", player2.getName());
  }



}