public class Dinglemouse {
  public static int riders(final int[] stations) {
    int traveled = 0, riders = 1;
    for (int distance : stations) {
      if ((traveled += distance) > 100) {
        riders++;
        traveled = distance;
      }
    }
    return riders;
  }
}

//https://www.codewars.com/kata/5b18e9e06aefb52e1d0001e9/train/java