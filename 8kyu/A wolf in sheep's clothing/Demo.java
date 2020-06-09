public class ZywOo {

  public static String warnTheSheep(String[] array) {
    for (int i=0; i<array.length; i++)
      if (array[array.length-1].equals("wolf")) return "Pls go away and stop eating my sheep";
      else if (array[i].equals("wolf")) return "Oi! Sheep number " + (array.length-i-1) + "! You are about to be eaten by a wolf!";
    return "";
  }
}

//https://www.codewars.com/kata/5c8bfa44b9d1192e1ebd3d15/train/java