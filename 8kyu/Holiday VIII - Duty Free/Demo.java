public class Kata {

  public static int dutyFree(int normPrice, int discount, int hol) {
    return (int)(hol / ((double)normPrice * ((double)discount / 100)));  
  }

}

//https://www.codewars.com/kata/57e92e91b63b6cbac20001e5/train/java