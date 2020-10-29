
public class Circle {
  public static double area(double radius) {
    if(radius > 0){
      return Math.PI * radius * radius;
    }
    throw new IllegalArgumentException();
  }
}

//https://www.codewars.com/kata/537baa6f8f4b300b5900106c/train/java