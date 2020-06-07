public class Calculate {
  public static String bmi(double weight, double height) {
    double bmi = weight / Math.pow(height, 2d);
    if (bmi <= 18.5){
      return "Underweight";}
    if (bmi <= 25.0){
      return "Normal";}
    if (bmi <= 30.0){
      return "Overweight";}
    else {
    return "Obese";}
  }
}

//https://www.codewars.com/kata/57a429e253ba3381850000fb/train/java