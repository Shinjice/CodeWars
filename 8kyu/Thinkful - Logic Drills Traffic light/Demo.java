public class TrafficLights {

  public static String updateLight(String current) {

    return current == "yellow" ? "red" : (current == "red" ? "green" : "yellow");
  }

}

//https://www.codewars.com/kata/58649884a1659ed6cb000072/train/java