public class Kata {
  public static String tripleTrouble(String one, String two, String three) {
  
    String temp = "";
    
    for(int i = 0; i<one.length(); i++){
        temp += one.charAt(i);
        temp += two.charAt(i);
        temp += three.charAt(i);
      } 
      return temp;
    }
}

//codewars.com/kata/5704aea738428f4d30000914/train/java