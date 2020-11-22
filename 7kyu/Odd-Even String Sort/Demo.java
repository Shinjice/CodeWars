public class OddEvenSort {
  public static String sortMyString(String s) {
    StringBuilder odd = new StringBuilder(); 
    StringBuilder even = new StringBuilder();
    for (int i = 0; i < s.length(); i++) {
      (i % 2 == 0 ? even : odd).append(s.charAt(i));
    }
    return even.append(" ").append(odd).toString();
  }
}

//https://www.codewars.com/kata/580755730b5a77650500010c/train/java