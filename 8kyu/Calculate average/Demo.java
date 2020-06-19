import java.util.Arrays;
public class Kata{
  public static double find_average(int[] array){
    return Arrays.stream(array).average().orElse(Double.NaN);
  }
}

//https://www.codewars.com/kata/57a2013acf1fa5bfc4000921/train/java