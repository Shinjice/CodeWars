public class Solution {
    public static String replace(final String s) {
          
        StringBuilder sb = new StringBuilder();
        
          for (int i = 0; i < s.length(); i++) {
 
                  if (String.valueOf(s.charAt(i)).toLowerCase().equals("a") ||
                      String.valueOf(s.charAt(i)).toLowerCase().equals("e") ||
                      String.valueOf(s.charAt(i)).toLowerCase().equals("i") ||
                      String.valueOf(s.charAt(i)).toLowerCase().equals("o") ||
                      String.valueOf(s.charAt(i)).toLowerCase().equals("u")) {
                    sb.append("!");
                  }
                  
                  else {
                      sb.append(s.charAt(i));
                  }
          }
      return sb.toString();
      }
}

//https://www.codewars.com/kata/57fb09ef2b5314a8a90001ed/train/java