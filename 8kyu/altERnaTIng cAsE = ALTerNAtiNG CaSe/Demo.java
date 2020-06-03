public class StringUtils {
  
  public static String toAlternativeString(String string) {
     String alter = "";
     for(int i = 0; i < string.length(); i++) {
       char temp = string.charAt(i);
       if (Character.isUpperCase(temp)) {
         char a = Character.toLowerCase(temp);
         alter += a;
       }
       else if (Character.isLowerCase(temp)) {
         char b = Character.toUpperCase(temp);
         alter += b;
       } else {
         alter += temp;
       }
      }
     return alter;
    }
}

//https://www.codewars.com/kata/56efc695740d30f963000557/train/java