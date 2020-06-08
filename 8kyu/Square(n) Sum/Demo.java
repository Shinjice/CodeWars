public class Kata{
  public static int squareSum(int[] n){
      int temp1 = 0;
      for(int i = 0 ; i < n.length ; i++){
         int temp = (int) Math.pow(n[i], 2);
         temp1 += temp;
      }
    return temp1;
   }
 }  

//https://www.codewars.com/kata/515e271a311df0350d00000f/train/java