public class Converter {
  public static float mpgToKPM(final float mpg) {
    double km = mpg * 1.609344;
    double liter = km /  4.54609188f;
    return (float)Math.round(liter * 100) / 100;
  }
}

//https://www.codewars.com/kata/557b5e0bddf29d861400005d/train/java