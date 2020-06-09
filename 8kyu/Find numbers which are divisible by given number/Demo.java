import java.util.ArrayList;

public class EvenNumbers {
  public static int[] divisibleBy(int[] numbers, int divider) {
      ArrayList<Integer> temp = new ArrayList<Integer>();
      for(int i = 0; i < numbers.length; i++){
        if(numbers[i] % divider == 0){
        temp.add(numbers[i]);
        }
      }
      
      int[] temp2 = new int[temp.size()];
      for (int i=0; i < temp2.length; i++)
      {
          temp2[i] = temp.get(i).intValue();
      }
      return temp2;
    }
}

//https://www.codewars.com/kata/55edaba99da3a9c84000003b/train/java