public class Kata {
  //solution("world");
  
  public static String solution(String str) {
    // Your code here...
    String temp = "";
    for(int i = str.length() - 1 ; i >= 0; i--){
    temp = temp + str.charAt(i);
    }
    
    return temp;
  }

}

//https://www.codewars.com/kata/5168bb5dfe9a00b126000018/train/java