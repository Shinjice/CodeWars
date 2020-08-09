class Solution{
    public static String solve(int n){
        String f0 = "0"; 
        String f1 = "01"; 
        String tmp;
        if(n==0){
          return "0";
        }
        for (int i=2; i<=n; i++) 
        { 
            tmp = f1; 
            f1 += f0; 
            f0 = tmp; 
        } 
  
        return f1; 
    }
}

//https://www.codewars.com/kata/5aa39ba75084d7cf45000008/train/java