public class Kata {

  public static String remove(String s, int n) {
        StringBuilder sb = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
                if (counter < n && String.valueOf(s.charAt(i)).equals("!")) {
                    counter = counter + 1;
                } else {
                    sb.append(s.charAt(i));
                }
        }
    return sb.toString();
    }
}

//https://www.codewars.com/kata/57faf7275c991027af000679/train/java