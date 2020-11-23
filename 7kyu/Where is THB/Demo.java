public class THB {
  public static String testing(String initial) {
    if(initial != null){
      return initial.replaceAll("[^tThHbB]", "");
    }
    return "";
  }
}

//https://www.codewars.com/kata/58d54d0914286c23820001e6/train/java