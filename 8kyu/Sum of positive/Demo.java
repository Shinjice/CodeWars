public class Positive{

  public static int sum(int[] arr){
      int positive = 0;
      for (int i = 0; i < arr.length; i++){
            if(arr[i] > 0){positive += arr[i];}
        }
 return positive;     
  }
}

//https://www.codewars.com/kata/5715eaedb436cf5606000381/train/java