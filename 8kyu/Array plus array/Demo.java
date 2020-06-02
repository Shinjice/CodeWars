public class Sum {

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
     int sum = 0;
     for (int i = 0; i < arr1.length; i++){
       sum += arr1[i] ; 
     }

     for (int j = 0; j < arr2.length; j++){
       sum += arr2[j];
     }
     return sum;
   } 
}

//https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java