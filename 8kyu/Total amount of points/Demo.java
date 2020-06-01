public class TotalPoints {
  
    public static int points(String[] games) {
      int points = 0;

        for (int i = 0; i < games.length ; i++) {

            int score1 = Integer.parseInt(games[i].substring(0, 1));
            int score2 = Integer.parseInt(games[i].substring(2, 3));

            if (score1 > score2) {
                points += 3;
            }
            if (score1 == score2) {
                points += 1;
            }
        }
      return points;
    }
}

//https://www.codewars.com/kata/5bb904724c47249b10000131/train/java