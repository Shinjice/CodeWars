public class Geometry{
  public static double squareArea(double A){
    double circum = A * 4;
    double radius = circum / 2 / Math.PI;
    return Math.round((radius*radius) * 100.0) / 100.0;
  }
}

//https://www.codewars.com/kata/5748838ce2fab90b86001b1a/train/java