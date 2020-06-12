public class Kata {

  public static boolean feast(String beast, String dish) {
    
    return beast.charAt(0)==dish.charAt(0) && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1);
    
  }
  
}

//https://www.codewars.com/kata/5aa736a455f906981800360d/train/java