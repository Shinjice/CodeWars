public class Solution {
  public static int century(int number) {
    return (int) Math.round(0.49d + (number / 100d));
  }
}

//https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097/train/java