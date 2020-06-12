import java.util.Arrays;

public class SmashWords {

	public static String smash(String... words) {
    StringBuffer sb = new StringBuffer();
      for(int i = 0; i < words.length; i++) {
         sb.append(words[i] + " ");
      }
      String temp = sb.toString();
      return temp.trim();
  }
}

//https://www.codewars.com/kata/53dc23c68a0c93699800041d/train/java