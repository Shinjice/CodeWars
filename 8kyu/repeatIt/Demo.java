public class RepeatIt {

  public static String repeatString(final Object toRepeat, final int n) {
    if(toRepeat instanceof String){
      return String.valueOf(toRepeat).repeat(n);
    }
    return "Not a string";
  }
  
}

//https://www.codewars.com/kata/557af9418895e44de7000053/train/java