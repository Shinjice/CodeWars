class Solution{
  public static int repeats(int [] arr){
        int total = 0;
        int doubleMinus = 0;
        for(int i = 0; i < arr.length; i++) {
            total += arr[i];
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j])
                    doubleMinus += arr[j];
            }
        }
  return total - doubleMinus * 2;
  }
}

//https://www.codewars.com/kata/59f11118a5e129e591000134/train/java