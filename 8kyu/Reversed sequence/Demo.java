public class Sequence{

  public static int[] reverse(int n){
      int[] temp = new int[n];
      int b = n;
      for (int i = 0; i < n ; i++){
        temp[i] = b;
        b--;
      }
      return temp;
    }

}

//https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java