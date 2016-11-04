import static org.junit.Assert.*;
import org.junit.*;
import cards.*;

public class PlayerTest {

  Player player;

  @Before
  public void before()
  {
     player = new Player("Ross");
  }

  @Test
  public void hasName()
  {
    assertEquals("Ross", player.getName());
  }

}