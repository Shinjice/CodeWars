public class Kata {
  public static String pofi(int n) {
    return (n % 4 > 1 ? "-" : "") + (n % 2 == 0 ? "1" : "i");
  }
}

//https://www.codewars.com/kata/5a97387e5ee396e70a00016d/train/java