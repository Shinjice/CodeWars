class Solution{
    public static int solve(int [] arr){
        int counter = 0;
        for(int i = 1; i < arr.length; i = i + 2){
          if(arr[i-1] == (arr[i] + 1)|| arr[i-1] == (arr[i] - 1)){
              counter++;
          }
        }
        return counter;
    }
}

//https://www.codewars.com/kata/5a3e1319b6486ac96f000049/train/java