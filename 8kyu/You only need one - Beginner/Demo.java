public class Solution {

  public static boolean check(Object[] a, Object x) {
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(x)) {
                if (a[i]==x){
                    return true;
                }
            }
        }
        return false;
  }
}

//https://www.codewars.com/kata/57cc975ed542d3148f00015b/train/java
