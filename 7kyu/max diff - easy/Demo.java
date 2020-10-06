import java.util.*;
public class Kata {

  public static int maxDiff(int[] lst) {
    if(lst.length == 0){
      return 0;
    }
    Arrays.sort(lst);
    return lst[lst.length-1] - lst[0];
  }
}

//https://www.codewars.com/kata/588a3c3ef0fbc9c8e1000095/train/java