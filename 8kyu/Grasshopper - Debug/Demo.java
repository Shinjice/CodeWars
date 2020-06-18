public class GrassHopper {
    public static String weatherInfo(double temp) {
      return (temp = (temp - 32) * 5. / 9) + " is " + (temp > 0 ? "above " : "") + "freezing temperature";
    }
}

//https://www.codewars.com/kata/55cb854deb36f11f130000e1/train/java