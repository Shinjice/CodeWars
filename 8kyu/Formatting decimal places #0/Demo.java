import java.text.DecimalFormat;

public class Numbers
{
  public static double TwoDecimalPlaces(double number)
  {
    DecimalFormat df = new DecimalFormat("00.00");
    return Double.valueOf(df.format(number));
  }
}

//https://www.codewars.com/kata/5641a03210e973055a00000d/train/java