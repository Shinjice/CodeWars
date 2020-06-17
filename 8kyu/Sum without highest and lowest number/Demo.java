import java.util.*;

public class Kata{
  public static int sum(int[] numbers){
      
      int temp = 0;
      if(numbers != null){
      Arrays.sort(numbers);
        for(int i = 0; i < numbers.length; i++){
            if(i != 0 && i != numbers.length-1){
            temp += numbers[i];
            }
        } 
      return temp;
      } 
    return 0;
  }
}

//https://www.codewars.com/kata/576b93db1129fcf2200001e6/train/java