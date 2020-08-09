class Solution{
    public static String solve(String s, int a, int b){
        StringBuilder c = new StringBuilder(s.substring(a, b<s.length() ? b+1 : s.length()));
        String d = c.reverse().toString();
        StringBuilder e = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            if(i == a && i <= b){
                e.append(d);
                i = b;
            } else {
                e.append(s.charAt(i));
            }
        }
        return e.toString();
    }
}

//https://www.codewars.com/kata/5a8d1c82373c2e099d0000ac/train/java