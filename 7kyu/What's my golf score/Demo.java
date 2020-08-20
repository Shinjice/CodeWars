public class Kata {
  public static int golfScoreCalculator(String parList, String scoreList) {
        char[] par = parList.toCharArray();
        char[] score = scoreList.toCharArray();
        int parTotal = 0;
        int scoreTotal = 0;
        for (char output : par) {
            parTotal += Integer.valueOf(output);
        }
        for (char output : score) {
            scoreTotal += Integer.valueOf(output);
        }
        return scoreTotal-parTotal;
  }
}

//https://www.codewars.com/kata/59f7a0a77eb74bf96b00006a/train/java