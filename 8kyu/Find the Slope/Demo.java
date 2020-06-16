public class Slope{
  public String slope(int[] points){
    return points[2] - points[0] == 0 ? "undefined" :
    String.valueOf((points[3] - points[1]) / (points[2] - points[0]));
  }
}

//https://www.codewars.com/kata/55a75e2d0803fea18f00009d/train/java