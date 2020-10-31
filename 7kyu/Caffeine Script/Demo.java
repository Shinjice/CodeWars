public class CaffeineBuzz {
  public static String caffeineBuzz(int n){
    return n % 12 == 0 ? "CoffeeScript" : n % 6 == 0 ? "JavaScript" : n % 3 == 0 ? "Java" : "mocha_missing!";
  }
}

//https://www.codewars.com/kata/5434283682b0fdb0420000e6/train/java