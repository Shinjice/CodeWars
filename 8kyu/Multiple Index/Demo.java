import java.util.*;

public class ZywOo {
  public static int[] multipleOfIndex(int[] array) {
    ArrayList<Integer> temp = new ArrayList<Integer>();
    for(int i = 0; i < array.length; i++){
      if(i>0){
        if(array[i] % i == 0){
          temp.add(array[i]);
        }
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

//https://www.codewars.com/kata/5a34b80155519e1a00000009/train/java