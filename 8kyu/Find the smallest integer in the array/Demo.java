import java.util.*;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
      Arrays.sort(args);
      return args[0];
    }
}

//https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java