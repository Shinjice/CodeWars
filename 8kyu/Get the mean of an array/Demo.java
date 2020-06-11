import java.util.Arrays;

public class School{
  public static int getAverage(int[] marks){
		return (int) Arrays.stream(marks).average().orElse(Double.NaN);
	}
}

//https://www.codewars.com/kata/563e320cee5dddcf77000158/train/java