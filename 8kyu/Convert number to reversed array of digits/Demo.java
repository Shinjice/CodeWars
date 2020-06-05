public class Kata {
  public static int[] digitize(long n) {
        String temp =  String.valueOf(n);
        int[] temp1 = new int[temp.length()];
        int temp3 = 0;
        for (int i = temp.length() - 1; i >= 0; i--){
            temp1[i] = Integer.parseInt(String.valueOf(temp.charAt(temp3++)));            
        }
        return temp1;
    }
}

//https://www.codewars.com/kata/5583090cbe83f4fd8c000051/train/java