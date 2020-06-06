public class Solution {
    public static int areaOrPerimeter (int l, int w) {
      if (l == w) return l * w;
      return l * 2 + w * 2;
    }
}

//https://www.codewars.com/kata/5ab6538b379d20ad880000ab/train/java
