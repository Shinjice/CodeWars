public class Kata {
  public static int rentalCarCost(int d) {
    return (d < 3)? d * 40:(d >= 3 && d < 7)? (d*40)-20: (d*40)-50;
  }
}

//https://www.codewars.com/kata/568d0dd208ee69389d000016/train/java