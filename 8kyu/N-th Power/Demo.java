public class Kata {
  public static int nthPower(int[] array, int n) {
    return n >= array.length ? -1 : (int) Math.pow(array[n], n);
  }
}

//https://www.codewars.com/kata/57d814e4950d8489720008db/train/java