public class Consonants {
  public static int getCount(String str) {
    return str.replaceAll("[^a-zA-Z]|[aeiou]", "").length();
  }
}

//https://www.codewars.com/kata/564e7fc20f0b53eb02000106/train/java