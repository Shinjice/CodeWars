public class RemoveChars {
    public static String remove(String str) {
      String first = str.substring(1);
      return first.substring(0, first.length() - 1);
        
    }
}

//https://www.codewars.com/kata/56bc28ad5bdaeb48760009b0/train/java