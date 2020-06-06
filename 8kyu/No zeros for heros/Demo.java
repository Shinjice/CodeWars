public class NoBoring {
    public static int noBoringZeros(int n) {
        String temp = String.valueOf(n);
        for(int i = temp.length() - 1; i >= 0; i--){
          if(temp.charAt(i) == '0'){
            temp = temp.substring(0, temp.length() - 1);
          } else {
            return Integer.parseInt(temp);
          }
        }
        return 0;    
    }
}

//https://www.codewars.com/kata/570a6a46455d08ff8d001002/train/java