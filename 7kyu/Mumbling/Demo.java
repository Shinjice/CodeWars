public class Accumul {
  public static String accum(String s) {
        StringBuilder a = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            a.append(s.toUpperCase().charAt(i));
            if (i > 0) {
                for (int j = 0; j < i; j++) {
                    a.append(s.toLowerCase().charAt(i));
                }
            }
            if(i != s.length()-1){
                a.append("-");
            }
        }
        return a.toString();
    }
}

//https://www.codewars.com/kata/5667e8f4e3f572a8f2000039/train/java