public class Solution {
  public static boolean validatePin(String pin) {
    return pin.matches("\\d{4}|\\d{6}");
  }
}

//https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java