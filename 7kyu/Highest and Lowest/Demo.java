import static java.util.Arrays.stream;

public class Kata {
  public static String highAndLow(String numbers) {
    var stats = stream(numbers.split("\\s")).mapToInt(Integer::parseInt).summaryStatistics();
    return stats.getMax() + " " + stats.getMin();
  }
}

//https://www.codewars.com/kata/554b4ac871d6813a03000035/train/java