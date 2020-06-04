public class Kata {
  
  public static boolean divide(int weight) {
    // your code here
    if(weight>2){
      int temp = weight - 2;
      if(temp % 2 == 0){
        return true;
      }
    }
    return false;
  }
}

//https://www.codewars.com/kata/55192f4ecd82ff826900089e/train/java