public class Banjo {
  public static String areYouPlayingBanjo(String name) {
    if(name.charAt(0)=='r' || name.charAt(0)=='R'){
      return name + " plays banjo";
    }     
    return name + " does not play banjo";
  }
}

//https://www.codewars.com/kata/53af2b8861023f1d88000832/train/java