public class XO {
  public static boolean getXO (String str) {
    return str.toLowerCase().replace("x", "").length() == str.toLowerCase().replace("o", "").length();
  }
}

//https://www.codewars.com/kata/55908aad6620c066bc00002a/train/java