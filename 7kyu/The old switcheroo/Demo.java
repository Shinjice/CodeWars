public class Kata {
  public static String vowel2Index(String s) {
    var result = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      result.append("aeiou".indexOf(s.charAt(i)) < 0 ? s.charAt(i) : i + 1 + "");
      }
    return result.toString();
  }
}

//https://www.codewars.com/kata/55d410c492e6ed767000004f/train/java