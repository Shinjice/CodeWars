public class BumpsTheRoad {
  public static String bumps(final String road) {
    return road.replace("_", "").length() > 15 ? "Car Dead" : "Woohoo!";
  }
}

//https://www.codewars.com/kata/57ed30dde7728215300005fa/train/java