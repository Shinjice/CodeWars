import java.util.Arrays;
public class Kata {

  public int min(int[] list) {
    Arrays.sort(list);
    return list[0];
  }
  
  public int max(int[] list) {
    Arrays.sort(list);
    return list[list.length-1];
  }
}

//https://www.codewars.com/kata/577a98a6ae28071780000989/train/java