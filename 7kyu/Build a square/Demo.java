public class Kata {
  public static final String generateShape(int n) {
        String tmp = "";
        for (int i=0; i<n; i++){
            for (int j=0; j<n; j++){
                tmp += "+";
            }
            if(i<n-1) {
                tmp += "\n";
            }
        }
        return tmp;
    }
}

//https://www.codewars.com/kata/59a96d71dbe3b06c0200009c/train/java