public class ReverseWords{
  public static String reverseWords(String str){
     String[] split = str.split(" ");
     String result = "";
     for (int i = split.length - 1; i >= 0; i--) {
       result += (split[i] + " ");
     }
     return result.trim();
   }
}

//https://www.codewars.com/kata/51c8991dee245d7ddf00000e/train/java