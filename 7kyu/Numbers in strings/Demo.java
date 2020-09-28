class Solution{
    public static int solve(String s){
        int num = 0, res = 0; 
        for (int i = 0; i<s.length(); i++) { 
            if (Character.isDigit(s.charAt(i))) 
            num = num * 10 + (s.charAt(i)-'0'); 
            else { 
                res = Math.max(res, num); 
                num = 0; 
            } 
        } 
        return Math.max(res, num);
    }
}

//https://www.codewars.com/kata/59dd2c38f703c4ae5e000014/train/java