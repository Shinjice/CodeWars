public class Kata {
  public static String rps(String p1, String p2) {
    return  p1 == "scissors" && p2 == "paper" ? "Player 1 won!":
            p1 == "rock" && p2 == "scissors" ? "Player 1 won!":
            p1 == "paper" && p2 == "rock" ? "Player 1 won!":
            p2 == "scissors" && p1 == "paper" ? "Player 2 won!":
            p2 == "rock" && p1 == "scissors" ? "Player 2 won!":
            p2 == "paper" && p1 == "rock" ? "Player 2 won!": "Draw!";
    }
}

//https://www.codewars.com/kata/5672a98bdbdd995fad00000f/train/java