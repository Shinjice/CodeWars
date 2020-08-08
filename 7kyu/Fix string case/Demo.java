public class Solution {
    public static String solve(final String str) {
        int counterUp = 0;
        int counterDown = 0;
        for(int i = 0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                counterUp++;
            }
            if(Character.isLowerCase(str.charAt(i))){
                counterDown++;
            }
        }
        System.out.println(counterDown + " " + counterUp);
        return counterUp > counterDown ? str.toUpperCase() : str.toLowerCase(); //your code here
    }
}

//https://www.codewars.com/kata/5b180e9fedaa564a7000009a/train/java