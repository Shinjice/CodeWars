public class Kata{

  public static int grow(int[] x){
     int temp = 1; 
     for (int i = 0; i < x.length; i++){
       temp = temp * x[i];
     }
     return temp; 
  }
}

//https://www.codewars.com/kata/57f780909f7e8e3183000078/train/java