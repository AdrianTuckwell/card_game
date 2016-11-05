package cards;

public class Card
{

  private RankType rank;
  private SuitType suit;

  public Card(RankType rank, SuitType suit) {
    this.rank = rank;
    this.suit = suit;
  }

  public RankType getRank(){
    return this.rank;
  }

  public SuitType getSuit(){
    return this.suit;
  }

  public int getValue()
  {
      int value;
      switch (rank){
        case ACE:   value = 1;
            break;
        case TWO:   value = 2;
            break;
        case THREE: value = 3;
            break;
        case FOUR:  value = 4;
            break;
        case FIVE:  value = 5;
            break;
        case SIX:   value = 6;
            break;
        case SEVEN: value = 7;
            break;
        case EIGHT: value = 8;
            break;
        case NINE:  value = 9;
            break;
        case TEN:   value = 10;
            break;
        case JACK:  value = 10;
            break;
        case QUEEN: value = 10;
            break;
        case KING:  value = 10;
            break;
        default:    value = 0;
            break;
      }
    return value;
    }

  }
    

  


