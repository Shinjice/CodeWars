import java.util.ArrayList;

public final class PokerHand {
  public static boolean IsStraight(ArrayList<Integer> cards) {
      for (int card : cards) {
      if (cards.contains(2) && cards.contains(5) || cards.contains(card + 1) && cards.contains(card + 2) && cards.contains(card + 3) && cards.contains(card + 4)) {
        return true;
      }
    }
    return false;
  }
}

//https://www.codewars.com/kata/582afcadac2d9baa0900054c/train/java