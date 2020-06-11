public class Kata {
  public static int[] invert(int[] array) {
      for(int i = 0; i < array.length; i++){
           if(array[i]>0){
               array[i] =- array[i];
           }
           else if(array[i]<0){
               array[i] = Math.abs(array[i]);
           }

      }
      return array;
    }
}

//https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad/train/java