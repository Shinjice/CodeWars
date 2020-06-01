import java.util.Arrays;

public class ZywOo {
  public static int[] take(int[] arr, int n) {
   
    if(arr.length == 0){
      int[] temp = {};
      return temp;
    } else {
      if(arr.length < n){ 
        n = arr.length; 
      }
    int[]temp2 = Arrays.copyOfRange(arr, 0, n);
    return temp2;
    }
  }
}

//https://www.codewars.com/kata/545afd0761aa4c3055001386/train/java