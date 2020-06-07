import java.util.*;

public class Maps {
  public static int[] map(int[] arr) {
        Map<Integer, Integer> m1 = new HashMap<Integer, Integer>();
        for(int i = 0; i < arr.length; i++){
            m1.put(i, arr[i]*2);
        }
        int [] temp = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            temp[i] = m1.get(i);
        }
        return temp;
    }
}

//https://www.codewars.com/kata/57f781872e3d8ca2a000007e/train/java