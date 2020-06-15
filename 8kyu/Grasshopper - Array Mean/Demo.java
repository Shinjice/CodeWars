import java.util.Arrays;

public class GrassHopper {
    public static int findAverage(int[] nums) {
      return (int)Arrays.stream(nums).average().orElse(Double.NaN);
    }
}

//https://www.codewars.com/kata/55d277882e139d0b6000005d/train/java