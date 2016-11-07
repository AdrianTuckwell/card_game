package cards;

class Runner
{

  public static void main(String[] args)
  {
    Game game = new Game();
    Deck deck = new Deck();

    Player player1 = new Player("Ross");
    Player player2 = new Player("Dealer");


    String player1name = player1.getName();
    String player2name = player2.getName();

    System.out.println(player1name + " is playing " + player2name);

  }
}