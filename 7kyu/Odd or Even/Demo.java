import static java.util.Arrays.stream;

public class Codewars {
  public static String oddOrEven (int[] array) {
   return stream(array).sum() % 2 > 0 ? "odd" : "even";
  }
}

//https://www.codewars.com/kata/5949481f86420f59480000e7/train/java