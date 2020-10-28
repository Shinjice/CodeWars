public class Dinglemouse {
  public static int kookaCounter(final String laughing) {
      return laughing.replace("a", "").replaceAll("h+", "1").replaceAll("H+", "1").length();
  }
}

//https://www.codewars.com/kata/58e8cad9fd89ea0c6c000258/train/java