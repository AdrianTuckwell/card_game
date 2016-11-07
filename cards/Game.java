package cards;
import java.util.*;

public class Game {

  private ArrayList<Player> game; 


  // Game constructor ---------------------
  public Game()
  {
    this.game = new ArrayList<Player>();
  } 

  // Return the game size -------------------
  public int getSize()
  {
      return game.size();   
  }

  // Add player to game ---------------------
  public void addPlayer(Player player)
  {
    game.add(player);
  }

}